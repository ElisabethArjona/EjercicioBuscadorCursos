package com.babel.cursos.repository;

import com.babel.cursos.models.Grade;
import com.babel.cursos.models.Modality;
import com.babel.cursos.models.Student;
import com.babel.cursos.models.Teacher;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class GradesDB implements IGradesDB {

    Map<Integer,Grade> gradesList = new HashMap<>();

    @Override
    public void initDB() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Elisabeth","Arjona","linkedin.com"));
        Grade grade1 = new Grade("Back End Spring","Spain",120, Modality.ONLINE,180.50,null,true,"Barcelona","Rambla 200",teachers,null,null,new HashSet<>());
        Grade grade2 = new Grade("Front End Angular","Spain",200, Modality.PRESENCIAL,200,null,true,"Malaga","Carlos Haya 150",teachers,null,null,new HashSet<>());
        Grade grade3 = new Grade("Mokito","Spain",25, Modality.PRESENCIAL,25.80,null,false,"Madrid","Gran Vía 80",teachers,null,null,new HashSet<>());
        Grade grade4 = new Grade("QA","Spain",30, Modality.MIXTO,40,null,false,"Sevilla","Sierpes 50",teachers,null,null,new HashSet<>());

        gradesList.put(grade1.getId(),grade1);
        gradesList.put(grade2.getId(),grade2);
        gradesList.put(grade3.getId(),grade3);
        gradesList.put(grade4.getId(),grade4);
    }

    @Override
    public Map<Integer,Grade> getListGrades() {
        return gradesList;
    }

    @Override
    public Grade getGrade(int id) {
        return gradesList.get(id);
    }

    @Override
    public void addStudent(int id,Student student) {
        Grade grade = gradesList.get(id);
        grade.addStudent(student);
    }

}
