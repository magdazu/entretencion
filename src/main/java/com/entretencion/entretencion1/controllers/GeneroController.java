package com.entretencion.entretencion1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entretencion.entretencion1.models.Genero;
import com.entretencion.entretencion1.services.GeneroService;

@Controller
@CrossOrigin("*")
@RestController
public class GeneroController {

    private GeneroService generoService;

    public GeneroController(@Autowired GeneroService generoService) {
        this.generoService = generoService;
    }

    @PostMapping("/genero/save")
    public void guardarGenero(@RequestBody Genero genero) {
        generoService.saveGenero(genero);
    }

    @PutMapping("/genero/update")
    public void editarGenero(@RequestBody Genero genero) {
        generoService.updateGenero(genero);
    }

    @DeleteMapping("/genero/delete/{id}")
    public void eliminarGenero(@PathVariable Integer id) {
        this.generoService.deleteGenero(id);
    }

    @GetMapping("/genero/finAll")
    public List<Genero> obteGeneros() {
        return generoService.findAll();
    }
}
