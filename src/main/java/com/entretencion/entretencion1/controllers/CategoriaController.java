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
import org.springframework.web.bind.annotation.RestController;

import com.entretencion.entretencion1.models.Categoria;
import com.entretencion.entretencion1.services.CategoriaService;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin("*")
@RestController
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController(@Autowired CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping("/categoria/save")
    public void guardarCategoria(@RequestBody Categoria categoria) {
        this.categoriaService.saveCategoria(categoria);
    }

    @PutMapping("/categoria/update")
    public void editarCategoria(@RequestBody Categoria categoria) {
        this.categoriaService.updateCategoria(categoria);
    }

    @DeleteMapping("/categoria/Delete/{id}")
    public void eliminarCategoria(@PathVariable Integer id) {
        categoriaService.deleteCategoria(id);
    }

    @GetMapping("/categoria/findAll")
    public List<Categoria> obtenerCategoria() {
        return categoriaService.findAll();
    }
}
