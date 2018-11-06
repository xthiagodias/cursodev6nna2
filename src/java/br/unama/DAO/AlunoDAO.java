package br.unama.DAO;

import br.unama.Modelo.Aluno;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

public class AlunoDAO {

    private DataSource datasource;
    private List<Aluno> listaAlunos;

    public AlunoDAO(DataSource ds) {
        this.datasource = ds;
    }

    public List<Aluno> consultaAluno() {
        listaAlunos = new ArrayList<Aluno>();
        Connection con = null;
        Statement st = null;
        ResultSet result = null;
        try {
            //Obter Conexão com Banco
            con = datasource.getConnection();

            //Criar o SQL 
            st = con.createStatement();
            String sql = "select * from aluno";
            
          //  String sql = "INSERT INTO aluno values(5,'Teste','Teste','Teste')";

            //Executar o SQL
            result = st.executeQuery(sql);
           // result = st.executeQuery(sql2);

            //Processar os dados retornados 
            while (result.next()) {
                int id = result.getInt("idaluno");
                String primeiroNome = result.getString("primeiro_nome");
                String ultimoNome = result.getString("ultimo_nome");
                String email = result.getString("email");
                Aluno aluno = new Aluno(id, primeiroNome, ultimoNome, email);

                listaAlunos.add(aluno);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listaAlunos;

    }

   

}
