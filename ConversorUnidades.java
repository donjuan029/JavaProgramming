import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {
        //Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        //Variáveis para armazenar os valores
        double valorEmMetros;
        double valorEmCentimetros;
        
        //O fator de conversão é uma constante
        final double FATOR_CONVERSAO = 100;

        //ENTRADA (INPUT)
        
        //Solicita e lê o valor em metros (tipo double/ponto flutuante)
        System.out.print("Digite o valor em metros (ex: 1,75): ");
        valorEmMetros = scanner.nextDouble(); 

        //Fecha o objeto Scanner
        scanner.close(); 
        
        //PROCESSAMENTO
        
        //Calcula o valor equivalente em centímetros
        valorEmCentimetros = valorEmMetros * FATOR_CONVERSAO;
        
        //SAÍDA (OUTPUT)
        
        //Imprime o resultado da conversão
        System.out.println("\n--- Conversão ---");
        System.out.println(valorEmMetros + " metros equivalem a " + valorEmCentimetros + " centímetros.");
    }
}
