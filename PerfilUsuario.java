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

