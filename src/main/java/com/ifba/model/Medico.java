package com.ifba.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Medico extends Pessoa{
    private String crm;
    private Especialidade especialidade;
    private List<Consulta> consultas;
    
}
