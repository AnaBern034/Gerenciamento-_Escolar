package main.java.org.example.View;

import java.util.Scanner;

public class Menu {
    Scanner  sc = new Scanner(System.in);
    public void menuView(){
        System.out.println("Digite a opção" +
                "\n1 - ALUNO" +
                "\n2 - PROFESSOR" +
                "\n3 - CURSO " +
                "\n4 - MATRICULA ");
        int opção = sc.nextInt();

        switch (opção){
            case 1 : MenuAluno.MenuAluno();
            case 2 : MenuProfessor.MenuProfessor();
            case 3 :
            case 4 :

        }

    }
}
