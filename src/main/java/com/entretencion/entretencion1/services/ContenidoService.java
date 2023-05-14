package com.entretencion.entretencion1.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.entretencion.entretencion1.models.Contenido;
import com.entretencion.entretencion1.repositories.ContenidoRepository;

@Service
@Transactional
public class ContenidoService {

    private ContenidoRepository contenidoRepository;

    public ContenidoService(ContenidoRepository contenidoRepository) {
        this.contenidoRepository = contenidoRepository;
    }

    public void saveContenido(Contenido contenido) {
        this.contenidoRepository.save(contenido);
    }

    public void updateContenido(Contenido contenido) {
        this.contenidoRepository.save(contenido);
    }

    public void deleteContenido(Integer id) {
        contenidoRepository.deleteById(id);
    }

    public List<Contenido> findAll() {
        return contenidoRepository.findAll();
    }

}
