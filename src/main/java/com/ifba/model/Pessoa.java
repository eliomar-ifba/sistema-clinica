package com.ifba.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//códigos boylerplate são códigos padrão repetitivos
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pessoa {
    private UUID id;
    private String nome;
    private String whatsapp;
    private Usuario usuario;
    private Endereco endereco;
    private Genero genero;
}
