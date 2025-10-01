import java.util.Scanner;

public class CalculadoraSomaSimples {

    public static void main(String[] args) {
        //Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        //Variáveis para armazenar os números
        int primeiroNumero;
        int segundoNumero;
        int soma;

        //ENTRADA (INPUT)
        
        //Solicita e lê o primeiro número inteiro
        System.out.print("Por favor, digite o primeiro número inteiro: ");
        primeiroNumero = scanner.nextInt(); 

        //Solicita e lê o segundo número inteiro
        System.out.print("Agora, digite o segundo número inteiro: ");
        segundoNumero = scanner.nextInt();
        
        //Fecha o objeto Scanner para liberar recursos
        scanner.close(); 
        
        //PROCESSAMENTO
        
        //Calcula a soma
        soma = primeiroNumero + segundoNumero;
        
        //SAÍDA (OUTPUT)
        
        //Imprime o resultado da soma em um formato amigável
        System.out.println("\n--- Resultado ---");
        System.out.println("A soma dos números: " + primeiroNumero + " + " + segundoNumero + " = " + soma);
    }
}
