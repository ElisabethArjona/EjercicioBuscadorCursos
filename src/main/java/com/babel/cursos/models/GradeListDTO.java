package com.babel.cursos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeListDTO {
    private int id;
    private String nombre;
    private String area;
    private int numHoras;
    private Modality modality;
    private double precio;

}
