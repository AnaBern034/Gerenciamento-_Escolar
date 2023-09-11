package main.java.org.example.Repository;

import java.util.Scanner;

public class LerString {
    static Scanner sc = new Scanner(System.in);
    public  static int lerInt(String mensagem){
        while (true){
        System.out.println(mensagem);
        String lerI = sc.next();
        try {
            return Integer.parseInt(lerI);
        }catch (NumberFormatException e){
            System.out.println("Digite um numero válido");
        }
        }
    }
    public static String lerString(String mensagem){
      while (true) {
          System.out.println(mensagem);
          String lerS = sc.next();
          if (lerS.isEmpty()) {
              return lerS;
          } else {
              System.out.println("Está inválido");
          }
      }
    }
}
