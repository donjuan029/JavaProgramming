import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaBasica {

    // Constantes de Conexão
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "system";
    private static final String SENHA = "oracle";

    public static void main(String[] args) {

        System.out.println("Iniciando teste de consulta JDBC...");

        //Usando try-with-resources para Connection e Statement
        try (
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            Statement stmt = conn.createStatement()
        ) {
            System.out.println("Conexão estabelecida com sucesso.");

            //Criar a tabela se não existir
            String sqlCreate = "BEGIN "
                             + "EXECUTE IMMEDIATE 'CREATE TABLE PRODUTOS (ID NUMBER PRIMARY KEY, NOME VARCHAR2(100))'; "
                             + "EXCEPTION WHEN OTHERS THEN "
                             + "IF SQLCODE != -955 THEN RAISE; END IF; "
                             + "END;";
            stmt.execute(sqlCreate);
            System.out.println("Tabela PRODUTOS verificada/criada.");

            //Executar SELECT
            String sqlSelect = "SELECT ID, NOME FROM PRODUTOS";
            try (ResultSet rs = stmt.executeQuery(sqlSelect)) {
                System.out.println("--- Resultados da Consulta ---");

                //Iterar sobre o ResultSet
                while (rs.next()) {
                    int id = rs.getInt("ID");
                    String nome = rs.getString("NOME");
                    System.out.println("ID: " + id + ", Nome: " + nome);
                }

                System.out.println("------------------------------");
            }

        } catch (SQLException e) {
            System.err.println("ERRO: Falha na execução da consulta JDBC.");
            System.err.println("Mensagem: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("ERRO Inesperado: " + e.getMessage());
        }
    }
}
