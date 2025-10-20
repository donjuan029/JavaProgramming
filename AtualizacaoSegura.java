import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizacaoSegura {

    //Constantes de Conexão
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "system";
    private static final String SENHA = "oracle";

    public static void main(String[] args) {

        //Variáveis de entrada
        int produtoId = 101;
        double novoPreco = 785.50;

        //Definir a instrução SQL com placeholders
        String sql = "UPDATE PRODUTOS SET PRECO = ? WHERE ID = ?";

        System.out.println("Iniciando atualização com PreparedStatement...");

        try (
            //Estabelece a conexão
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            
            //Cria o PreparedStatement
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            //Vincula o novo preço (primeiro ?)
            ps.setDouble(1, novoPreco);

            //Vincula o ID do produto (segundo ?)
            ps.setInt(2, produtoId);

            //Executa a atualização
            int linhasAfetadas = ps.executeUpdate();

            //Verifica o resultado
            if (linhasAfetadas > 0) {
                System.out.println("Sucesso! " + linhasAfetadas + " linha(s) atualizada(s).");
            } else {
                System.out.println("Nenhuma linha foi atualizada. Verifique se o ID " + produtoId + " existe.");
            }

        } catch (SQLException e) {
            System.err.println("ERRO: Falha na execução do PreparedStatement.");
            System.err.println("Mensagem: " + e.getMessage());
        }
    }
}
