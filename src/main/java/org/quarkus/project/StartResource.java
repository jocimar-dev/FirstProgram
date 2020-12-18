package org.quarkus.project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/first")
public class StartResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Teste Primeiro Programa Quarkus";
    }
}