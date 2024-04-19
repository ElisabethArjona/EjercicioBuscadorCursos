package com.babel.cursos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
public class GradeOnlineDTO extends Grade {
    private int id;
    private String name;
    private String area;
    private int numHours;
    private Modality modality;
    private double price;
    private Date enrollmentPeriod;
    private Boolean certification;
    private List<Teacher> teachers;
    @JsonIgnore
    private String location;
    @JsonIgnore
    private String address;
    private Date startDate;
    private Date endDate;
    @JsonIgnore
    private Set<Student> students;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GradeOnlineDTO that = (GradeOnlineDTO) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getArea() {
        return area;
    }

    @Override
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public int getNumHours() {
        return numHours;
    }

    @Override
    public void setNumHours(int numHours) {
        this.numHours = numHours;
    }

    @Override
    public Modality getModality() {
        return modality;
    }

    @Override
    public void setModality(Modality modality) {
        this.modality = modality;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Date getEnrollmentPeriod() {
        return enrollmentPeriod;
    }

    @Override
    public void setEnrollmentPeriod(Date enrollmentPeriod) {
        this.enrollmentPeriod = enrollmentPeriod;
    }

    @Override
    public Boolean getCertification() {
        return certification;
    }

    @Override
    public void setCertification(Boolean certification) {
        this.certification = certification;
    }

    @Override
    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public Date getStartDate() {
        return startDate;
    }

    @Override
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public Date getEndDate() {
        return endDate;
    }

    @Override
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public Set<Student> getStudents() {
        return students;
    }

    @Override
    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
}
