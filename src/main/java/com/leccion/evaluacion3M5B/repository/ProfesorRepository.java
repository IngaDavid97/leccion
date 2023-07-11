/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.leccion.evaluacion3M5B.repository;

import com.leccion.evaluacion3M5B.model.Profesor;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author HP
 */
public interface ProfesorRepository extends MongoRepository<Profesor, Long> {
    
}
