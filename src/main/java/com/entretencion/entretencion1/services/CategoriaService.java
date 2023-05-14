package com.entretencion.entretencion1.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.entretencion.entretencion1.models.Categoria;
import com.entretencion.entretencion1.repositories.CategoriaRepository;

@Service
@Transactional
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public void saveCategoria(Categoria categoria) {
        this.categoriaRepository.save(categoria);
    }

    public void updateCategoria(Categoria categoria) {
        this.categoriaRepository.save(categoria);
    }

    public void deleteCategoria(Integer id) {
        categoriaRepository.deleteById(id);
    }

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

}
