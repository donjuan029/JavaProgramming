import java.util.ArrayList;
import java.util.List;

public class TesteOutOfMemory {

    //Referência estática para simular um cache global
    private static final List<byte[]> DADOS_CACHE = new ArrayList<>();

    public static void carregarDados(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            //Cria um novo array de 1 MB
            byte[] bloco = new byte[1024 * 1024]; 
            
            //O VAZAMENTO DE MEMÓRIA: A referência ao objeto (bloco) é adicionada
            //ao DADOS_CACHE (que é estático e nunca é limpo).
            DADOS_CACHE.add(bloco); 
        }
        System.out.println("Memória consumida: " + DADOS_CACHE.size() + " MB.");
    }

    public static void main(String[] args) {
        //Tentativa de alocar 500 MB em um loop
        carregarDados(500); 
        
        //Se a JVM tiver menos de 500MB de Heap, o erro irá ocorrer aqui.
    }
}
