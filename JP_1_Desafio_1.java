public class JP_1_Desafio_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a); // Deve imprimir 25
        System.out.println("b = " + b); // Deve imprimir 10
    }
}
