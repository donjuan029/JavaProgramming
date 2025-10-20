public class AlocacaoMemoria3 {

    // Campo estático (Parte da definição da classe)
    @SuppressWarnings("unused")
    private static final int MAX_VALOR = 1000; 

    public static void main(String[] args) {
        // Alocação de 5 objetos no Heap
        for (int i = 0; i < 5; i++) {
            new String("Objeto " + i);
        }
    }
}
