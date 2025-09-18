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
