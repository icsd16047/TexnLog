package com.icsd.demo;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "users")
@Path("/users")
public class UserManagement {
    
    private static HashMap<Integer, User> MyDB = new HashMap<>();
    
    @GET
    @Produces("application/json")
    public Users getAllUsers(){
        Users users = new Users();
        users.setUsers(new ArrayList<>(MyDB.values()));
        return users;
    }
    
    @POST
    @Consumes("application/json")
    public Response createUser(User user) throws URISyntaxException{
        if (user.getUsername() == null || user.getPassword()==null){
            return Response.status(Response.Status.NOT_ACCEPTABLE)
                    .entity("Username or password missing")
                    .build();
        }
        //theloume na auxisoume kata 1 to id tou neou xristi (plithos xristwn + 1)
        user.setId(MyDB.values().size() + 1);
        //prosthetoume sto map ton neo xristi
        MyDB.put(user.getId(), user);
        return Response.status(Response.Status.CREATED)
                .entity("User Created!")
                .build();
    }
    
    //dokimistaki eisagwgi xristwn
    static
    {
        User admin = new User();
        admin.setId(1);
        admin.setUsername("admin");
        admin.setPassword("admin");
        
        MyDB.put(admin.getId(), admin);
    }
    
}