package main.java.org.example.View;

import main.java.org.example.Repository.Adição.AdicionarProfessor;
import main.java.org.example.Repository.Scanner.Scan;
import main.java.org.example.Service.ProfessorService;

public class MenuProfessor {
  private static AdicionarProfessor adicionarProfessor = new AdicionarProfessor();
   private static ProfessorService professorService = new ProfessorService();

    public static void MenuProfessor(){
        System.out.println("Digite" +
                "\n1  -adicioar professor" +
                "\n2 - consultar professor" +
                "\n3 - voltar ao menu ");


        int opção = Scan.sc.nextInt();

        switch (opção){
            case 1 : adicionarProfessor.adicionarProfessor();
            case 2 : professorService.consultarProfessor();
            case 3 : return;
        }
    }
}
