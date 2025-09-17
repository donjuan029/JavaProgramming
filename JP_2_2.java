public class JP_2_2 {

    // 1. Atributos privados
    private String nome;
    private int idade;

    // Getter para Nome
    public String getNome() {
        return nome;
    }

    // Setter para Nome
    public void setNome(String n) {
        this.nome = n;
    }

    // Getter para Idade
    public int getIdade() {
        return idade;
    }

    // Setter para Idade
    public void setIdade(int id) {
        this.idade = id;
    }

    public static void main(String[] args) {
        // Criando objeto da própria classe
        JP_2_2 pessoa = new JP_2_2();

        // Setando valores
        pessoa.setNome("João");
        pessoa.setIdade(7);

        // Validação
        if (pessoa.getIdade() >= 0) {
            System.out.println("Idade definida: " + pessoa.getIdade() + " anos");
        } else {
            System.out.println("Erro: A idade não pode ser um valor negativo.");
        }

        // Imprimindo nome
        System.out.println("Nome: " + pessoa.getNome());
    }
}
