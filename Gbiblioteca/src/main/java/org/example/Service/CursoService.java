package main.java.org.example.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CursoService {
    Statement statement;
    public void inserirDadosCurso(String nomeCurso, Long id_professor ){
        String sql = "INSERT INTO  Cursos (nomeCurso, id_Professor) VALUES('"+nomeCurso+"', '"+ id_professor+"')";
        try {
            statement.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void consultarCurso(){
        String sql = "SELECT Cursos.id, Cursos.nomeCurso" +
                "FROM Cursos"+
                "INNER JOIN Cursos ON Cursos.Professor = id_Professor ";
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while (true){
                System.out.println("ID: "+resultSet.getLong("id_Usuário"+
                        "| NOME DO CURSO: "+ resultSet.getString("Curso.nome" +
                        "| PROFESSOR RESPONSAVEL: "+ resultSet.getString("dataNascimento"))));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
