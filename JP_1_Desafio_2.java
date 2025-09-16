public class JP_1_Desafio_2 {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 9;

        // Conversão explícita para garantir precisão decimal
        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("A média é: " + media); // Deve imprimir 8.0
    }
}
