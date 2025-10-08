package infra.data;

/**
 * Classe que armazena as configurações de conexão com o banco de dados.
 */
public class DatabaseConfig {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/estoque_db";
    public static final String DB_USER = "usuario_app";
    public static final String DB_PASSWORD = "senha123";

    private DatabaseConfig() {
        // Impede instanciamento da classe
    }
}
