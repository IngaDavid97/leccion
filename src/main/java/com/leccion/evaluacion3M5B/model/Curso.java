/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leccion.evaluacion3M5B.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author HP
 */
@Document(collection = "Curso")
@Data
public class Curso {
      @Id
    private Long curso_id;
     
     private String nombre_curso;
     
     private String nivel;
     
     private String descripcion;
}
