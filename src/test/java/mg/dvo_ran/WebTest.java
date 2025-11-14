package mg.dvo_ran;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
class WebTest {


    private void addParams(RequestSpecification spec, String... params) {
        for (int i = 0; i < params.length; i += 2) {
            String name = params[i];
            String value = params[i + 1];
            spec.queryParam(name, value);
        }
    }

    private void assertAreaOk(String shape, String expectedBody, String... params) {
        RequestSpecification spec = given();
        addParams(spec, params);

        spec.when()
                .get("/geometry/area/" + shape)
                .then()
                .statusCode(200)
                .body(equalTo(expectedBody));
    }

    private void assertPerimeterOk(String shape, String expectedBody, String... params) {
        RequestSpecification spec = given();
        addParams(spec, params);

        spec.when()
                .get("/geometry/perimeter/" + shape)
                .then()
                .statusCode(200)
                .body(equalTo(expectedBody));
    }

    private void assertBadRequest(String path, String... params) {
        RequestSpecification spec = given();
        addParams(spec, params);

        spec.when()
                .get(path)
                .then()
                .statusCode(400);
    }


    @Test
    void circleAreaOk() {
        assertAreaOk(
                "circle",
                "Area of circle = 3.15",
                "radius", "1.0"
        );
    }

    @Test
    void rectAreaOk() {
        assertAreaOk(
                "rectangle",
                "Area of rectangle = 200.0",
                "a", "10.0",
                "b", "20.0"
        );
    }

    @Test
    void squareAreaOk() {
        assertAreaOk(
                "square",
                "Area of square = 25.0",
                "side", "5.0"
        );
    }

    @Test
    void triangleAreaOk() {
        assertAreaOk(
                "triangle",
                "Area of triangle = 6.0",
                "a", "3.0", "b", "4.0", "c", "5.0"
        );
    }

    @Test
    void ellipseAreaOk() {
        assertAreaOk(
                "ellipse",
                "Area of ellipse = 18.85",
                "rMin", "2.0", "rMax", "3.0"
        );
    }


    @Test
    void circleAreaMissingParam() {
        assertBadRequest("/geometry/area/circle");
    }

    @Test
    void circleAreaInvalidNumber() {
        assertBadRequest(
                "/geometry/area/circle",
                "radius", "abc"
        );
    }

    @Test
    void circleAreaNegative() {
        assertBadRequest(
                "/geometry/area/circle",
                "radius", "-1.0"
        );
    }

    @Test
    void rectAreaMissingParam() {
        assertBadRequest(
                "/geometry/area/rectangle",
                "a", "10.0"
        );
    }

    @Test
    void rectAreaInvalidNumber() {
        assertBadRequest(
                "/geometry/area/rectangle",
                "a", "десять", "b", "20.0"
        );
    }

    @Test
    void triangleAreaMissingParam() {
        assertBadRequest(
                "/geometry/area/triangle",
                "a", "3.0", "b", "4.0"
        );
    }

    @Test
    void triangleAreaInvalidInequality() {
        assertBadRequest(
                "/geometry/area/triangle",
                "a", "1.0", "b", "2.0", "c", "3.0"
        );
    }

    @Test
    void ellipseAreaInvalidAxes() {
        assertBadRequest(
                "/geometry/area/ellipse",
                "rMin", "-1.0", "rMax", "3.0"
        );
    }

    @Test
    void areaUnknownShape() {
        assertBadRequest(
                "/geometry/area/pentagon",
                "side", "10.0"
        );
    }


    @Test
    void circlePerimeterOk() {
        assertPerimeterOk(
                "circle",
                "Perimeter of circle = 6.29",
                "radius", "1.0"
        );
    }

    @Test
    void rectPerimeterOk() {
        assertPerimeterOk(
                "rectangle",
                "Perimeter of rectangle = 60.0",
                "a", "10.0", "b", "20.0"
        );
    }

    @Test
    void squarePerimeterOk() {
        assertPerimeterOk(
                "square",
                "Perimeter of square = 20.0",
                "side", "5.0"
        );
    }

    @Test
    void trianglePerimeterOk() {
        assertPerimeterOk(
                "triangle",
                "Perimeter of triangle = 12.0",
                "a", "3.0", "b", "4.0", "c", "5.0"
        );
    }

    @Test
    void trapezoidPerimeterOk() {
        assertPerimeterOk(
                "trapezoid",
                "Perimeter of trapezoid = 18.0",
                "t1", "3.0", "t2", "4.0", "t3", "5.0", "t4", "6.0"
        );
    }


    @Test
    void trapezoidPerimeterMissingParam() {
        assertBadRequest(
                "/geometry/perimeter/trapezoid",
                "t1", "3.0", "t2", "4.0", "t3", "5.0"
        );
    }
}
