package com.mago;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/controller")
public class MyController {

    public MyController() {
    }

    @GET
    public String getName() {
        return "Pepe";
    }

    @GET
    @Path("person")
//    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {
        return new Person("Alenajdro", "Leoz");
    }
}
