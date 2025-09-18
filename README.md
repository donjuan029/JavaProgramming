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


Exercício 5 - Calcular Área do Retângulo

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
