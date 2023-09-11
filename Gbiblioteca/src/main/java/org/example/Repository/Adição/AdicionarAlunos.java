package main.java.org.example.Repository.Adição;

import main.java.org.example.Model.AlunosModel;
import main.java.org.example.Repository.LerString;
import main.java.org.example.Service.AlunoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdicionarAlunos {
    AlunoService alunoService = new AlunoService();
    AlunosModel aluno = new AlunosModel();
    LerString leitura = new LerString();


    public  void AdicionaRAluno(){
    String nome = leitura.lerString("Digite o nome");
    aluno.setNome(nome);

    String endereço = leitura.lerString("Digite o nome");
    aluno.setEndereço(endereço);

    String dataNascimento = leitura.lerString("Digite a data nascimento(yyyy/ii/oo)");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate data = LocalDate.parse(dataNascimento, formatter);
    aluno.setDataNascimento(data);

    alunoService.inserirDadosAluno(aluno.getNome(),aluno.getDataNascimento(),aluno.getEndereço());

    }
}
