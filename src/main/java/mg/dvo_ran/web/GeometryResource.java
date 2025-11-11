package mg.dvo_ran.web;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import mg.dvo_ran.EventType;

@Path("/geometry")
public class GeometryResource {

    @Inject
    GeometryController controller;

    @GET
    @Path("/area/{shape}")
    @Produces(MediaType.TEXT_PLAIN)
    public String area(@PathParam("shape") String shapeName,
                       @Context UriInfo uriInfo) {

        double value = controller.compute(
                shapeName,
                uriInfo.getQueryParameters(),
                EventType.AREA
        );
        return "Area" + shapeName.toLowerCase() + " = " + value;
    }

    @GET
    @Path("/perimeter/{shape}")
    @Produces(MediaType.TEXT_PLAIN)
    public String perimeter(@PathParam("shape") String shapeName,
                            @Context UriInfo uriInfo) {

        double value = controller.compute(
                shapeName,
                uriInfo.getQueryParameters(),
                EventType.PERIMETER
        );
        return "Perimeter " + shapeName.toLowerCase() + " = " + value;
    }
}
