package com.babel.cursos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class Student {
    @JsonIgnore
    private static int lastID;
    @JsonIgnore
    private int id;
    private String name;
    private String lastName;
    private String dni;

    static {
        lastID = 1;
    }

    public Student(){
        id = lastID++;
    }

    public Student(String name, String lastName, String dni) {
        this.id = lastID++;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id != lastID+1){
            this.id = lastID++;
        } else {
            this.id = id;
        }
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(dni, student.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dni);
    }
}
