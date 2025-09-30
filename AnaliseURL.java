import java.util.Scanner;

public class AnaliseURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da URL
        System.out.print("Digite a URL: ");
        String url = scanner.nextLine();

        System.out.println("\nURL em análise: " + url);
        System.out.println("----------------------------------------");

        // Verificar protocolo
        boolean usaHttp = url.startsWith("http://");
        boolean usaHttps = url.startsWith("https://");

        System.out.println("Usa HTTPS? " + usaHttps);
        System.out.println("Usa HTTP?  " + usaHttp);

        // Verificar se contém ".com"
        boolean isComercial = url.contains(".com");
        System.out.println("Contém .com? " + isComercial);

        // Extrair domínio
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