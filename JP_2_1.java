public class JP_2_1 {
    
private String Nome; // Atributo privado

    // Getter para obter o valor de Nome
    public String getNome() {
        return Nome;
    }

    // Setter para definir um novo valor para Nome
    public void setNome(String n) {
        // Poderia adicionar validações aqui, por exemplo
        this.Nome = n;
    }
    private int Idade; // Atributo privado

    // Getter para obter o valor de Idade
    public int getIdade() {
        return Idade;
    }

    // Setter para definir um novo valor para Idade
    public void setIdade(int id) {
        // Poderia adicionar validações aqui, por exemplo
        this.Idade = id;
    }
    public static void main(String[] args) {
        
    
    // 2. Getters e Setters públicos
        Pessoa pessoa = new Pessoa();

        
        // Os setters para atribuir valores
        pessoa.setNome("João");
        
        pessoa.setIdade(30);
        
        // Os getters para obter e imprimir os valores
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}