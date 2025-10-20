import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class TesteConexao {

    //Defina as constantes de conexão
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "system";
    private static final String SENHA = "oracle";

    public static void main(String[] args) {

        //Declarar as variáveis de Statement e ResultSet
        Statement stmt = null;
        ResultSet rs = null;

        //Usar try-with-resources para garantir o fechamento automático da conexão
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {

            //Mensagem de sucesso
            System.out.println("Conexão estabelecida com sucesso!");

            //Verificação adicional
            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexão está aberta e pronta para uso.");
            }

        } catch (SQLException e) {
            //Tratamento de erro específico de SQL
            System.err.println("ERRO: Falha ao estabelecer a conexão JDBC.");
            System.err.println("Código SQL State: " + e.getSQLState());
            System.err.println("Mensagem: " + e.getMessage());

        } catch (Exception e) {
            //Tratamento de erro genérico
            System.err.println("ERRO Inesperado: " + e.getMessage());
        }
    }
}
