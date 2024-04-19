package com.babel.cursos.repository;

import com.babel.cursos.models.Grade;
import com.babel.cursos.models.Student;

import java.util.Map;

public interface IGradesDB {

    void initDB();

    Map<Integer,Grade> getListGrades();

    Grade getGrade(int id);

    void addStudent(int id,Student student);

}
