package com.entretencion.entretencion1.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Contenido")
public class Contenido {
    @Id // indica el id de cada fila
    @GeneratedValue(strategy = GenerationType.IDENTITY) // con esto se indica que la responsabilidad es de la BD
    private Integer contenido_id;
    private String titulo;
    private Date fecha_estreno;
    private String descripcion;
    private Integer categoria_id;
    private Integer genero_id;
}
