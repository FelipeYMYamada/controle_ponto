package com.controle_ponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Entity
public class BancoHoras {
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class CompensatoryTimeId implements Serializable {
        private Long compensatoryTimeId;
        private Long movementId;
        private Long userId;
    }

    @Id
    @EmbeddedId
    private CompensatoryTimeId id;
    @ManyToOne(optional = false)
    private CategoriaUsuario categoriaUsuario;
    private LocalDateTime horasTrabalhadas;
    private Integer qt;
    private Integer saldoHoras;
}
