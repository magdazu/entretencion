package com.entretencion.entretencion1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entretencion.entretencion1.models.Contenido;

public interface ContenidoRepository extends JpaRepository<Contenido, Integer> {
    @Query(value = "SELECT * FROM Contenido ORDER BY titulo", nativeQuery = true)
    List<Contenido> findContenidoOrderbynombre();

}
