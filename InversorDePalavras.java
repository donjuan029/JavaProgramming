import java.util.Scanner;

public class InversorDePalavras {

    /**
     * Inverte os caracteres de uma string usando StringBuilder.
     * @param palavra A palavra a ser invertida.
     * @return A palavra invertida.
     */
    public static String inverterString(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            //ENTRADA
            System.out.print("Digite ao menos três palavras separadas por espaço: ");
            String entrada = scanner.nextLine().trim();

            //Exibe a frase original
            System.out.println("Frase original: " + entrada);

            //PROCESSAMENTO
            String[] palavras = entrada.split("\\s+"); // Divide por qualquer quantidade de espaços

            if (palavras.length < 3) {
                System.out.println("Erro: Digite pelo menos três palavras.");
                return;
            }

            //Inverte a segunda palavra (índice 1)
            palavras[1] = inverterString(palavras[1]);

            //Reconstrói a frase modificada
            String fraseModificada = String.join(" ", palavras);

            //SAÍDA
            System.out.println("Frase modificada: " + fraseModificada);
        }
    }
}
