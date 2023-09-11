package main.java.org.example.Model;

public class ProfessorModel {
    private Long id_Professor;
    private  String nome;
    private String displina;

    public Long getId_Professor() {
        return id_Professor;
    }

    public void setId_Professor(Long id_Professor) {
        this.id_Professor = id_Professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisplina() {
        return displina;
    }

    public void setDisplina(String displina) {
        this.displina = displina;
    }
}
