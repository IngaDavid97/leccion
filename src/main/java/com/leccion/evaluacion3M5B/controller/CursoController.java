/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leccion.evaluacion3M5B.controller;

import com.leccion.evaluacion3M5B.model.Curso;
import com.leccion.evaluacion3M5B.service.CursoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/api/curso")
public class CursoController {

    @Autowired
    CursoService cursoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Curso>> listarCurso() {
        return new ResponseEntity<>(cursoService.findByAll(), 
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Curso> crearCurso(
            @RequestBody Curso p) {
        return new ResponseEntity<>(cursoService.save(p), 
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Curso> actualizarCurso(@PathVariable Long id, @RequestBody Curso p) {
        Curso cursorEncontrado = cursoService.findById(id);
        if (cursorEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                cursorEncontrado.setNombre_curso(p.getNombre_curso());
                cursorEncontrado.setNivel(p.getNivel());
                cursorEncontrado.setDescripcion(p.getDescripcion());
                
                return new ResponseEntity<>(cursoService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Curso> eliminarCurso(@PathVariable Long id) {
        cursoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}