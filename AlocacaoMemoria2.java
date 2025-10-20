public class AlocacaoMemoria2 {
    
    //Método A
    @SuppressWarnings("unused")
    public static void main(String[] args) { 
        String s = "Inicial"; //VARIÁVEL A
        chamarMetodoB(10);     //Chamada 1
    }

    //Método B
    public static int chamarMetodoB(int x) { 
        boolean flag = true; //VARIÁVEL B
        return chamarMetodoC(x, flag); //Chamada 2
    }

    // Método C
    public static int chamarMetodoC(int a, boolean b) { 
        int resultado = a * 2; //VARIÁVEL C
        return resultado;
    } 
}
