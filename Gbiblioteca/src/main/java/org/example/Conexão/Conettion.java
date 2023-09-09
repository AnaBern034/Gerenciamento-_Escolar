package main.java.org.example.Conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexão {
    public static Connection fazerConexão(){
        try {
            Connection conexão= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres","1234");
            if(conexão != null){
                System.out.println("Conexão deu certo");
            }else {
                System.out.println("Conexão falha");
            }
            return conexão;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }
}
