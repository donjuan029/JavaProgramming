import java.util.Scanner;

public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário informar o peso e a altura
        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Determina a situação com base no IMC calculado
        String situacao;
        if (imc < 18.5) {
            situacao = "Você está abaixo do peso ideal";
        } else if (imc <= 24.9) {
            situacao = "Parabéns, você está em seu peso normal";
        } else if (imc <= 29.9) {
            situacao = "Você está acima de seu peso (sobrepeso)";
        } else if (imc <= 34.9) {
            situacao = "Obesidade grau I";
        } else if (imc <= 39.9) {
            situacao = "Obesidade grau II";
        } else {
            situacao = "Obesidade grau III";
        }

        // Exibe o valor do IMC e a situação na tela
        System.out.println("IMC: " + imc);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}