package com.babel.cursos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


public class Teacher {
    @JsonIgnore
    private static int lastID;
    @JsonIgnore
    private int id;
    private String name;
    private String lastName;
    private String urlLinkedin;

    static {
        lastID = 1;
    }

    public Teacher(){
        id = lastID++;
    }

    public Teacher(String name, String lastName, String urlLinkedin) {
        this.id = lastID++;
        this.name = name;
        this.lastName = lastName;
        this.urlLinkedin = urlLinkedin;
    }

    public void setId(int id) {
        if (id != lastID+1){
            this.id = lastID++;
        } else {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUrlLinkedin() {
        return urlLinkedin;
    }

    public void setUrlLinkedin(String urlLinkedin) {
        this.urlLinkedin = urlLinkedin;
    }
}
