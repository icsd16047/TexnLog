package com.icsd.demo;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="comment")
public class Comment implements Serializable{
     private static final long serialVersionUID = 1L;

    
    @XmlAttribute(name="id")
    private int id;
    
    @XmlElement(name = "periexomeno")
    private String periexomeno;
    
    @XmlElement(name = "imerominiaDimiourgias")
    private Date imerominiaDimiourgias;
    
    @XmlElement(name = "creator")
    private String creator;
    
    @XmlElement(name = "commentstate")
    private CommentState commentstate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeriexomeno() {
        return periexomeno;
    }

    public void setPeriexomeno(String periexomeno) {
        this.periexomeno = periexomeno;
    }

    public Date getImerominiaDimiourgias() {
        return imerominiaDimiourgias;
    }

    public void setImerominiaDimiourgias(Date imerominiaDimiourgias) {
        this.imerominiaDimiourgias = imerominiaDimiourgias;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public CommentState getCommentstate() {
        return commentstate;
    }

    public void setCommentstate(CommentState commentstate) {
        this.commentstate = commentstate;
    }
    
    
    
}
