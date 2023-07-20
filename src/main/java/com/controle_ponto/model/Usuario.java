package com.controle_ponto.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    @NotNull
    private String nome;
    @ManyToOne(optional = false)
    private Empresa empresa;
    @ManyToOne(optional = false)
    private NivelAcesso nivelAcesso;
    @ManyToOne(optional = false)
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    @NotNull
    private LocalDateTime inicioJornada;
    @NotNull
    private LocalDateTime fimJornada;
}
