package com.example.gym.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "reserva")
public class Reserva {

    @Schema(description = "Identificacion de la reserva", example = "1", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codReserva;

    @Schema(description = "Fecha de la reserva", example = "2022/02/22", required = true)
    @Column
    private Date fecha;

    @Schema(description = "Hora de la reserva", example = "15:22", required = true)
    @Column
    private Time hora;
}
