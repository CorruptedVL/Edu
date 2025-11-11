package mg.dvo_ran.web;

import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.*;

@Provider
public class BadRequestMapper implements ExceptionMapper<BadRequestException> {

    @Override
    public Response toResponse(BadRequestException ex) {
        String message = ex.getMessage();
        if (message == null || message.isBlank()) {
            message = "Некорректный запрос";
        }

        return Response.status(Response.Status.BAD_REQUEST)
                .type(MediaType.TEXT_PLAIN)
                .entity(message)
                .build();
    }
}
