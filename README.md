# JavaProgramming
Programação Oracle Java Programming - Senai


Exercício 1

    public class JP_1_1 {

    public static void main(String[] args) {
        byte idade = 36;
        short ano = 1989;
        int populacao = 8000000;
        long distanciaViaLactea = 26000;
        float preco = 199;
        double pi = 3.141592;
        char letra = 't';
        boolean ehVerdadeiro = true;
        
        System.out.println(idade);
        System.out.println(ano);
        System.out.println(populacao);
        System.out.println(distanciaViaLactea);
        System.out.println(preco);
        System.out.println(pi);
        System.out.println(letra);
        System.out.println(ehVerdadeiro);
    }}

Exercício 2


    public class JP_1_2 {
  
    
    public static void main(String[] args) {

        byte idade = 25;
        long populacaoMundial = 8000000000L;
        int distanciaCidades = 500;
        short diasAno = 365;
        


        System.out.println(idade);
        System.out.println(populacaoMundial);
        System.out.println(distanciaCidades);
        System.out.println(diasAno);
    }}

Exercício 3

    public class JP_1_3 {
    
    public static void main(String[] args) {

        int meuInt = 150;
        short meuShort = (short) meuInt;

        double meuDouble = 9.78;
        int outroInt = (int) meuDouble; 

        double meuFloat = 12.34;
        
        System.out.println(meuShort);
        System.out.println(outroInt);
        System.out.println(meuFloat);
    }}

Exercício 4

    public class JP_1_4 {
    
    public static void main(String[] args) {

        int idade = 36, ano = 1989;

        double altura = 1.80, peso = 89.500;

        int idadeSoma = (idade+ano);
        int idadeSub = (idade-ano);
        int idadeMult = (idade*ano);
        int idadeDiv = (idade/ano);

        double alturaSoma = (altura+peso);
        double alturaSub = (altura-peso);
        double alturaMult = (altura*peso);
        double alturaDiv = (altura/peso);

        double idadeAlturaSoma = (idadeSoma+alturaSoma);
        double idadeAlturaSub = (idadeSub-alturaSub);
        double idadeAlturaMult = (idadeMult*alturaMult);
        double idadeAlturaDiv = (idadeDiv/alturaDiv);
      
        System.out.println(idadeSoma);
        System.out.println(idadeSub);
        System.out.println(idadeMult);
        System.out.println(idadeDiv);
        System.out.println(alturaSoma);
        System.out.println(alturaSub);
        System.out.println(alturaMult);
        System.out.println(alturaDiv);
        System.out.println(idadeAlturaSoma);
        System.out.println(idadeAlturaSub);
        System.out.println(idadeAlturaMult);
        System.out.println(idadeAlturaDiv);
    }}

Exercício 5

    public class JP_1_5 {
    
    public static void main(String[] args) {

        boolean estudanteAprovado = true;
        boolean temAtestado = false;

        boolean condicao1 = estudanteAprovado && !temAtestado;
        System.out.println("Aprovado E não tem atestado: " + condicao1);

        boolean condicao2 = estudanteAprovado || temAtestado;
        System.out.println("Aprovado OU tem atestado: " + condicao2);

        boolean condicao3 = !estudanteAprovado;
        System.out.println("Não foi aprovado: " + condicao3);
    }
    }

    //Atividade 5: Booleans e Lógica
    //Objetivo: Compreender o uso do tipo boolean e operadores lógicos.
    //Instruções: Crie duas variáveis booleanas, estudanteAprovado e temAtestado. Baseado nas variáveis, crie uma expressão booleana que imprima true ou false para as seguintes condições:
    //O aluno foi aprovado E não tem atestado.
    //O aluno foi aprovado OU tem atestado.
    //O aluno não foi aprovado.

Desafio 1

    public class JP_1_Desafio_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a); // Deve imprimir 25
        System.out.println("b = " + b); // Deve imprimir 10
    }
    }

Desafio 2

    public class JP_1_Desafio_2 {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 9;

        // Conversão explícita para garantir precisão decimal
        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("A média é: " + media); // Deve imprimir 8.0
    }
    }
    
Exercício 6

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


Exercício Oracle Input Variables

    import java.util.Scanner;
    
    /**
     * Inputar a leitura do usuário no console utilizando a classe java scanner, você deve usar o método mais importante para acessar a classe, java.util.Scanner.
     */
    
    public class inputvariables {
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /**
         * Você deveria explorar a classe Scanner mais profundamente, você verá que a muitos métodos diferentes de leitura, vindo do console.
         */
        boolean boolVal = true;
        byte byteVal = 2;
        char charVal = 'J';
        short shortVal = 12;
        int intVal = 36;
        long longVal = 456789;
        float floatVal = 1.80f;
        double doubleVal = 8;
    
        
            System.out.print("Please enter a double value: ");
        doubleVal = in.nextDouble();
        in.close();
        System.out.println("boolean value: " + boolVal);
        System.out.println("byte value : " + byteVal);
        System.out.println("char value : " + charVal);
        System.out.println("short value : " + shortVal);
        System.out.println("int value : " + intVal);
        System.out.println("long value : " + longVal);
        System.out.println("double value : " + floatVal);
        System.out.println("double value : " + doubleVal);
        }//end method main
    }//end class InputVariables
    
    //Programas são sempre melhores quando você usa a interatividade. 

Exercício Oracle Age Checker

    import java.util.Scanner;
    
    public class AgeChecker {
    
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int age;
            @SuppressWarnings("unused")
            char holdLicence;
    
            System.out.print("Please enter your age: ");
    
            //Leia o valor do caractere para identificar se um usuário está permitido a dirigir.
    
            age = in.nextInt();
    
            System.out.println("Do you hold a current driving licence? ");
    
            holdLicence = in.next().charAt(0);
    
            if((age > 20) && (holdLicence == 'y'))
    
            //Você precisa de ambos 21 ou acima e ter uma licença para dirigir um carro.
    
                System.out.println("You are an adult and can hire a car");
            else
                System.out.println("You are not an adult so cannot hire a car");
            //endif
            in.close();

Exercício 1 Etapa 2

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
        
                //Vamos ver se o usuário pode dirigir.
        
            }//end method main
        }//end class AgeChecker


Exercício 2 Etapa 2

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


Exercício 3 Etapa 2

    public class Produto {
        
        // 1. Atributos privados
        private String nome;
        private double preco;
        private int qtdemestoque;
    
        // Getter para Nome
        public String getNome() {
            return nome;
        }
    
        // Setter para Nome
        public void setNome(String n) {
            this.nome = n;
        }
    
        // Getter para Preco
        public double getPreco() {
            return preco;
        }
    
        // Setter para Preco
        public void setPreco(double pr) {
            this.preco = pr;
        }    
    
        // Getter para QtdEmEstoque
        public double getQtdEmEstoque() {
            return qtdemestoque;
        }
    
        // Setter para QtdEmEstoque
        public void setQtdEmEstoque(int qt) {
            this.qtdemestoque = qt;
        }
        public static void main(String[] args) {
            // Criando objeto da própria classe
            Produto produto = new Produto();
    
            // Setando valores
            produto.setNome("Café");
            produto.setPreco(75);
            produto.setQtdEmEstoque(16);
    
            // Imprimindo nome
            System.out.println("Nome Do Produto: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
            System.out.println("Quantidade em Estoque: " + produto.getQtdEmEstoque());
        }
    }


Exercício 4 Etapa 2 Conta Bancária

    import javax.swing.JOptionPane;
    /**
     *
     * @author Aluno
     */
    public class Bank {
    
        public static final String USUARIO = "Java";
        public static final String SENHA = "abc@123";
        public static double saldo = 0;
    
        public static void main(String[] args) {
    
            int tentativas = 3;
            boolean loginValido = false;
    
            while (tentativas > 0 && !loginValido) {
                String usuarioInformado = JOptionPane.showInputDialog("Digite o usuário:");
                String senhaInformada = JOptionPane.showInputDialog("Digite a senha:");
    
                if (usuarioInformado.equals(USUARIO) && senhaInformada.equals(SENHA)) {
                    loginValido = true;
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                } else {
                    tentativas--;
                    JOptionPane.showMessageDialog(null, "Login inválido! Tente novamente. Você tem " + tentativas + " tentativas restantes.");
                }
            }
    
            if (!loginValido) {
                JOptionPane.showMessageDialog(null, "Acesso bloqueado!");
                System.exit(0);
            }
    
            while (true) {
                int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        new String[]{"Consultar Saldo", "Sacar", "Empréstimo", "Depósito", "Sair"}, null);
    
                switch (opcao) {
                    case 0:
                        consultarSaldo();
                        break;
                    case 1:
                        sacar();
                        break;
                    case 2:
                        emprestimo();
                        break;
                    case 3:
                        depositar();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                }
            }
        }
    
        public static void consultarSaldo() {
            JOptionPane.showMessageDialog(null, "Saldo: R$" + String.format("%.2f", saldo));
        }
    
        public static void sacar() {
            try {
                double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
    
                if (valorSaque > saldo) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                } else if (valorSaque <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                } else {
                    saldo -= valorSaque;
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! Saldo atual: R$" + String.format("%.2f", saldo));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
            }
        }
    
        public static void emprestimo() {
            try {
                double valorEmprestimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empréstimo:"));
    
                if (valorEmprestimo > saldo * 2) {
                    JOptionPane.showMessageDialog(null, "Valor do empréstimo excede o limite!");
                } else if (valorEmprestimo <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                } else {
                    int parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite em quantas vezes deseja pagar:"));
                    if (parcelas <= 0) {
                        JOptionPane.showMessageDialog(null, "Número de parcelas inválido!");
                        return;
                    }
    
                    double valorParcela = valorEmprestimo / parcelas;
                    saldo += valorEmprestimo;
    
                    JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!\nValor da parcela: R$" +
                            String.format("%.2f", valorParcela) + "\nNovo saldo: R$" + String.format("%.2f", saldo));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite números válidos.");
            }
        }
    
        public static void depositar() {
            try {
                double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
    
                if (valorDeposito <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                } else {
                    saldo += valorDeposito;
                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso! Saldo atual: R$" + String.format("%.2f", saldo));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
            }
        }
    }


Exercício 5 Etapa 2 - Calcular Área do Retângulo

    public class Retangulo {
        //Atributos privados
        private double altura;
        private double largura;
    
        //Setters
        public void setAltura(double altura) {
            this.altura = altura;
        }
    
        public void setLargura(double largura) {
            this.largura = largura;
        }
    
        //Getters usando para calcular a area
        public double getArea() {
            return altura * largura;
        }
    
        //Fazendo teste 
        public static void main(String[] args) {
            Retangulo r = new Retangulo();
            r.setAltura(5);
            r.setLargura(3);
            System.out.println("Área do retângulo: " + r.getArea());
        }
    }


Desafio 1 Etapa 2 - Classificação de Alunos

    public class Aluno {
        //Atributos privados
        private String nome;
        private double nota;
    
        //Getter e Setter
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        //Getter e Setter com validação
        public double getNota() {
            return nota;
        }
    
        public void setNota(double nota) {
            if (nota >= 0 && nota <= 10) {
                this.nota = nota;
            } else {
                throw new IllegalArgumentException("Nota inválida!!! Atenção nota deve estar entre 0 e 10");
            }
        }
    
        //Getter adicional para Status
        public String getStatus() {
            if (nota >= 7) {
                return "Aprovado";
            } else if (nota >= 5) {
                return "Em Recuperação";
            } else {
                return "Reprovado";
            }
        }
    
        //Método para teste, junto com try catch para exceção de erro
        public static void main(String[] args) {
            Aluno aluno = new Aluno();
            aluno.setNome("João");
    
            try {
                aluno.setNota(6.5);
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("Nota: " + aluno.getNota());
                System.out.println("Status: " + aluno.getStatus());
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }


Desafio 2 Etapa 2 - Encapsulamento de Array

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


Exercício 6 Etapa 2 - Livro

    import java.util.ArrayList;
    
    //A função classe atribui como string o título e autor
    public class Livro {
        
        String titulo;
        String autor;
    
        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }
    
        // A função info retorna a formatação que no caso é a descrisão do título e autor do livro
        public String getInfo() {
            return "Título: " + this.titulo + ", Autor: " + this.autor;
        }
    }
    
    // Classe Biblioteca.java
    
    
    class Biblioteca {
        ArrayList<Livro> livros;
    
        public Biblioteca() {
            this.livros = new ArrayList<>();
        }
    
        public void adicionarLivro(Livro livro) {
            this.livros.add(livro);
        }
    
        public void listarLivros() {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : this.livros) {
                System.out.println(livro.getInfo());
            }
        }
    }
    
    // Classe Main.java
    class Main {
    
        //O Array nesse caso serve para armarzenar cada livro com seu título e autor
        public static void main(String[] args) {
            Biblioteca minhaBiblioteca = new Biblioteca();
            Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
            Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");
    
            minhaBiblioteca.adicionarLivro(livro1);
            minhaBiblioteca.adicionarLivro(livro2);
            minhaBiblioteca.listarLivros();
        }
    }


Exercício 7 Etapa 2 - Teste Array List

    import java.util.ArrayList;
    
    public class TesteArrayList {
        public static void main(String[] args) {
            
    
            //Primeiro vamos utilizar um Array que deve ter um tamanho fixo
            String[] frutasArray = new String[3];
            frutasArray[0] = "Laranja";
            frutasArray[1] = "Maça";
            frutasArray[2] = "Manga";
    
            System.out.println("Array de tamanho fixo");
            for (String fruta : frutasArray) {
                System.out.println(fruta);
            }
            System.out.println("Tamanho do Array: " + frutasArray.length);
    
            //Se tentarmos adicionar mais um elemento isso causará um erro pq o Array é fixo
    
            //Agora irei usar um ArrayList que é uma coleção dinâmica 
            ArrayList<String> frutasList = new ArrayList<>();
            frutasList.add("Laranja");
            frutasList.add("Maça");
            frutasList.add("Manga");
            frutasList.add("Abacate");
            frutasList.add("Pera"); //Aqui podemos colocar inúmeros elementos
    
            System.out.println("\n No ArrayList o tamanho é dinâmico");
            for (String fruta : frutasList) {
                System.out.println(fruta);
            }
            System.out.println("Tamanho do ArrayList: " + frutasList.size());
            }
    }


Exercício 8 Etapa 2 - Herança Array Livro

    import java.util.ArrayList;
    
    //Superclasse
    class Livro {
        private String titulo;
        private String autor;
    
        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }
    
        public String getTitulo() {
            return titulo;
        }
    
        public String getAutor() {
            return autor;
        }
    
        //Esse método pode ser sobrescrito pelas subclasses
        public String getDescricao() {
            return "Título: " + titulo + " | Autor: " + autor;
        }
    }
    
    //Subclasse Livro Físico
    class LivroFisico extends Livro {
        private int numeroPaginas;
    
        public LivroFisico(String titulo, String autor, int numeroPaginas) {
            super(titulo, autor);
            this.numeroPaginas = numeroPaginas;
        }
    
        public String getDescricao() {
            return super.getDescricao() + " | Páginas: " + numeroPaginas;
        }
    
    }
    
    //Subclasse Ebook
    class Ebook extends Livro {
        private String formato;
    
        public Ebook(String titulo, String autor, String formato) {
            super(titulo, autor);
            this.formato = formato;
        }
    
        public String getDescricao() {
            return super.getDescricao() + " | Formato: " + formato;
        }
    }
    
    //Classe Biblioteca
    class Biblioteca {
        private ArrayList<Livro> livros = new ArrayList<>();
    
        public void adicionarLivro(Livro livro) {
            livros.add(livro);
        }
    
        public void listarLivros() {
            System.out.println("\n Lista de Livros na Biblioteca: ");
            for (Livro livro : livros) {
                System.out.println(livro.getDescricao());
            }
        }
    }
    
    
    // A classe principal
    public class HerançaArrayLivro {
        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();
    
            //Instâncias criadas
            LivroFisico livro1 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
            Ebook ebook1 = new Ebook("Clean Code", "Robert C. Martin", "PDF");
    
            //Adicionando na biblioteca
            biblioteca.adicionarLivro(livro1);
            biblioteca.adicionarLivro(ebook1);
    
            //Listando
            biblioteca.listarLivros();
        }
    }

Exercício 9 Etapa 2 - Veículo

    //Interface que define o comportamento dos veículos
    public interface Veiculo {
        //Método para calcular o custo por km
        double calcularCustoPorKm(double distancia);
        String getTipo();
    }
    
    //Classe que representa um carro e implementa a interface veículo 
    class Carro implements Veiculo {
        //Consumo por litro em km e valor do combustivel por litro
        private final double consumoPorLitro;
        private final double precoCombustivelPorLitro;
    
        //Construtor que inicializa os atributos do carro
        public Carro(double consumoPorLitro, double precoCombustivelPorLitro) {
            this.consumoPorLitro = consumoPorLitro;
            this.precoCombustivelPorLitro = precoCombustivelPorLitro;
        }
    
        //Implementação do cálculo de custo por km
        @Override
        public double calcularCustoPorKm(double distancia) {
            return (distancia / consumoPorLitro) * precoCombustivelPorLitro;
        }
    
        //Retorna o tipo do veículo
        @Override
        public String getTipo() {
            return "Carro";
        }
    }
    
    //Classe que representa uma bicicleta e implementa a interface veículo 
    class Bicicleta implements Veiculo {
        //Custo manutenção por km
        private final double custoDeManutencaoPorKm;
    
        //Construtor que inicializa o custo da manutenção
        public Bicicleta(double custoDeManutencaoPorKm) {
            this.custoDeManutencaoPorKm = custoDeManutencaoPorKm;
        }
    
        //Implementação do cálculo de custo por km
        @Override
        public double calcularCustoPorKm(double distancia) {
            return distancia * custoDeManutencaoPorKm;
        }
    
        //Retorna o tipo de veículo
        @Override
        public String getTipo() {
            return "Bicicleta";
        }
    }
    
    //Classe principal para executar o programa
    class Main {
        public static void main(String[] args) {
            //Criação dos objetos com consumo e custo
            Veiculo carro = new Carro(12.0, 6.00); // 12 km/L, R$ 6,00/L
            Veiculo bicicleta = new Bicicleta(0.15); // R$ 0,15/km
    
            //Distância percorrida
            double distancia = 40.0;
    
            //Exibe custo para o carro
            System.out.println("Veículo: " + carro.getTipo());
            System.out.printf("Custo para %.1f km: R$ %.2f%n", distancia, carro.calcularCustoPorKm(distancia));
    
            //Exibe o custo para bicicleta
            System.out.println("\nVeículo: " + bicicleta.getTipo());
            System.out.printf("Custo para %.1f km: R$ %.2f%n", distancia, bicicleta.calcularCustoPorKm(distancia));
        }
    }

Exercício 10 Etapa 2 - Forma - Cálculo Geométrico

    import java.util.ArrayList;
    import java.util.List;
    
    //Interface Veiculo 
    public interface Forma {
        double getArea();
        double getPerimetro();
    }
    //Chave para Implementar a Circulo
    class Circulo implements Forma {
        private final double raio;
    
        public Circulo(double raio) {
            this.raio = raio;
        }
    
        @Override
        public double getArea() {
            return Math.PI * raio * raio;
        }
    
        @Override
        public double getPerimetro() {
            return 2 * Math.PI * raio;
        }
    }
    //Chave para Implementar a Retangulo
    class Retangulo implements Forma {
        private final double largura;
        private final double altura;
    
        public Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }
    
        @Override
        public double getArea() {
            return largura * altura;
        }
    
        @Override
        public double getPerimetro() {
            return 2 * (largura + altura);
        }
    }
    
    //Metodo para teste
    class Main {
        public static void main(String[] args) {
            List<Forma> formas = new ArrayList<>();
            formas.add(new Circulo(3.0));       // Raio = 3.0
            formas.add(new Retangulo(4.0, 5.0)); // Largura = 4.0, Altura = 5.0
    
            for (Forma forma : formas) {
                System.out.println("----------------------------");
                System.out.printf("Área: %.2f%n", forma.getArea());
                System.out.printf("Perímetro: %.2f%n", forma.getPerimetro());
            }
        }
    }

Exercício 1 Etapa 3 - Exemplo ArrayList

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

Exercício 2 Etapa 3 - Exemplo HashSet

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

Exercício 3 Etapa 3 - Exemplo HashMap

    import java.util.HashMap;
    import java.util.Map;
    
    public class ExemploHashMap {
        public static void main(String[] args) {
            // Criamos um mapa onde a chave é um Integer (matrícula) e o valor é uma String (nome do aluno)
            // Importante: Map não é uma Collection, mas uma estrutura separada da API de coleções do Java.
            // Por isso, ele usa dois tipos genéricos: um para a chave e outro para o valor.
            Map<Integer, String> alunos = new HashMap<>();
    
            // 1. Adicionar alunos (pares de matrícula-nome)
            System.out.println("--- Cadastrando alunos ---");
            // put(): insere um par chave-valor no mapa. Se a chave já existir, o valor é substituído.
            alunos.put(101, "João Silva");
            alunos.put(102, "Maria Oliveira");
            alunos.put(103, "Carlos Santos");
            System.out.println("Mapa de alunos: " + alunos); // Ex: {101=João Silva, 102=Maria Oliveira, 103=Carlos Santos}
    
            // 2. Encontrar o nome de um aluno pela sua matrícula (chave)
            System.out.println("\n--- Buscando um aluno ---");
            // get(): retorna o valor associado à chave informada.
            // Essa operação é extremamente eficiente, pois não é necessário percorrer toda a estrutura.
            String nomeAluno = alunos.get(102);
            System.out.println("O nome do aluno com matrícula 102 é: " + nomeAluno); // Saída: Maria Oliveira
    
            // 3. Verificar se uma matrícula já existe
            // containsKey(): verifica se a chave está presente no mapa
            boolean temMatricula = alunos.containsKey(101);
            System.out.println("A matrícula 101 existe? " + temMatricula); // Saída: true
    
            // 4. Remover um aluno pela sua matrícula
            System.out.println("\n--- Removendo um aluno ---");
            // remove(): exclui o par associado à chave informada
            alunos.remove(103);
            System.out.println("Mapa após remover o aluno 103: " + alunos);
        }
    }
