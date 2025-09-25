import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        // Criamos um conjunto que só aceita Strings (tarefas)
        // O uso de Set<String> com HashSet garante tipagem segura por meio de generics.
        // Isso evita que tipos diferentes sejam adicionados por engano, como números ou objetos não relacionados.
        Set<String> tarefas = new HashSet<>();

        // 1. Adicionar tarefas ao conjunto
        System.out.println("--- Adicionando tarefas ---");
        tarefas.add("Comprar pão");
        tarefas.add("Estudar Java");
        tarefas.add("Comprar pão"); // Tentando adicionar uma duplicata
        tarefas.add("Lavar o carro");

        // A principal característica do HashSet é que ele não permite duplicatas.
        // A segunda chamada add("Comprar pão") é ignorada silenciosamente.
        System.out.println("Conjunto de tarefas: " + tarefas);

        // Importante: HashSet não garante a ordem dos elementos.
        // A ordem de impressão pode variar a cada execução.
        // Exemplo possível: [Lavar o carro, Comprar pão, Estudar Java]

        // 2. Verificar se uma tarefa já existe
        boolean temTarefa = tarefas.contains("Estudar Java"); // contains(): verifica se o elemento está presente
        System.out.println("\nA tarefa 'Estudar Java' está no conjunto? " + temTarefa); // Saída: true
        
        // 3. Remover uma tarefa
        System.out.println("\n--- Removendo uma tarefa ---");
        tarefas.remove("Lavar o carro"); // remove(): exclui o elemento pelo valor
        System.out.println("Conjunto após remover 'Lavar o carro': " + tarefas);
    }
}
