package main.java.org.example.Repository.Adição;

import main.java.org.example.Model.ProfessorModel;
import main.java.org.example.Repository.LerString;
import main.java.org.example.Service.ProfessorService;

public class AdicionarProfessor {
    ProfessorModel professorModel = new ProfessorModel();
    ProfessorService professorService = new ProfessorService();
    public void adicionarProfessor(){
        String nome = LerString.lerString("Digite o seu nome");
        professorModel.setNome(nome);
        String disciplina = LerString.lerString("Digite sua disciplina");
        professorModel.setDisplina(disciplina);

        professorService.inserirDadosProfessor(professorModel.getNome(), professorModel.getDisplina());

    }
}
