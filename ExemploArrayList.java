import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criamos uma lista que só aceita Strings (nomes de alunos)
        // O uso de <String> é um exemplo de generics, que garante que apenas Strings sejam armazenadas.
        // Isso evita erros como tentar adicionar um número ou outro tipo de dado.
        ArrayList<String> listaPresenca = new ArrayList<>();

        // 1. Adicionando nomes à lista (na ordem de chegada)
        System.out.println("--- Adicionando nomes ---");
        listaPresenca.add("Ana");
        listaPresenca.add("Bruno");
        listaPresenca.add("Carla");
        System.out.println("Lista inicial: " + listaPresenca); // [Ana, Bruno, Carla]

        // 2. Acessando um nome pela posição (índice)
        String primeiroNome = listaPresenca.get(0); // índice 0 = primeiro da lista
        System.out.println("O primeiro nome da lista é: " + primeiroNome); // Ana

        // 3. Removendo um nome da lista
        System.out.println("\n--- Removendo um nome ---");
        listaPresenca.remove("Bruno"); // Remove pelo valor
        System.out.println("Lista após remover 'Bruno': " + listaPresenca); // [Ana, Carla]
    }
}
