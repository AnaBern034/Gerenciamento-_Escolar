package main.java.org.example.View;

import main.java.org.example.Repository.Adição.AdicionarAlunos;
import main.java.org.example.Service.AlunoService;

import java.util.Scanner;

public class MenuAluno {
    static Scanner sc = new Scanner(System.in);
    static AdicionarAlunos alunosADD = new AdicionarAlunos();
    static AlunoService consultAluno = new AlunoService();
    public static void MenuAluno(){
        System.out.println("Digite" +
                "\n1  -adicioar aluno" +
                "\n2 - consultar aluno" +
                "\n3 - voltar ao menu ");

        int opção = sc.nextInt();

        switch (opção){
            case 1 : alunosADD.AdicionaRAluno();
            case 2 : consultAluno.consultaDados();
            case 3 : return;
        }
    }
}
