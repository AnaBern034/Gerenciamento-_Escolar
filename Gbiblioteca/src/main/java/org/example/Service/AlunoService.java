package main.java.org.example.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import static java.sql.DriverManager.getConnection;
import static main.java.org.example.Conexão.Conexão.fazerConexão;

public class AlunoService implements CreatingQueryAluno {
    private Statement statement;

    public AlunoService(){
        try {
            statement = fazerConexão().createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void inserirDadosAluno(String nome, LocalDate dataNascimento, String endereço) {
        String sql ="INSERT INTO Alunos (nome,dataNascimento,endereço) VALUES ('" +
                nome + "', '" + dataNascimento + "', '" + endereço + "')";

        try {
            statement.executeUpdate(sql);
            System.out.println("Aluno: " +nome+"foi matriculado ");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void consultaDados() {
        String sql = "SELECT * FROM Alunos";
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("ID: "+resultSet.getLong("id_Usuário"+
                        "| NOME: "+ resultSet.getString("nome" +
                        "| DATA DE ANIVERSÁRIO: "+ resultSet.getString("dataNascimento" +
                        "| ENDEREÇO: "+resultSet.getString("endereço")))));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
