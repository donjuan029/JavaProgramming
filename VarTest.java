/**
 * A classe 'VarTest' demonstra a declaracao e exibicao de
 * variaveis primitivas em Java, como 'int', 'char' e 'boolean'.
 */

 public class VarTest {
    /**
     * O metodo principal, ponto de entrada para a aplicacao.
     * Exibe o valor de variaveis de diferentes tipos de dados no console.
     * @param args Argumentos da linha de comando (nao utilizados neste exemplo).
     */

    public static void main(String[] args) {
        
        // Declaracao de variaveis com nomes descritivos em camelCase.
        int intergerValue = 25;
        char characterValue = 'B';
        boolean isActive = true;
        
        // Exibicao dos valores com mensagens claras.
        System.out.println("Valor inteiro: " + intergerValue);
        System.out.println("Valor do caractere: " + characterValue);
        System.out.println("Valor booleano: " + isActive);
    }
    
}