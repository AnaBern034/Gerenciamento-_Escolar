package main.java.org.example.Service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static main.java.org.example.Conexão.Conexão.fazerConexão;

public class ProfessorService {
    private Statement statement;

    public ProfessorService(){
        try {
            statement = fazerConexão().createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void inserirDadosProfessor(String nome, String disciplina){
        String sql = "INSERT INTO (nome,disciplina) VALUES ('"+nome+"', '"+disciplina+"')";
        try {
            statement.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void consultarProfessor(){
        String sql = "SELECT * FROM Professores";
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while (true){
                System.out.println("ID: "+resultSet.getLong("id_Professor"+
                        "| NOME: "+ resultSet.getString("nome" +
                        "| DISCIPLINA: "+resultSet.getString("disciplina"))));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
