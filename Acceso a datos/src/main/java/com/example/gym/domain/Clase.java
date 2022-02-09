package com.example.gym.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "clase")
public class Clase {

    @Schema(description = "Identificador de clase", example = "1", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Schema(description = "Ubicacion de la clase", example = "Sala 1", required = true)
    @Column
    private String ubicacion;

    @Schema(description = "Nombre de la clase", example = "Crossfit", required = true)
    @Column
    private String nombre;

    @Schema(description = "Capacidad de la clase", example = "25", required = true)
    @Column
    private int capacidad;

    @Schema(description = "Monitor de la clase", example = "Yassin", required = true)
    @Column
    private String monitor;

    @Schema(description = "Descripcion de la clase", example = "Hacer crossfit", required = true)
    @Column
    private String descripcion;

    /*@ManyToOne(fetch = FetchType.LAZY)
    private Reserva reserva;*/
}

