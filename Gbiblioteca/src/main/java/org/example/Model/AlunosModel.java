package main.java.org.example.Model;

import java.time.LocalDate;

public class AlunosModel {
    private Long id_Usuário;
    private String nome;
    private LocalDate DataNascimento;
    private String endereço;

    public Long getId_Usuário() {
        return id_Usuário;
    }

    public void setId_Usuário(Long id_Usuário) {
        this.id_Usuário = id_Usuário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }


}
