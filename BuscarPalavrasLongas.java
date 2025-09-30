import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class BuscarPalavrasLongas {
    public static void main(String[] args) {
        //Texto de exemplo, não utilize acentuação
        String texto = "Este e um exercicio sobre Java e Expressoes Regulares em programacao.";

        //Expressão regular: palavras com 5 ou mais caracteres
        String regex = "\\w{5,}";

        //Compilar o padrão e criar o matcher
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);

        System.out.println("Texto em análise: " + texto);
        System.out.println("----------------------------------------");
        System.out.println("Palavras com 5 ou mais caracteres:");

        int contador = 0;

        //Loop para encontrar todas as ocorrências
        while (matcher.find()) {
            String palavra = matcher.group();
            System.out.println(" - " + palavra);
            contador++;
        }

        System.out.println("----------------------------------------");
        System.out.println("Total de palavras longas encontradas: " + contador);
    }
}