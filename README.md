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

        //Conversão explícita para garantir precisão decimal
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
            
            //Declaracao de variaveis com nomes descritivos em camelCase.
            int intergerValue = 25;
            char characterValue = 'B';
            boolean isActive = true;
            
            //Exibicao dos valores com mensagens claras.
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
    
        //Getter para obter o valor de Nome
        public String getNome() {
            return Nome;
        }
    
        //Setter para definir um novo valor para Nome
        public void setNome(String n) {
            //Poderia adicionar validações aqui, por exemplo
            this.Nome = n;
        }
        private int Idade; // Atributo privado
    
        //Getter para obter o valor de Idade
        public int getIdade() {
            return Idade;
        }
    
        //Setter para definir um novo valor para Idade
        public void setIdade(int id) {
            //Poderia adicionar validações aqui, por exemplo
            this.Idade = id;
        }
        public static void main(String[] args) {
            
        
        //Getters e Setters públicos
            Pessoa pessoa = new Pessoa();
    
            
            //Os setters para atribuir valores
            pessoa.setNome("João");
            
            pessoa.setIdade(30);
            
            //Os getters para obter e imprimir os valores
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
        }
    }
        
                //Vamos ver se o usuário pode dirigir.
        
            }//end method main
        }//end class AgeChecker


Exercício 2 Etapa 2

    public class JP_2_2 {
    
        //Atributos privados
        private String nome;
        private int idade;
    
        //Getter para Nome
        public String getNome() {
            return nome;
        }
    
        //Setter para Nome
        public void setNome(String n) {
            this.nome = n;
        }
    
        //Getter para Idade
        public int getIdade() {
            return idade;
        }
    
        //Setter para Idade
        public void setIdade(int id) {
            this.idade = id;
        }
    
        public static void main(String[] args) {
            //Criando objeto da própria classe
            JP_2_2 pessoa = new JP_2_2();
    
            //Setando valores
            pessoa.setNome("João");
            pessoa.setIdade(7);
    
            //Validação
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
        
        //Atributos privados
        private String nome;
        private double preco;
        private int qtdemestoque;
    
        //Getter para Nome
        public String getNome() {
            return nome;
        }
    
        //Setter para Nome
        public void setNome(String n) {
            this.nome = n;
        }
    
        //Getter para Preco
        public double getPreco() {
            return preco;
        }
    
        //Setter para Preco
        public void setPreco(double pr) {
            this.preco = pr;
        }    
    
        //Getter para QtdEmEstoque
        public double getQtdEmEstoque() {
            return qtdemestoque;
        }
    
        //Setter para QtdEmEstoque
        public void setQtdEmEstoque(int qt) {
            this.qtdemestoque = qt;
        }
        public static void main(String[] args) {
            //Criando objeto da própria classe
            Produto produto = new Produto();
    
            //Setando valores
            produto.setNome("Café");
            produto.setPreco(75);
            produto.setQtdEmEstoque(16);
    
            //Imprimindo nome
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
    
        //A função info retorna a formatação que no caso é a descrisão do título e autor do livro
        public String getInfo() {
            return "Título: " + this.titulo + ", Autor: " + this.autor;
        }
    }
    
    //Classe Biblioteca.java
    
    
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
    
    //Classe Main.java
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
    
    
    //A classe principal
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
            //Criamos uma lista que só aceita Strings (nomes de alunos)
            //O uso de <String> é um exemplo de generics, que garante que apenas Strings sejam armazenadas.
            //Isso evita erros como tentar adicionar um número ou outro tipo de dado.
            ArrayList<String> listaPresenca = new ArrayList<>();
    
            //Adicionando nomes à lista (na ordem de chegada)
            System.out.println("--- Adicionando nomes ---");
            listaPresenca.add("Ana");
            listaPresenca.add("Bruno");
            listaPresenca.add("Carla");
            System.out.println("Lista inicial: " + listaPresenca); // [Ana, Bruno, Carla]
    
            //Acessando um nome pela posição (índice)
            String primeiroNome = listaPresenca.get(0); // índice 0 = primeiro da lista
            System.out.println("O primeiro nome da lista é: " + primeiroNome); // Ana
    
            //Removendo um nome da lista
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
            //Criamos um conjunto que só aceita Strings (tarefas)
            //O uso de Set<String> com HashSet garante tipagem segura por meio de generics.
            //Isso evita que tipos diferentes sejam adicionados por engano, como números ou objetos não relacionados.
            Set<String> tarefas = new HashSet<>();
    
            //Adicionar tarefas ao conjunto
            System.out.println("--- Adicionando tarefas ---");
            tarefas.add("Comprar pão");
            tarefas.add("Estudar Java");
            tarefas.add("Comprar pão"); // Tentando adicionar uma duplicata
            tarefas.add("Lavar o carro");
    
            //A principal característica do HashSet é que ele não permite duplicatas.
            //A segunda chamada add("Comprar pão") é ignorada silenciosamente.
            System.out.println("Conjunto de tarefas: " + tarefas);
    
            //Importante: HashSet não garante a ordem dos elementos.
            //A ordem de impressão pode variar a cada execução.
            //Exemplo possível: [Lavar o carro, Comprar pão, Estudar Java]
    
            //Verificar se uma tarefa já existe
            boolean temTarefa = tarefas.contains("Estudar Java"); // contains(): verifica se o elemento está presente
            System.out.println("\nA tarefa 'Estudar Java' está no conjunto? " + temTarefa); // Saída: true
            
            //Remover uma tarefa
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
            //Criamos um mapa onde a chave é um Integer (matrícula) e o valor é uma String (nome do aluno)
            //Importante: Map não é uma Collection, mas uma estrutura separada da API de coleções do Java.
            //Por isso, ele usa dois tipos genéricos: um para a chave e outro para o valor.
            Map<Integer, String> alunos = new HashMap<>();
    
            //Adicionar alunos (pares de matrícula-nome)
            System.out.println("--- Cadastrando alunos ---");
            //put(): insere um par chave-valor no mapa. Se a chave já existir, o valor é substituído.
            alunos.put(101, "João Silva");
            alunos.put(102, "Maria Oliveira");
            alunos.put(103, "Carlos Santos");
            System.out.println("Mapa de alunos: " + alunos); // Ex: {101=João Silva, 102=Maria Oliveira, 103=Carlos Santos}
    
            //Encontrar o nome de um aluno pela sua matrícula (chave)
            System.out.println("\n--- Buscando um aluno ---");
            //get(): retorna o valor associado à chave informada.
            //Essa operação é extremamente eficiente, pois não é necessário percorrer toda a estrutura.
            String nomeAluno = alunos.get(102);
            System.out.println("O nome do aluno com matrícula 102 é: " + nomeAluno); //Saída: Maria Oliveira
    
            //Verificar se uma matrícula já existe
            //containsKey(): verifica se a chave está presente no mapa
            boolean temMatricula = alunos.containsKey(101);
            System.out.println("A matrícula 101 existe? " + temMatricula); //Saída: true
    
            //Remover um aluno pela sua matrícula
            System.out.println("\n--- Removendo um aluno ---");
            //remove(): exclui o par associado à chave informada
            alunos.remove(103);
            System.out.println("Mapa após remover o aluno 103: " + alunos);
        }
    }

Exercício 4 Etapa 3 - Generics Class

    import java.util.ArrayList;
    import java.util.List;
    
    //Classe genérica personalizada que armazena um item do tipo T
    class Caixa<T> {
        private T item;
    
        //Método para adicionar um item à caixa
        public void adicionar(T item) {
            this.item = item;
        }
    
        //Método para obter o item da caixa
        public T obter() {
            return this.item;
        }
    
        //Método extra para verificar se há item na caixa
        public boolean temItem() {
            return this.item != null;
        }
    
        //Método extra para limpar o conteúdo da caixa
        public void limpar() {
            this.item = null;
        }
    }
    
    //Enum que representa os gêneros de filmes
    enum Genero {
        ACAO, COMEDIA, DRAMA, FICCAO_CIENTIFICA
    }
    
    //Classe base Filme
    class Filme {
        private String titulo;
        private Genero genero;
    
        public Filme(String titulo, Genero genero) {
            this.titulo = titulo;
            this.genero = genero;
        }
    
        @Override
        public String toString() {
            return "Filme{" + "titulo='" + titulo + '\'' + ", genero=" + genero + '}';
        }
    }
    
    //Subclasse de Filme para testar wildcard
    class FilmeInfantil extends Filme {
        public FilmeInfantil(String titulo, Genero genero) {
            super(titulo, genero);
        }
    }
    
    public class AulaGenerics {
        //Método genérico que aceita listas de Filme ou de suas subclasses
        public static void imprimirListaFilmes(List<? extends Filme> lista) {
            System.out.println("Lista de Filmes:");
            for (Filme filme : lista) {
                System.out.println(filme);
            }
        }
    
        public static void main(String[] args) {
            //Usando a classe genérica com String
            Caixa<String> caixaString = new Caixa<>();
            caixaString.adicionar("Java para Iniciantes");
            System.out.println("Conteúdo da caixa de String: " + caixaString.obter());
    
            //Usando a classe genérica com Integer
            Caixa<Integer> caixaInteger = new Caixa<>();
            caixaInteger.adicionar(123);
            System.out.println("Conteúdo da caixa de Integer: " + caixaInteger.obter());
    
            //Demonstração de segurança de tipos
            //caixaString.adicionar(100); //ERRO: tipo incompatível (descomente para ver o erro de compilação)
    
            //Criando lista de filmes
            List<Filme> filmes = new ArrayList<>();
            filmes.add(new Filme("O Chamado", Genero.ACAO));
            filmes.add(new Filme("A Chegada", Genero.FICCAO_CIENTIFICA));
    
            //Imprimindo lista de filmes usando wildcard
            imprimirListaFilmes(filmes);
    
            //Criando lista de filmes infantis (subclasse de Filme)
            List<FilmeInfantil> filmesInfantis = new ArrayList<>();
            filmesInfantis.add(new FilmeInfantil("Toy Story", Genero.COMEDIA));
            filmesInfantis.add(new FilmeInfantil("Divertida Mente", Genero.DRAMA));
    
            //Imprimindo lista de filmes infantis usando o mesmo método genérico
            imprimirListaFilmes(filmesInfantis);
        }
    }

Exercício 1 Etapa 4 - Analise URL

    import java.util.Scanner;
    
    public class AnaliseURL {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            //Entrada da URL
            System.out.print("Digite a URL: ");
            String url = scanner.nextLine();
    
            System.out.println("\nURL em análise: " + url);
            System.out.println("----------------------------------------");
    
            //Verificar protocolo
            boolean usaHttp = url.startsWith("http://");
            boolean usaHttps = url.startsWith("https://");
    
            System.out.println("Usa HTTPS? " + usaHttps);
            System.out.println("Usa HTTP?  " + usaHttp);
    
            //Verificar se contém ".com"
            boolean isComercial = url.contains(".com");
            System.out.println("Contém .com? " + isComercial);
    
            //Extrair domínio
            int inicioProtocolo = url.indexOf("://");
            int inicioDominio = inicioProtocolo + 3;
            int fimDominio = url.indexOf("/", inicioDominio);
    
            if (fimDominio == -1) {
                fimDominio = url.length();
            }
    
            String dominio = url.substring(inicioDominio, fimDominio);
    
            System.out.println("----------------------------------------");
            System.out.println("Domínio extraído: " + dominio);
        }
    }

Exercício 2 Etapa 4 - Parsing Registro

    public class ParsingRegistro {
        public static void main(String[] args) {
            //Registro fornecido
            String registro = "007;Juan Carlo;Java Programming;10";
    
            System.out.println("Registro Original: " + registro);
            System.out.println("----------------------------------------");
    
            //Separar os dados usando split()
            String[] dados = registro.split(";");
    
            //Verificar se o registro tem exatamente 4 partes
            if (dados.length == 4) {
                String matricula = dados[0];
                String nome = dados[1].toUpperCase(); // 2. Nome em maiúsculas
                String curso = dados[2];
                String nota = dados[3]; // 3. Nota como último elemento
    
                //Exibir os dados formatados
                System.out.println("Matrícula: " + matricula);
                System.out.println("Nome:      " + nome);
                System.out.println("Curso:     " + curso);
                System.out.println("Nota:      " + nota);
            } else {
                System.out.println("Erro: O formato do registro não corresponde ao esperado.");
            }
        }
    }

Exercício 3 Etapa 4 - Construtor Email

    public class ConstrutorEmail {
        public static void main(String[] args) {
            //Array de destinatários
            String[] destinatarios = {
                "ana@dominio.com",
                "beto@dominio.com",
                "carla@dominio.com",
                "daniel@dominio.com"
            };
    
            System.out.println("Lista de Destinatários:");
    
            //Criar StringBuilder vazio
            StringBuilder listaEmails = new StringBuilder();
    
            //Adicionar cada e-mail seguido de ponto e vírgula
            for (String email : destinatarios) {
                listaEmails.append(email);
                listaEmails.append(";"); // delimitador
            }
    
            //Exibir string com delimitador extra
            System.out.println("String construída (com delimitador extra): " + listaEmails.toString());
    
            //Remover o último caractere (;)
            if (listaEmails.length() > 0) {
                listaEmails.deleteCharAt(listaEmails.length() - 1);
            }
    
            System.out.println("----------------------------------------");
    
            //Imprimir a string final convertida
            String resultadoFinal = listaEmails.toString();
            System.out.println("Lista de E-mails Final: " + resultadoFinal);
        }
    }

Exercício 4 Etapa 4 - Validação Código Numerico

    import java.util.regex.Pattern;
    import java.util.regex.Matcher;
    
    public class ValidacaoCodigoNumerico {
        public static void main(String[] args) {
            //Expressão regular: exatamente 6 dígitos
            String regex = "\\d{6}";
            Pattern padrao = Pattern.compile(regex);
    
            //Exemplos de códigos para teste
            String[] codigos = {
                "123456",   //Válido
                "12345",    //Inválido (5 dígitos)
                "12345a",   //Inválido (contém letra)
                "1234567",  //Inválido (7 dígitos)
                "000000"    //Válido
            };
    
            System.out.println("Padrão de validação: " + regex);
            System.out.println("----------------------------------------");
    
            //Testar cada código
            for (String codigo : codigos) {
                testarCodigo(padrao, codigo);
            }
        }
    
        public static void testarCodigo(Pattern padrao, String codigo) {
            Matcher matcher = padrao.matcher(codigo);
            boolean valido = matcher.matches();
    
            System.out.printf("Código '%s': %s%n", codigo, valido ? "VÁLIDO" : "INVÁLIDO");
        }
    }

Exercício 5 Etapa 4 - Buscar Palavras Longas

    import java.util.regex.Pattern;
    import java.util.regex.Matcher;
    
    public class BuscarPalavrasLongas {
        public static void main(String[] args) {
            //Texto de exemplo, não utilize acentuação
            String texto = "Este e um exercicio sobre Java e Expressoes Regulares em programacao.";
    
            //Expressão regular: palavras com 5 ou mais caracteres
            String regex = "\\w{5,}";
    
            //Compilar o padrão e criar o matcher
            Pattern padrao = Pattern.compile(regex);
            Matcher matcher = padrao.matcher(texto);
    
            System.out.println("Texto em análise: " + texto);
            System.out.println("----------------------------------------");
            System.out.println("Palavras com 5 ou mais caracteres:");
    
            int contador = 0;
    
            //Loop para encontrar todas as ocorrências
            while (matcher.find()) {
                String palavra = matcher.group();
                System.out.println(" - " + palavra);
                contador++;
            }
    
            System.out.println("----------------------------------------");
            System.out.println("Total de palavras longas encontradas: " + contador);
        }
    }

Exercício 6 Etapa 4 - Extração de Datas

    import java.util.regex.Pattern;
    import java.util.regex.Matcher;
    
    public class ExtracaoData {
        public static void main(String[] args) {
            //Texto contendo uma data no formato DD/MM/AAAA
            String texto = "A reunião está marcada para 30/09/2025, anote aí.";
    
            //Expressão regular com três grupos de captura: dia, mês e ano
            String regex = "(\\d{2})/(\\d{2})/(\\d{4})";
    
            //Compilar o padrão e criar o matcher
            Pattern padrao = Pattern.compile(regex);
            Matcher matcher = padrao.matcher(texto);
    
            System.out.println("Texto Original: " + texto);
            System.out.println("Padrão: " + regex);
            System.out.println("----------------------------------------");
    
            //Verificar se há correspondência
            if (matcher.find()) {
                String dia = matcher.group(1);   // Grupo 1: dia
                String mes = matcher.group(2);   // Grupo 2: mês
                String ano = matcher.group(3);   // Grupo 3: ano
    
                System.out.println("Data completa encontrada: " + matcher.group(0));
                System.out.println("Dia (Grupo 1): " + dia);
                System.out.println("Mês (Grupo 2): " + mes);
                System.out.println("Ano (Grupo 3): " + ano);
            } else {
                System.out.println("Data não encontrada no formato DD/MM/AAAA.");
            }
        }
    }

Exercício 7 Etapa 4 - Reverter String Recursiva

    public class ReverterStringRecursiva {
        public static void main(String[] args) {
            String original = "JAVAPROGRAMMING";
            String invertida = reverterString(original);
    
            System.out.println("String Original: " + original);
            System.out.println("----------------------------------------");
            System.out.println("String Invertida: " + invertida);
    
            //Extra: comparação com potência recursiva e iterativa
            int base = 2;
            int expoente = 10;
    
            int resultadoRecursivo = potenciaRecursiva(base, expoente);
            int resultadoIterativo = potenciaIterativa(base, expoente);
    
            System.out.println("\nBase: " + base + ", Expoente: " + expoente);
            System.out.println("----------------------------------------");
            System.out.println("Resultado Recursivo: " + resultadoRecursivo);
            System.out.println("Resultado Iterativo: " + resultadoIterativo);
        }
    
        //Método recursivo para inverter uma string
        public static String reverterString(String texto) {
            if (texto == null || texto.length() <= 1) {
                return texto; // Caso base
            }
            //Chamada recursiva: último caractere + reverso do restante
            return reverterString(texto.substring(1)) + texto.charAt(0);
        }
    
        //Método recursivo para calcular potência
        public static int potenciaRecursiva(int base, int expoente) {
            if (expoente == 0) return 1;
            return base * potenciaRecursiva(base, expoente - 1);
        }
    
        //Método iterativo para calcular potência
        public static int potenciaIterativa(int base, int expoente) {
            int resultado = 1;
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }
            return resultado;
        }
    }

Exercício 1 Etapa 5 - Calculador de Soma Simples

    import java.util.Scanner;
    
    public class CalculadoraSomaSimples {
    
        public static void main(String[] args) {
            //Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);
            
            //Variáveis para armazenar os números
            int primeiroNumero;
            int segundoNumero;
            int soma;
    
            //ENTRADA (INPUT)
            
            //Solicita e lê o primeiro número inteiro
            System.out.print("Por favor, digite o primeiro número inteiro: ");
            primeiroNumero = scanner.nextInt(); 
    
            //Solicita e lê o segundo número inteiro
            System.out.print("Agora, digite o segundo número inteiro: ");
            segundoNumero = scanner.nextInt();
            
            //Fecha o objeto Scanner para liberar recursos
            scanner.close(); 
            
            //PROCESSAMENTO
            
            //Calcula a soma
            soma = primeiroNumero + segundoNumero;
            
            //SAÍDA (OUTPUT)
            
            //Imprime o resultado da soma em um formato amigável
            System.out.println("\n--- Resultado ---");
            System.out.println("A soma dos números: " + primeiroNumero + " + " + segundoNumero + " = " + soma);
        }
    }

Exercício 2 Etapa 5 - Conversor de Unidades

    import java.util.Scanner;
    
    public class ConversorUnidades {
    
        public static void main(String[] args) {
            //Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);
            
            //Variáveis para armazenar os valores
            double valorEmMetros;
            double valorEmCentimetros;
            
            //O fator de conversão é uma constante
            final double FATOR_CONVERSAO = 100;
    
            //ENTRADA (INPUT)
            
            //Solicita e lê o valor em metros (tipo double/ponto flutuante)
            System.out.print("Digite o valor em metros (ex: 1,75): ");
            valorEmMetros = scanner.nextDouble(); 
    
            //Fecha o objeto Scanner
            scanner.close(); 
            
            //PROCESSAMENTO
            
            //Calcula o valor equivalente em centímetros
            valorEmCentimetros = valorEmMetros * FATOR_CONVERSAO;
            
            //SAÍDA (OUTPUT)
            
            //Imprime o resultado da conversão
            System.out.println("\n--- Conversão ---");
            System.out.println(valorEmMetros + " metros equivalem a " + valorEmCentimetros + " centímetros.");
        }
    }

Exercício 3 Etapa 5 - Perfil de Usuário

    import java.util.Scanner;
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import java.time.Period;
    
    public class PerfilUsuario {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
            //ENTRADA
            System.out.print("Digite seu nome completo: ");
            String nome = scanner.nextLine().trim();
    
            System.out.print("Digite a cidade onde você mora: ");
            String cidade = scanner.nextLine().trim();
    
            System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
            String dataNascimentoStr = scanner.nextLine().trim();
    
            scanner.close();
    
            //PROCESSAMENTO
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
            int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
    
            String regiao = identificarRegiao(cidade);
    
            //SAÍDA
            System.out.println("\n--- PERFIL CRIADO ---");
            System.out.println("Nome: " + nome);
            System.out.println("Cidade: " + cidade + " (" + regiao + ")");
            System.out.println("Data de nascimento: " + dataNascimento.format(formatter));
            System.out.println("Idade: " + idade + " anos");
        }
    
        //Método para identificar a região com base na cidade
        public static String identificarRegiao(String cidade) {
            String cidadeLower = cidade.toLowerCase();
    
            if (cidadeLower.contains("mauá")) {
                return "ABC Paulista, Região Metropolitana de São Paulo";
            } else if (cidadeLower.contains("santo andré") || cidadeLower.contains("são bernardo") || cidadeLower.contains("são caetano")) {
                return "ABC Paulista";
            } else if (cidadeLower.contains("são paulo")) {
                return "Capital Paulista";
            } else if (cidadeLower.contains("campinas")) {
                return "Região Metropolitana de Campinas";
            } else {
                return "Região não identificada";
            }
        }
    }

Exercício 4 Etapa 5 - Inversor De Palavras

    import java.util.Scanner;
    
    public class InversorDePalavras {
    
        /**
         * Inverte os caracteres de uma string usando StringBuilder.
         * @param palavra A palavra a ser invertida.
         * @return A palavra invertida.
         */
        public static String inverterString(String palavra) {
            return new StringBuilder(palavra).reverse().toString();
        }
    
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                
                //ENTRADA
                System.out.print("Digite ao menos três palavras separadas por espaço: ");
                String entrada = scanner.nextLine().trim();
    
                //Exibe a frase original
                System.out.println("Frase original: " + entrada);
    
                //PROCESSAMENTO
                String[] palavras = entrada.split("\\s+"); // Divide por qualquer quantidade de espaços
    
                if (palavras.length < 3) {
                    System.out.println("Erro: Digite pelo menos três palavras.");
                    return;
                }
    
                //Inverte a segunda palavra (índice 1)
                palavras[1] = inverterString(palavras[1]);
    
                //Reconstrói a frase modificada
                String fraseModificada = String.join(" ", palavras);
    
                //SAÍDA
                System.out.println("Frase modificada: " + fraseModificada);
            }
        }
    }

Exercício 5 Etapa 5 - Calculador IMC

    import java.util.Scanner;
    
    public class CalculadoraIMC {
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner scanner = new Scanner(System.in);
    
            // Solicita ao usuário informar o peso e a altura
            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();
    
            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();
    
            // Calcula o IMC
            double imc = peso / (altura * altura);
    
            // Determina a situação com base no IMC calculado
            String situacao;
            if (imc < 18.5) {
                situacao = "Você está abaixo do peso ideal";
            } else if (imc <= 24.9) {
                situacao = "Parabéns, você está em seu peso normal";
            } else if (imc <= 29.9) {
                situacao = "Você está acima de seu peso (sobrepeso)";
            } else if (imc <= 34.9) {
                situacao = "Obesidade grau I";
            } else if (imc <= 39.9) {
                situacao = "Obesidade grau II";
            } else {
                situacao = "Obesidade grau III";
            }
    
            // Exibe o valor do IMC e a situação na tela
            System.out.println("IMC: " + imc);
            System.out.println("Situação: " + situacao);
    
            scanner.close();
        }
    }

Exercício 6 Etapa 5 - Leitura Simples de Arquivo
# Para esse exercício tem que salvar um arquixo .txt, dentro da pasta que você irá criar seu código

# Arquivo .txt, (Nome do arquivo "entrada.txt"), abaixo:

    Primeira linha de texto.
    Java I/O é fundamental.
    Fim do arquivo.

# Código abaixo:

    import java.io.FileReader;
    import java.io.IOException;
    
    public class LeituraArquivoSimples {
    
        public static void main(String[] args) {
            //Define o nome do arquivo a ser lido
            String nomeArquivo = "entrada.txt";
            FileReader leitor = null; //Inicializa como null para permitir o fechamento no bloco finally
    
            System.out.println("Iniciando a leitura do arquivo: " + nomeArquivo + "\n");
    
            try {
                //Abre o arquivo utilizando FileReader (fluxo de caracteres)
                leitor = new FileReader(nomeArquivo);
                int caractereLido;
    
                //Lê o conteúdo do arquivo caractere por caractere
                //O método read() retorna o código ASCII do caractere ou -1 ao atingir o fim do arquivo
                while ((caractereLido = leitor.read()) != -1) {
                    //Converte o código ASCII para caractere e exibe no console
                    System.out.print((char) caractereLido);
                }
    
            } catch (IOException e) {
                //Captura e trata exceções de entrada/saída (ex: arquivo inexistente ou inacessível)
                System.err.println("\n--- ERRO de I/O ---");
                System.err.println("Falha ao ler o arquivo: " + e.getMessage());
            } finally {
                //Garante o fechamento do recurso FileReader, mesmo em caso de erro
                try {
                    if (leitor != null) {
                        leitor.close();
                        System.out.println("\n\nArquivo fechado com sucesso.");
                    }
                } catch (IOException e) {
                    //Trata possíveis erros durante o fechamento do arquivo
                    System.err.println("Erro ao fechar o arquivo: " + e.getMessage());
                }
            }
        }
    }

Exercício 7 Etapa 5 - Escrita Binária

# Nesse caso o código cria a escrita no arquivo seguinte ("dados_brutos.dat")

    import java.io.FileOutputStream;
    import java.io.IOException;
    
    public class EscritaBinaria {
    
        public static void main(String[] args) {
    
            //Define os dados a serem gravados no arquivo (valores em formato binário)
            byte[] dadosBinarios = {10, 20, 30, 40, 50, 60, 70};
            String caminhoArquivo = "dados_brutos.dat";
    
            System.out.println("Gravando " + dadosBinarios.length + " bytes no arquivo: " + caminhoArquivo);
    
            //Utiliza try-with-resources para garantir o fechamento automático do stream
            try (FileOutputStream fos = new FileOutputStream(caminhoArquivo)) {
    
                //Grava o array de bytes no arquivo
                fos.write(dadosBinarios);
    
                System.out.println("Gravação concluída com sucesso.");
    
            } catch (IOException e) {
                //Trata falhas de escrita ou acesso ao arquivo
                System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
            }
    
            //Observação: o arquivo gerado contém dados binários.
            //Ao abrir como texto, os bytes podem aparecer como símbolos ou caracteres ilegíveis.
        }
    }

Exercício 8 Etapa 5 - Produto 2

        import java.io.Serial;
        import java.io.Serializable;
        import java.util.Objects;
        
        /**
         * Classe Produto preparada para serialização.
         * Representa um item com nome, preço e código (não serializável).
         */
        public class Produto2 implements Serializable {
        
            @Serial
            private static final long serialVersionUID = 1L;
        
            private final String nome;
            private final double preco;
        
            /**
             * Campo marcado como 'transient':
             * Não será incluído na serialização.
             * Ideal para dados sensíveis ou temporários.
             */
            private transient int codigo;
        
            //Construtor
            public Produto2(String nome, double preco, int codigo) {
                this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
                this.preco = preco;
                this.codigo = codigo;
            }
        
            //Getters
            public String getNome() {
                return nome;
            }
        
            public double getPreco() {
                return preco;
            }
        
            public int getCodigo() {
                return codigo;
            }
        
            //toString aprimorado
            @Override
            public String toString() {
                return String.format("Produto {nome='%s', preco=%.2f, codigo=%d}", nome, preco, codigo);
            }
        
            //equals e hashCode para comparação e uso em coleções
            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (!(obj instanceof Produto2)) return false;
                Produto2 other = (Produto2) obj;
                return Double.compare(preco, other.preco) == 0 &&
                       Objects.equals(nome, other.nome);
                       //'codigo' é ignorado por ser transient
            }
    
        @Override
        public int hashCode() {
            return Objects.hash(nome, preco);
        }
    }

Exercício 9 Etapa 5 - Numerador de Linhas

    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.FileReader;
    import java.io.FileWriter;
    import java.io.IOException;
    
    /**
     * Lê um arquivo de texto linha por linha e grava em outro arquivo,
     * prefixando cada linha com seu número correspondente.
     */
    public class NumeradorDeLinhas {
    
        private static final String ARQUIVO_ENTRADA = "entrada.txt";
        private static final String ARQUIVO_SAIDA = "saida_numerada.txt";
    
        public static void main(String[] args) {
            System.out.println("Iniciando processamento do arquivo: " + ARQUIVO_ENTRADA);
            System.out.println("Gerando arquivo de saída: " + ARQUIVO_SAIDA + "\n");
    
            int numeroLinha = 1;
    
            //Try-with-resources garante fechamento automático dos streams
            try (
                BufferedReader leitor = new BufferedReader(new FileReader(ARQUIVO_ENTRADA));
                BufferedWriter escritor = new BufferedWriter(new FileWriter(ARQUIVO_SAIDA))
            ) {
                String linha;
    
                while ((linha = leitor.readLine()) != null) {
                    //Constrói a linha numerada com eficiência
                    StringBuilder linhaNumerada = new StringBuilder();
                    linhaNumerada.append(numeroLinha).append(": ").append(linha);
    
                    escritor.write(linhaNumerada.toString());
                    escritor.newLine();
    
                    System.out.println("✔ Linha " + numeroLinha + " processada: " + linha);
                    numeroLinha++;
                }
    
            } catch (IOException e) {
                System.err.println("Erro durante o processamento: " + e.getMessage());
                return;
            }
    
            System.out.println("\nProcessamento concluído. Total de " + (numeroLinha - 1) + " linhas gravadas.");
        }
    }

Exercício 10 Etapa 5 - Serialização e Desserialização

# Para executar esse código precisameros que o código do Exercício 8 Etapa 5 - Produto 2, esteja no mesmo pacote

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

Exercício 11 Etapa 5 - Aplicação Decorator (Esse exercício precisa ser desenvolvido dentro de uma pasta chamada "desafios"

    package desafios;
    
    import java.io.FilterWriter;
    import java.io.Writer;
    import java.io.BufferedWriter;
    import java.io.FileWriter;
    import java.io.IOException;
    
    /**
     * AplicacaoDecorator demonstra o uso do padrão Decorator em Java I/O.
     * Inclui a classe UpperCaseWriter que converte texto para maiúsculas
     * antes de escrever no arquivo.
     */
    public class AplicacaoDecorator {
    
        /**
         * UpperCaseWriter é um FilterWriter que converte todos os caracteres
         * para maiúsculas antes de escrever no Writer subjacente.
         */
        static class UpperCaseWriter extends FilterWriter {
    
            public UpperCaseWriter(Writer out) {
                super(out);
            }
    
            @Override
            public void write(String str) throws IOException {
                String upperCaseStr = str.toUpperCase();
                super.write(upperCaseStr, 0, upperCaseStr.length());
            }
    
            //Opcional: sobrescreve write(int c) para suportar escrita de caracteres individuais
            @Override
            public void write(int c) throws IOException {
                super.write(Character.toUpperCase(c));
            }
    
            //Opcional: sobrescreve write(char[] cbuf, int off, int len)
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                for (int i = off; i < off + len; i++) {
                    cbuf[i] = Character.toUpperCase(cbuf[i]);
                }
                super.write(cbuf, off, len);
            }
        }
    
        public static void main(String[] args) {
            String nomeArquivo = "maiusculo.txt";
            String fraseOriginal = "esta é uma frase de teste em letras minúsculas.";
    
            System.out.println("Frase original (minúscula): \"" + fraseOriginal + "\"");
            System.out.println("Gravando no arquivo " + nomeArquivo + " usando o UpperCaseWriter...");
    
            try (
                BufferedWriter escritor = new BufferedWriter(
                    new UpperCaseWriter(
                        new FileWriter(nomeArquivo)
                    )
                )
            ) {
                escritor.write(fraseOriginal);
                escritor.flush();
    
                System.out.println("\nEscrita concluída. Verifique o arquivo " + nomeArquivo + ".");
                System.out.println("O conteúdo deve estar em CAIXA ALTA.");
    
            } catch (IOException e) {
                System.err.println("\n--- ERRO DE I/O ---");
                System.err.println("Falha ao escrever ou fechar o arquivo: " + e.getMessage());
            }
        }
    }

Exercício 12 Etapa 5 -  Produto - Serviço - Estoque - Main (Implantação de Aplicações, Packages e Banco de Dados em Java)

Estrutura de Pastas e Arquivos

    br/
    └── com/
        └── estoque/
            ├── app/
            │   └── Main.java
            ├── modelo/
            │   └── Produto.java
            └── servico/
                └── ServicoEstoque.java

Conteúdo de cada arquivo

Produto.java (em br/com/estoque/modelo/)

    package br.com.estoque.modelo;
    
    /**
     * Classe de Modelo (Dados): Representa um item no estoque.
     */
    public class Produto {
        private String nome;
        private int quantidade;
    
        public Produto(String nome, int quantidade) {
            this.nome = nome;
            this.quantidade = quantidade;
        }
    
        public String getNome() {
            return nome;
        }
    
        public int getQuantidade() {
            return quantidade;
        }
    
        public void adicionarEstoque(int valor) {
            this.quantidade += valor;
        }
    
        @Override
        public String toString() {
            return nome + " (Qtd: " + quantidade + ")";
        }
    }

ServicoEstoque.java (em br/com/estoque/servico/)

    package br.com.estoque.servico;
    
    import br.com.estoque.modelo.Produto;
    
    /**
     * Classe de Serviço (Lógica): Contém regras de negócio.
     */
    public class ServicoEstoque {
    
        public void adicionarProduto(Produto p, int valor) {
            if (valor > 0) {
                p.adicionarEstoque(valor);
                System.out.println("LOG: Adicionado " + valor + " unidades de " + p.getNome() + ".");
            } else {
                System.out.println("LOG: Valor de adição deve ser positivo.");
            }
        }
    }

Main.java (em br/com/estoque/app/)

    package br.com.estoque.app;
    
    import br.com.estoque.modelo.Produto;
    import br.com.estoque.servico.ServicoEstoque;
    
    /**
     * Classe Principal da Aplicação (App): Ponto de entrada.
     */
    public class Main {
    
        public static void main(String[] args) {
            System.out.println("--- ESTRUTURA DE PACKAGES ---");
            System.out.println("Aplicação Principal: br.com.estoque.app");
            System.out.println("Modelo de Dados:     br.com.estoque.modelo");
            System.out.println("Lógica de Negócio:   br.com.estoque.servico");
            System.out.println("-----------------------------\n");
    
            Produto livro = new Produto("Livro Java Avançado", 10);
            ServicoEstoque servico = new ServicoEstoque();
    
            System.out.println("Produto antes da operação: " + livro);
            servico.adicionarProduto(livro, 5);
            System.out.println("Produto após a operação:  " + livro);
        }
    }

Exercício 13 Etapa 5 - DatabaseConfig - ProdutoDAO - AplicacaoConfig (Input and Output &  Deploying an Application)

Estrutura do Projeto 

    infra/
    └── data/
        ├── DatabaseConfig.java
        └── ProdutoDAO.java
    AplicacaoConfig.java

infra/data/DatabaseConfig.java

    package infra.data;
    
    /**
     * Classe que armazena as configurações de conexão com o banco de dados.
     */
    public class DatabaseConfig {
    
        public static final String DB_URL = "jdbc:mysql://localhost:3306/estoque_db";
        public static final String DB_USER = "usuario_app";
        public static final String DB_PASSWORD = "senha123";
    
        private DatabaseConfig() {
            // Impede instanciamento da classe
        }
    }

infra/data/ProdutoDAO.java

    package infra.data;
    
    /**
     * Classe ProdutoDAO (Data Access Object).
     * Responsável por operações relacionadas à entidade Produto.
     */
    public class ProdutoDAO {
    
        public ProdutoDAO() {
            System.out.println("ProdutoDAO inicializado.");
        }
    
        public void conectar() {
            System.out.println("\nTentando conectar ao banco de dados...");
            System.out.println("URL: " + DatabaseConfig.DB_URL);
            System.out.println("Usuário: " + DatabaseConfig.DB_USER);
            System.out.println("Senha: " + DatabaseConfig.DB_PASSWORD);
            System.out.println("Conexão simulada com sucesso!");
        }
    }

AplicacaoConfig.java

    import infra.data.DatabaseConfig;
    import infra.data.ProdutoDAO;
    
    public class AplicacaoConfig {
    
        public static void main(String[] args) {
            System.out.println("--- DEMONSTRAÇÃO DE ACESSO ÀS CONSTANTES ---");
    
            System.out.println("1. Acessando DB_URL: " + DatabaseConfig.DB_URL);
            System.out.println("2. Acessando DB_USER: " + DatabaseConfig.DB_USER);
            System.out.println("3. Acessando DB_PASSWORD: " + DatabaseConfig.DB_PASSWORD);
    
            System.out.println("\n-------------------------------------------");
    
            ProdutoDAO dao = new ProdutoDAO();
            dao.conectar();
        }
    }

Exercício 15 Eatapa 5 - Como criar um JAR Executável

    Preparando um JAR Executável
    
    O JAR (Java Archive) é o formato padrão para empacotar e distribuir aplicações Java. Para que um JAR seja executável pelo usuário final (sem que ele precise saber qual classe tem o método main), ele requer uma configuração especial no arquivo MANIFEST.MF.
    
    1. Elementos Essenciais em um JAR Executável
    Para que um arquivo JAR funcione como uma aplicação autônoma, ele deve conter, no mínimo, os três seguintes artefatos:
    Arquivos de Classe Compilados (.class): O código de toda a aplicação (incluindo Produto.class, ServicoEstoque.class, Main.class, etc.) compilado.
    Recursos: Quaisquer arquivos estáticos que o aplicativo utilize (ex: imagens, arquivos de configuração ou, no caso deste exercício, o entrada.txt se fosse necessário).
    Arquivo MANIFEST.MF: O metadado que informa à JVM como iniciar a aplicação.
    
    2. A Função do Arquivo MANIFEST.MF
    O MANIFEST.MF é um arquivo de metadados localizado dentro do diretório META-INF/ do JAR. Sua função crucial é fornecer informações de controle sobre o conteúdo do JAR.
    Atributo Chave Obrigatório: O atributo obrigatório para tornar o JAR executável é o Main-Class.
    Exemplo de Conteúdo do MANIFEST.MF:
    Manifest-Version: 1.0
    Created-By: 1.8.0_201 (Oracle Corporation)
    Main-Class: br.com.estoque.app.Main 
    
    Neste exemplo, Main-Class: br.com.estoque.app.Main diz à JVM: "O ponto de entrada (o método public static void main(String[] args)) está na classe Main dentro do pacote br.com.estoque.app."
    
    3. Comando de Terminal para Execução
    Uma vez que o JAR tenha sido criado e o atributo Main-Class tenha sido configurado corretamente no MANIFEST.MF, o usuário final que tenha o JRE (Java Runtime Environment) instalado pode executar a aplicação diretamente do terminal com o seguinte comando:
    java -jar nome_do_arquivo.jar
    Para o projeto do Exercício 1, o comando seria:
    java -jar estoque-app.jar
    Este comando instrui a JVM a executar o arquivo JAR especificado, usando o Main-Class definido no seu arquivo MANIFEST.MF como o ponto de partida.

