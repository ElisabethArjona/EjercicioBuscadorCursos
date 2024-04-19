package com.babel.cursos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeListDTO {
    private int id;
    private String name;
    private String area;
    private int numHours;
    private Modality modality;
    private double price;

}
