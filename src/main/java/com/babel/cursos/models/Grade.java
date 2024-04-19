package com.babel.cursos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
public class Grade {
    @JsonIgnore
    private static int lastID;
    private int id;
    private String name;
    private String area;
    private int numHours;
    private Modality modality;
    private double price;
    private Date enrollmentPeriod;
    private Boolean certification;
    private String location;
    private String address;
    private List<Teacher> teachers;
    private Date startDate;
    private Date endDate;
    @JsonIgnore
    private Set<Student> students;

    static {
        lastID = 1;
    }

    public Grade(){
        id = lastID++;
    }

    public Grade(String name, String area, int numHours, Modality modality, double price, Date enrollmentPeriod, Boolean certification, String location, String address, List<Teacher> teachers, Date startDate, Date endDate, Set<Student> students) {
        this.id = lastID++;
        this.name = name;
        this.area = area;
        this.numHours = numHours;
        this.modality = modality;
        this.price = price;
        this.enrollmentPeriod = enrollmentPeriod;
        this.certification = certification;
        this.location = location;
        this.address = address;
        this.teachers = teachers;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = students;
    }

    public boolean addStudent(Student student){
        return students.add(student);
    }
}
