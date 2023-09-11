package main.java.org.example.Service;

import java.time.LocalDate;

public interface CreatingQueryAluno {

    void inserirDadosAluno(String nome, LocalDate dataNascimento, String endereço);
    void consultaDados();
}
