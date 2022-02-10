package com.example.gym.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.Setter;
import lombok.Getter;
import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "reserva")
public class Reserva {

    @Schema(description = "Identificacion de la reserva", example = "1", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Schema(description = "Fecha de la reserva", example = "2022-02-22", required = true)
    @Column
    private Date fecha;

    @Schema(description = "Hora de la reserva", example = "15:22:22", required = true)
    @Column
    private Time hora;

    @ManyToOne(fetch=FetchType.LAZY)
    private Clase clase;

    @ManyToOne(fetch=FetchType.LAZY)
    private Cliente cliente;
}
