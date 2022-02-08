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
@Table  (name = "cliente")
public class Cliente {

    @Schema(description = "DNI de cliente", example = "49770662E", required = true)
    @Id
    private String dni;

    @Schema(description = "Nombre del cliente", example = "Abelardo", required = true)
    @Column
    private String nombre;

    @Schema(description = "Apellidos del cliente", example = "Anayas Pardus", required = true)
    @Column
    private String apellidos;

    @Schema(description = "Direccion del cliente", example = "Avd. Relleu", required = true)
    @Column
    private String direccion;

    @Schema(description = "Telefono del cliebte", example = "657123997", required = true)
    @Column
    private int telefono;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_clase")
    private Clase clase;

}

