package com.entretencion.entretencion1.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.entretencion.entretencion1.models.Genero;
import com.entretencion.entretencion1.repositories.GeneroRepository;

@Service
@Transactional
public class GeneroService {

    private GeneroRepository generoRepository;

    public GeneroService(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    public void saveGenero(Genero genero) {
        this.generoRepository.save(genero);
    }

    public void updateGenero(Genero genero) {
        this.generoRepository.save(genero);
    }

    public void deleteGenero(Integer id) {
        this.generoRepository.deleteById(id);
    }

    public List<Genero> findAll() {
        return generoRepository.findAll();
    }
}
