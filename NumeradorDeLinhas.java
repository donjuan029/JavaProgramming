import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Lê um arquivo de texto linha por linha e grava em outro arquivo,
 * prefixando cada linha com seu número correspondente.
 */
public class NumeradorDeLinhas {

    private static final String ARQUIVO_ENTRADA = "entrada.txt";
    private static final String ARQUIVO_SAIDA = "saida_numerada.txt";

    public static void main(String[] args) {
        System.out.println("Iniciando processamento do arquivo: " + ARQUIVO_ENTRADA);
        System.out.println("Gerando arquivo de saída: " + ARQUIVO_SAIDA + "\n");

        int numeroLinha = 1;

        //Try-with-resources garante fechamento automático dos streams
        try (
            BufferedReader leitor = new BufferedReader(new FileReader(ARQUIVO_ENTRADA));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ARQUIVO_SAIDA))
        ) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                //Constrói a linha numerada com eficiência
                StringBuilder linhaNumerada = new StringBuilder();
                linhaNumerada.append(numeroLinha).append(": ").append(linha);

                escritor.write(linhaNumerada.toString());
                escritor.newLine();

                System.out.println("✔ Linha " + numeroLinha + " processada: " + linha);
                numeroLinha++;
            }

        } catch (IOException e) {
            System.err.println("Erro durante o processamento: " + e.getMessage());
            return;
        }

        System.out.println("\nProcessamento concluído. Total de " + (numeroLinha - 1) + " linhas gravadas.");
    }
}
