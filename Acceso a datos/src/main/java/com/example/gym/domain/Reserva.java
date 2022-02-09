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
@Getter
@Setter
@Entity(name = "reserva")
public class Reserva {

    @Schema(description = "Identificacion de la reserva", example = "1", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Schema(description = "Fecha de la reserva", example = "2022/02/22", required = true)
    @Column
    private Date fecha;

    @Schema(description = "Hora de la reserva", example = "15:22", required = true)
    @Column
    private Time hora;

   /* @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    private List<Clase> reservas = new ArrayList<>();

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    private List<Cliente> clientes = new ArrayList<>();*/

}
