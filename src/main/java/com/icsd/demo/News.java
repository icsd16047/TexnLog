package com.icsd.demo;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="news")
public class News implements Serializable{
    
    private static final long serialVersionUID = 1L;

    
    @XmlAttribute(name="id")
    private int id;

    @XmlElement(name = "title")
    private String title;
    
    @XmlElement(name = "periexomeno")
    private String periexomeno;
    
    @XmlElement(name = "imerominiaDimiourgias")
    private Date imerominiaDimiourgias;
    
    @XmlElement(name = "imerominiaDimosieusis")
    private Date imerominiaDimosieusis;
    
    @XmlElement(name = "state")
    private NewsState state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getImerominiaDimosieusis() {
        return imerominiaDimosieusis;
    }

    public void setImerominiaDimosieusis(Date imerominiaDimosieusis) {
        this.imerominiaDimosieusis = imerominiaDimosieusis;
    }

    public NewsState getState() {
        return state;
    }

    public void setState(NewsState state) {
        this.state = state;
    }
    
    
    
}
