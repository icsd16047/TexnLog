package com.icsd.demo;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "comments")
public class Comments {
    
    @XmlElement(name="comments")
    private ArrayList<Comment> comments;
    
    public ArrayList<Comment> getComments(){
        return comments;
    }
    
    public void setComments(ArrayList<Comment> comments){
        this.comments = comments;
    }
    
}
