import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementSeguro {

    //Constantes de Conexão
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "system";
    private static final String SENHA = "oracle";

    public static void main(String[] args) {

        //Dados de entrada simulando dados de um formulário
        int novoId = 3;
        String novoNome = "Teclado Mecânico";
        double novoPreco = 450.00;

        System.out.println("Iniciando teste de INSERT seguro com JDBC...");

        try (
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)
        ) {
            //Método Inseguro (Statement)
            String sqlInseguro = "INSERT INTO PRODUTOS (ID, NOME, PRECO) VALUES (" 
                               + novoId + ", '" + novoNome + "', " + novoPreco + ")";
            
            try (Statement stmtInseguro = conn.createStatement()) {
                int linhasAfetadas = stmtInseguro.executeUpdate(sqlInseguro);
                System.out.println("Linhas afetadas (Inseguro): " + linhasAfetadas);
            }

            //Vulnerabilidade a SQL Injection, pois os dados do usuário são tratados como código SQL.

            //Método Seguro (PreparedStatement)
            String sqlSeguro = "INSERT INTO PRODUTOS (ID, NOME, PRECO) VALUES (?, ?, ?)";

            try (PreparedStatement ps = conn.prepareStatement(sqlSeguro)) {
                ps.setInt(1, novoId);
                ps.setString(2, novoNome);
                ps.setDouble(3, novoPreco);

                int linhasAfetadasSeguras = ps.executeUpdate();
                System.out.println("INSERT Seguro executado com sucesso.");
                System.out.println("Linhas afetadas: " + linhasAfetadasSeguras);
            }

        } catch (SQLException e) {
            System.err.println("ERRO: Falha na execução da operação JDBC.");
            System.err.println("Mensagem: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("ERRO Inesperado: " + e.getMessage());
        }
    }
}
