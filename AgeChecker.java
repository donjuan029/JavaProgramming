import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        @SuppressWarnings("unused")
        char holdLicence;

        System.out.print("Please enter your age: ");

        //Leia o valor do caractere para identificar se um usuário está permitido a dirigir.

        age = in.nextInt();

        System.out.println("Do you hold a current driving licence? ");

        holdLicence = in.next().charAt(0);

        if((age > 20) && (holdLicence == 'y'))

        //Você precisa de ambos 21 ou acima e ter uma licença para dirigir um carro.

            System.out.println("You are an adult and can hire a car");
        else
            System.out.println("You are not an adult so cannot hire a car");
        //endif
        in.close();

        //Vamos ver se o usuário pode dirigir.

    }//end method main
}//end class AgeChecker
