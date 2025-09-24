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