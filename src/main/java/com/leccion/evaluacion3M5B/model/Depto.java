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
@Document(collection = "Depto")
@Data
public class Depto {
      @Id
    private Long depto_id;
     
     private String Nombre;
     
     private String director;
     
     private String descripcion;
}
