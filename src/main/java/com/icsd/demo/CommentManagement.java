package com.icsd.demo;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
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

import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "comments")
@Path("/comments")
public class CommentManagement {
    
    private static HashMap<Integer, Comment> MyCommentDB = new HashMap<>();
    
    @GET
    @Produces("application/json")
    public Comments getAllComments(){
        Comments comments = new Comments();
        comments.setComments(new ArrayList<>(MyCommentDB.values()));
        return comments;
    }
    
    @POST
    @Consumes("application/json")
    public Response createComment(Comment comment) throws URISyntaxException{
        if (comment.getPeriexomeno()== null){
            return Response.status(Response.Status.NOT_ACCEPTABLE)
                    .entity("Comment does not contain text")
                    .build();
        }
        
       
        //stin arxi to comment einai apla dimiourgimeno kai oxi approved 
        comment.setCommentstate(CommentState.CREATED);
        comment.setImerominiaDimiourgias(new Date());
        /*
        TODO: tha pairnei automata to onoma tou xristi
        */
        //tha pairnei automata
        
        //theloume na auxisoume kata 1 to id tou neou xristi (plithos xristwn + 1)
        comment.setId(MyCommentDB.values().size() + 1);
        //prosthetoume sto map ton neo xristi
        MyCommentDB.put(comment.getId(), comment);
        return Response.status(Response.Status.CREATED)
                .entity("Comment Created!")
                .build();
    }
    
    
    
    
}
