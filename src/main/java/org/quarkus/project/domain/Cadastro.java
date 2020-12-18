package org.quarkus.project.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cadastro {

    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
}
