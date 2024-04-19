package com.babel.cursos.services;

import com.babel.cursos.models.Grade;
import com.babel.cursos.models.GradeListDTO;
import com.babel.cursos.models.Modality;
import com.babel.cursos.models.Student;
import com.babel.cursos.repository.IGradesDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradesService implements IGradesService {
    private static final Logger logger = LoggerFactory.getLogger(GradesService.class);

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
        logger.info("LLAMADA A RECIBIR LISTA CURSOS");
        List<Grade> listGrades = new ArrayList<>(gradesDB.getListGrades().values());
        List<GradeListDTO> listGradesDTO = new ArrayList<>();

        for (Grade grade: listGrades){
            GradeListDTO gradeListDTO = new GradeListDTO();
            gradeListDTO.setId(grade.getId());
            gradeListDTO.setName(grade.getName());
            gradeListDTO.setArea(grade.getArea());
            gradeListDTO.setPrice(grade.getPrice());
            gradeListDTO.setNumHours(grade.getNumHours());
            gradeListDTO.setModality(grade.getModality());
            listGradesDTO.add(gradeListDTO);
        }

        return listGradesDTO;
    }
    @Override
    public Grade getGrade(int idGrade) {
        Grade grade = gradesDB.getGrade(idGrade);
        logger.info("LLAMADA A RECIBIR EL CURSO: " + " \nID: " + grade.getId() + " Nombre: " + grade.getName());
        logger.debug("Lista alumnos: " + grade.getStudents().toString());
        return grade;
    }

    @Override
    public boolean addStudent(int idGrade, Student student) {
        logger.info("LLAMADA A INTRODUCIR ALUMNO: " + "\nDNI: " + student.getDni() + " Nombre: " + student.getName());
        return gradesDB.addStudent(idGrade,student);
    }
}
