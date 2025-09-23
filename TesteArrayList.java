import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        

        //Primeiro vamos utilizar um Array que deve ter um tamanho fixo
        String[] frutasArray = new String[3];
        frutasArray[0] = "Laranja";
        frutasArray[1] = "Maça";
        frutasArray[2] = "Manga";

        System.out.println("Array de tamanho fixo");
        for (String fruta : frutasArray) {
            System.out.println(fruta);
        }
        System.out.println("Tamanho do Array: " + frutasArray.length);

        //Se tentarmos adicionar mais um elemento isso causará um erro pq o Array é fixo

        //Agora irei usar um ArrayList que é uma coleção dinâmica 
        ArrayList<String> frutasList = new ArrayList<>();
        frutasList.add("Laranja");
        frutasList.add("Maça");
        frutasList.add("Manga");
        frutasList.add("Abacate");
        frutasList.add("Pera"); //Aqui podemos colocar inúmeros elementos

        System.out.println("\n No ArrayList o tamanho é dinâmico");
        for (String fruta : frutasList) {
            System.out.println(fruta);
        }
        System.out.println("Tamanho do ArrayList: " + frutasList.size());
        }
}

