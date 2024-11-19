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
public class Paciente extends Pessoa{
    private String planoSaude;
    private List<Consulta> consultas;
    
}
