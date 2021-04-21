package servicios;

import javax.ws.rs.*;

@Path("echo")
public class EchoServices {

    //api/echo/index
    @GET
    @Path("index")
    public String index(@QueryParam("param") String param, @QueryParam("age") String age){
        return "Hola "+param+", tienes "+age+" años";
    }

    @GET
    @Path("alter/search/{id}/name/{name}")
    public String alter(@PathParam("id") String id, @PathParam("name") String name){
        return "Usted esta buscando "+id+ " "+name;
    }


    @POST
    @Path("post")
    public String post(@FormParam("param1") String param1){
        return "Post done: "+param1;
    }

}
