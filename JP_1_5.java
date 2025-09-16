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

