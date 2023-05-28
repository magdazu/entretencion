package com.entretencion.entretencion1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entretencion.entretencion1.models.Contenido;
import com.entretencion.entretencion1.services.ContenidoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin("*")
@RestController
public class ContenidoController {

    private ContenidoService contenidoService;

    public ContenidoController(@Autowired ContenidoService contenidoService) {
        this.contenidoService = contenidoService;
    }

    @RequestMapping("/contenido/save")
    @PostMapping
    public void guardarContenido(@RequestBody Contenido contenido) {
        contenidoService.saveContenido(contenido);
        System.out.println("Se ingreso correctamente el contenido");
    }

    @PutMapping("/contenido/update")
    public void editarContenido(@RequestBody Contenido contenido) {
        contenidoService.updateContenido(contenido);
    }

    @DeleteMapping("/contenido/Delete/{id}")
    public void eliminarContenido(@PathVariable Integer id) {
        contenidoService.deleteContenido(id);
    }

    @GetMapping("/contenido/FinAll")
    public List<Contenido> obtenerContenido() {
        return contenidoService.findAll();
    }

    @GetMapping("/contenido/contenidoBynombreDesc")
    public List<Contenido> obtenerNombreDesc() {
        return contenidoService.findContenidoBynombreDesc();
    }
}
