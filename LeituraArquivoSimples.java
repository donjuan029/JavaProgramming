import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivoSimples {

    public static void main(String[] args) {
        // Define o nome do arquivo a ser lido
        String nomeArquivo = "entrada.txt";
        FileReader leitor = null; // Inicializa como null para permitir o fechamento no bloco finally

        System.out.println("Iniciando a leitura do arquivo: " + nomeArquivo + "\n");

        try {
            // Abre o arquivo utilizando FileReader (fluxo de caracteres)
            leitor = new FileReader(nomeArquivo);
            int caractereLido;

            // Lê o conteúdo do arquivo caractere por caractere
            // O método read() retorna o código ASCII do caractere ou -1 ao atingir o fim do arquivo
            while ((caractereLido = leitor.read()) != -1) {
                // Converte o código ASCII para caractere e exibe no console
                System.out.print((char) caractereLido);
            }

        } catch (IOException e) {
            // Captura e trata exceções de entrada/saída (ex: arquivo inexistente ou inacessível)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Falha ao ler o arquivo: " + e.getMessage());
        } finally {
            // Garante o fechamento do recurso FileReader, mesmo em caso de erro
            try {
                if (leitor != null) {
                    leitor.close();
                    System.out.println("\n\nArquivo fechado com sucesso.");
                }
            } catch (IOException e) {
                // Trata possíveis erros durante o fechamento do arquivo
                System.err.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }
}
