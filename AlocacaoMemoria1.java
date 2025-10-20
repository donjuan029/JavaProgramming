public class AlocacaoMemoria1 {

    //VARIÁVEL A: Variável estática (parte da classe)
    @SuppressWarnings("unused")
    private static final String NOME_CLASSE = "Produto"; 

    @SuppressWarnings("unused")
    public void criarProduto(int id) {
        
        //VARIÁVEL B: Variável local primitiva
        double preco = 50.0; 
        
        //VARIÁVEL C: Objeto instanciado
        String descricao = new String("Monitor LED");
        
        //VARIÁVEL D: Referência local ao objeto
        Produto meuProduto = new Produto(id, descricao, preco); 
        
        //(método termina)
    } 

    //Classe de exemplo (simplificada)
    static class Produto {
        int id;
        String nome;
        double valor;
        public Produto(int id, String nome, double valor) {
            this.id = id; this.nome = nome; this.valor = valor;
        }
    }
}
