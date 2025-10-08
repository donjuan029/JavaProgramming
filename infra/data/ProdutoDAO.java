package infra.data;

/**
 * Classe ProdutoDAO (Data Access Object).
 */
public class ProdutoDAO {

    public ProdutoDAO() {
        System.out.println("ProdutoDAO inicializado.");
    }

    public void conectar() {
        System.out.println("\nTentando conectar ao banco de dados...");
        System.out.println("URL: " + DatabaseConfig.DB_URL);
        System.out.println("Usuário: " + DatabaseConfig.DB_USER);
        System.out.println("Senha: " + DatabaseConfig.DB_PASSWORD);
        System.out.println("Conexão simulada com sucesso!");
    }
}
