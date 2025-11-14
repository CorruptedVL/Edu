package mg.dvo_ran;

import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;
import mg.dvo_ran.web.GeometryController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometryControllerTest {

    private final GeometryController controller = new GeometryController();

    private MultivaluedMap<String, String> mapOf(String... kv) {
        MultivaluedMap<String, String> map = new MultivaluedHashMap<>();
        for (int i = 0; i < kv.length; i += 2) {
            map.add(kv[i], kv[i + 1]);
        }
        return map;
    }


    @Test
    void rectangleArea_10x20_shouldBe200() {
        MultivaluedMap<String, String> params = mapOf("a", "10", "b", "20");

        double result = controller.compute("rectangle", params, EventType.AREA);

        assertEquals(200.0, result, 1e-9);
    }

    @Test
    void rectanglePerimeter_10x20_shouldBe60() {
        MultivaluedMap<String, String> params = mapOf("a", "10", "b", "20");

        double result = controller.compute("rectangle", params, EventType.PERIMETER);

        assertEquals(60.0, result, 1e-9);
    }

    @Test
    void triangle_3_4_5_areaShouldBe6() {
        MultivaluedMap<String, String> params = mapOf("a", "3", "b", "4", "c", "5");

        double result = controller.compute("triangle", params, EventType.AREA);

        assertEquals(6.0, result, 1e-9);
    }

    @Test
    void missingParam_shouldThrowBadRequest() {
        MultivaluedMap<String, String> params = mapOf();

        BadRequestException ex = assertThrows(
                BadRequestException.class,
                () -> controller.compute("circle", params, EventType.AREA)
        );
    }

    @Test
    void invalidNumber_shouldThrowBadRequest() {
        MultivaluedMap<String, String> params = mapOf("radius", "abc");

        BadRequestException ex = assertThrows(
                BadRequestException.class,
                () -> controller.compute("circle", params, EventType.AREA)
        );
    }

    @Test
    void unknownShape_shouldThrowBadRequest() {
        MultivaluedMap<String, String> params = mapOf("side", "10");

        BadRequestException ex = assertThrows(
                BadRequestException.class,
                () -> controller.compute("pentagon", params, EventType.AREA)
        );
    }

}
