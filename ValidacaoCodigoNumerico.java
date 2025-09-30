import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidacaoCodigoNumerico {
    public static void main(String[] args) {
        //Expressão regular: exatamente 6 dígitos
        String regex = "\\d{6}";
        Pattern padrao = Pattern.compile(regex);

        //Exemplos de códigos para teste
        String[] codigos = {
            "123456",   //Válido
            "12345",    //Inválido (5 dígitos)
            "12345a",   //Inválido (contém letra)
            "1234567",  //Inválido (7 dígitos)
            "000000"    //Válido
        };

        System.out.println("Padrão de validação: " + regex);
        System.out.println("----------------------------------------");

        //Testar cada código
        for (String codigo : codigos) {
            testarCodigo(padrao, codigo);
        }
    }

    public static void testarCodigo(Pattern padrao, String codigo) {
        Matcher matcher = padrao.matcher(codigo);
        boolean valido = matcher.matches();

        System.out.printf("Código '%s': %s%n", codigo, valido ? "VÁLIDO" : "INVÁLIDO");
    }
}