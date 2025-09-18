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
