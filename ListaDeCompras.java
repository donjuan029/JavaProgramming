public class ListaDeCompras {
    private String[] itens = new String[5];

    public void adicionarItem(String item, int indice) {
        if (indice >= 0 && indice < itens.length) {
            itens[indice] = item;
        } else {
            System.out.println("Índice inválido! Deve estar entre 0 e " + (itens.length - 1));
        }
    }

    public String obterItem(int indice) {
        if (indice >= 0 && indice < itens.length) {
            return itens[indice];
        } else {
            return "Índice inválido!!!!";
        }
    }

    public void imprimirLista() {
        System.out.println("Lista de Compras: ");
        for (int i = 0; i < itens.length; i++) {
            System.out.println("Índice " + i + ": " + (itens[i] !=null ? itens[i] : "[vazio]"));
        }
    }
}

class Desafio2 {
    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();
        lista.adicionarItem("Pão", 0);
        lista.adicionarItem("Leite", 1);
        lista.imprimirLista();

        System.out.println("Item no índice 0: " + lista.obterItem(0));

        lista.adicionarItem("Ovos", 10);
    }

    
}