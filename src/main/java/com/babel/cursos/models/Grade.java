package com.babel.cursos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
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
}
