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