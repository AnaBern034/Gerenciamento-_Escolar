package main.java.org.example.View;

import main.java.org.example.Repository.Scanner.Scan;
import main.java.org.example.Service.CursoService;

public class MenuCurso {
    private static CursoService cursoService = new CursoService();


    public static void MenuCurso(){
        System.out.println("Digite" +
                "\n1  -adicioar curso do professor " +
                "\n2 - consultar curso" +
                "\n3 - voltar ao menu ");

        int opção = Scan.sc.nextInt();

        switch (opção){
            case 1 : cursoService.inserirDadosCurso();
            case 2 : consultAluno.consultaDados();
            case 3 : return;
        }
    }
}
