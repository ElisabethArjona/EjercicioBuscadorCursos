package com.babel.cursos.controllers;

import com.babel.cursos.models.*;
import com.babel.cursos.services.IGradesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/cursos")
public class GradesController {
    private final IGradesService gradesService;

    public GradesController(IGradesService gradesService) {
        this.gradesService = gradesService;
    }

    @GetMapping()
    public ArrayList<GradeListDTO> listGrades(){
        return new ArrayList<>(gradesService.getCompleteList());
    }

    @PostMapping(value = "/init")
    public void initDB(){
        gradesService.initDB();
    }

    @GetMapping(value = "/{area}")
    public List<GradeListDTO> listGradesArea(@PathVariable String area){
        List<GradeListDTO> list = gradesService.getCompleteList();
        List<GradeListDTO> returnList = new ArrayList<>();

        for (GradeListDTO grade: list){
            if(grade.getArea().equalsIgnoreCase(area)){
                GradeListDTO gradeListDTO = new GradeListDTO();
                gradeListDTO.setId(grade.getId());
                gradeListDTO.setName(grade.getName());
                gradeListDTO.setArea(grade.getArea());
                gradeListDTO.setPrice(grade.getPrice());
                gradeListDTO.setNumHours(grade.getNumHours());
                gradeListDTO.setModality(grade.getModality());
                returnList.add(gradeListDTO);
            }
        }
        return returnList;
    }

    @GetMapping(value = "/{numHours}")
    public List<GradeListDTO> listGradesArea(@PathVariable int numHours){
        List<GradeListDTO> list = gradesService.getCompleteList();
        List<GradeListDTO> returnList = new ArrayList<>();

        for (GradeListDTO grade: list){
            if(grade.getNumHours() == numHours){
                GradeListDTO gradeListDTO = new GradeListDTO();
                gradeListDTO.setId(grade.getId());
                gradeListDTO.setName(grade.getName());
                gradeListDTO.setArea(grade.getArea());
                gradeListDTO.setPrice(grade.getPrice());
                gradeListDTO.setNumHours(grade.getNumHours());
                gradeListDTO.setModality(grade.getModality());
                returnList.add(gradeListDTO);
            }
        }
        return returnList;
    }

    @GetMapping(value = "/{modality}")
    public List<GradeListDTO> listGradesArea(@PathVariable Modality modality){
        List<GradeListDTO> list = gradesService.getCompleteList();
        List<GradeListDTO> returnList = new ArrayList<>();

        for (GradeListDTO grade: list){
            if(grade.getModality() == modality){
                GradeListDTO gradeListDTO = new GradeListDTO();
                gradeListDTO.setId(grade.getId());
                gradeListDTO.setName(grade.getName());
                gradeListDTO.setArea(grade.getArea());
                gradeListDTO.setPrice(grade.getPrice());
                gradeListDTO.setNumHours(grade.getNumHours());
                gradeListDTO.setModality(grade.getModality());
                returnList.add(gradeListDTO);
            }
        }
        return returnList;
    }

    @GetMapping(value = "/{id}")
    public Grade getDetails(@PathVariable int id){
        Grade grade = gradesService.getGrade(id);
        if (grade.getModality() == Modality.ONLINE){
            GradeOnlineDTO gradeOnlineDTO = new GradeOnlineDTO();
            return gradeOnlineDTO;
        }
        return grade;
    }

    @PostMapping(value = "/{id}")
    public boolean addStudent(@PathVariable int id, @RequestBody Student student){
        Student student1 = new Student();
        student1.setName(student.getName());
        student1.setLastName(student.getLastName());
        student1.setDni(student.getDni());

        return gradesService.addStudent(id,student1);
    }

}
