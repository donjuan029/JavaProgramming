import infra.data.DatabaseConfig;
import infra.data.ProdutoDAO;

public class AplicacaoConfig {

    public static void main(String[] args) {

        System.out.println("--- DEMONSTRAÇÃO DE ACESSO ÀS CONSTANTES ---");

        System.out.println("1. Acessando DB_URL: " + DatabaseConfig.DB_URL);
        System.out.println("2. Acessando DB_USER: " + DatabaseConfig.DB_USER);
        System.out.println("3. Acessando DB_PASSWORD: " + DatabaseConfig.DB_PASSWORD);

        System.out.println("\n-------------------------------------------");

        ProdutoDAO dao = new ProdutoDAO();
        dao.conectar();
    }
}
