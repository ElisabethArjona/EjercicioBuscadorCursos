package com.babel.cursos.services;

import com.babel.cursos.models.Grade;
import com.babel.cursos.models.GradeListDTO;
import com.babel.cursos.models.Modality;
import com.babel.cursos.models.Student;

import java.util.List;

public interface IGradesService {
    void initDB();
    List<GradeListDTO> getCompleteList();
    Grade getGrade(int idGrade);
    boolean addStudent(int idGrade, Student student);
}
