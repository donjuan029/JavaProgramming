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