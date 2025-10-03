import java.io.*;

/**
 * Demonstra o processo completo de serialização e desserialização de um objeto Produto.
 * O campo 'codigo' é marcado como transient e não será preservado após a desserialização.
 */
public class SerializacaoEDesserializacao {

    private static final String ARQUIVO_SER = "produto2.ser";

    public static void main(String[] args) {

        //Criação do objeto original
        Produto2 original = new Produto2("Celular S10", 1500.0, 101);
        System.out.println("OBJETO ORIGINAL");
        exibirProduto2(original);

        //Serialização
        System.out.println("\nSERIALIZANDO para: " + ARQUIVO_SER);
        try (
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(ARQUIVO_SER))
        ) {
            objOut.writeObject(original);
            System.out.println("Objeto serializado com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro na serialização: " + e.getMessage());
            return;
        }

        //Desserialização
        System.out.println("\nDESSERIALIZANDO de: " + ARQUIVO_SER);
        Produto2 restaurado;
        try (
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(ARQUIVO_SER))
        ) {
            restaurado = (Produto2) objIn.readObject();
            System.out.println("Objeto desserializado com sucesso.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro na desserialização: " + e.getMessage());
            return;
        }

        //Comprovação do efeito 'transient'
        System.out.println("\nOBJETO RESTAURADO");
        exibirProduto2(restaurado);

        System.out.println("\n Efeito do campo 'transient':");
        System.out.println("→ Campo 'codigo' não foi preservado. Valor atual: " + restaurado.getCodigo());
    }

    //Método auxiliar para exibir os dados do produto
    private static void exibirProduto2(Produto2 p) {
        System.out.printf("Nome: %s%n", p.getNome());
        System.out.printf("Preço: R$%.2f%n", p.getPreco());
        System.out.printf("Código (transient): %d%n", p.getCodigo());
    }
}

