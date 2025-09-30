public class ReverterStringRecursiva {
    public static void main(String[] args) {
        String original = "JAVAPROGRAMMING";
        String invertida = reverterString(original);

        System.out.println("String Original: " + original);
        System.out.println("----------------------------------------");
        System.out.println("String Invertida: " + invertida);

        //Extra: comparação com potência recursiva e iterativa
        int base = 2;
        int expoente = 10;

        int resultadoRecursivo = potenciaRecursiva(base, expoente);
        int resultadoIterativo = potenciaIterativa(base, expoente);

        System.out.println("\nBase: " + base + ", Expoente: " + expoente);
        System.out.println("----------------------------------------");
        System.out.println("Resultado Recursivo: " + resultadoRecursivo);
        System.out.println("Resultado Iterativo: " + resultadoIterativo);
    }

    //Método recursivo para inverter uma string
    public static String reverterString(String texto) {
        if (texto == null || texto.length() <= 1) {
            return texto; // Caso base
        }
        //Chamada recursiva: último caractere + reverso do restante
        return reverterString(texto.substring(1)) + texto.charAt(0);
    }

    //Método recursivo para calcular potência
    public static int potenciaRecursiva(int base, int expoente) {
        if (expoente == 0) return 1;
        return base * potenciaRecursiva(base, expoente - 1);
    }

    //Método iterativo para calcular potência
    public static int potenciaIterativa(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}