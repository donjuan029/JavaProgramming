public class ConstrutorEmail {
    public static void main(String[] args) {
        // Array de destinatários
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