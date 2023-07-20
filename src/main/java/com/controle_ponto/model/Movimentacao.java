package com.controle_ponto.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Entity
public class Movimentacao {
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementId implements Serializable {
        private Long idMovement;
        private Long idUser;
    }

    @Id
    @EmbeddedId
    private MovementId id;
    @NotNull
    private LocalDateTime dataEntrada;
    @NotNull
    private LocalDateTime dataSaida;
    @NotNull
    private BigDecimal periodo;
    @ManyToOne(optional = false)
    private Ocorrencia ocorrencia;
    @ManyToOne(optional = false)
    private Calendario calendario;
}
