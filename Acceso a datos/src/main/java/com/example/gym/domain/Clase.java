package com.example.gym.domain;

import com.example.gym.EntityIdFinder.EntityIdResolver;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity (name = "clase")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property="id",
        resolver = EntityIdResolver.class,
        scope = Clase.class
)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
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

    @Schema(description = "Fecha de la reserva", example = "2022-02-22", required = true)
    @Column
    private LocalDate fecha;

    @Schema(description = "Hora de la reserva", example = "15:22:22", required = true)
    @Column
    private Time hora;

    @OneToMany(mappedBy = "clase", orphanRemoval = true, cascade=CascadeType.ALL)
    private List<Reserva> reservas = new ArrayList<>();

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

