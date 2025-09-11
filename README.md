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
