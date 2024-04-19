package com.babel.cursos.services;

import com.babel.cursos.models.Grade;
import com.babel.cursos.models.GradeListDTO;
import com.babel.cursos.models.Modality;
import com.babel.cursos.models.Student;
import com.babel.cursos.repository.IGradesDB;

import java.util.ArrayList;
import java.util.List;

public class GradesService implements IGradesService {

    private final IGradesDB gradesDB;

    public GradesService(IGradesDB gradesDB) {
        this.gradesDB = gradesDB;
    }

    @Override
    public void initDB() {
        gradesDB.initDB();
    }

    @Override
    public List<GradeListDTO> getCompleteList() {
        List<Grade> listGrades = new ArrayList<>(gradesDB.getListGrades().values());
        List<GradeListDTO> listGradesDTO = new ArrayList<>();

        for (Grade grade: listGrades){
            GradeListDTO gradeListDTO = new GradeListDTO();
            gradeListDTO.setId(grade.getId());
            gradeListDTO.setNombre(grade.getName());
            gradeListDTO.setArea(grade.getArea());
            gradeListDTO.setPrecio(grade.getPrice());
            gradeListDTO.setNumHoras(grade.getNumHours());
            gradeListDTO.setModality(grade.getModality());
            listGradesDTO.add(gradeListDTO);
        }

        return listGradesDTO;
    }
    @Override
    public Grade getGrade(int idGrade) {
        return gradesDB.getGrade(idGrade);
    }

    @Override
    public boolean addStudent(int idGrade, Student student) {
        return gradesDB.addStudent(idGrade,student);
    }
}
