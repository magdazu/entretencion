package com.entretencion.entretencion1.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotNull;

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
    @NotNull
    private String titulo;

    private Date fecha_estreno;

    @NotNull
    private String descripcion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genero_id")
    private Genero genero;
}
