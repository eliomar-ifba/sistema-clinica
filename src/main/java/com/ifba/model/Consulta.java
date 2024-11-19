package com.ifba.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consulta {
    private UUID id;
    private LocalDateTime data;
    private Boolean retorno;
    private BigDecimal valor;
    private StatusPagamento statusPagamento;
    private StatusConsulta statusConsulta;
    private Paciente paciente;
    private Medico medico;
    private Receita receita;

}
