import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtracaoData {
    public static void main(String[] args) {
        //Texto contendo uma data no formato DD/MM/AAAA
        String texto = "A reunião está marcada para 30/09/2025, anote aí.";

        //Expressão regular com três grupos de captura: dia, mês e ano
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})";

        //Compilar o padrão e criar o matcher
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);

        System.out.println("Texto Original: " + texto);
        System.out.println("Padrão: " + regex);
        System.out.println("----------------------------------------");

        //Verificar se há correspondência
        if (matcher.find()) {
            String dia = matcher.group(1);   // Grupo 1: dia
            String mes = matcher.group(2);   // Grupo 2: mês
            String ano = matcher.group(3);   // Grupo 3: ano

            System.out.println("Data completa encontrada: " + matcher.group(0));
            System.out.println("Dia (Grupo 1): " + dia);
            System.out.println("Mês (Grupo 2): " + mes);
            System.out.println("Ano (Grupo 3): " + ano);
        } else {
            System.out.println("Data não encontrada no formato DD/MM/AAAA.");
        }
    }
}