package config;

import servicios.CancionesServices;
import servicios.EchoServices;
import servicios.UsuariosServices;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("api")
public class ApplicationConfig extends Application {


    //Control + O
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> recursos = new HashSet<>();
        recursos.add(EchoServices.class);
        recursos.add(UsuariosServices.class);
        recursos.add(CancionesServices.class);
        return recursos;
    }
}
