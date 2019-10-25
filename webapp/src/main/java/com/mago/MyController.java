package com.mago;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {
        return new Person("Alejandro", "Ezequiel");
    }

    @GET
    @Path("person/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("name") String name) {
        return new Person(name, "Ezequiel");
    }
}
