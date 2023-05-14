package com.entretencion.entretencion1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entretencion.entretencion1.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
