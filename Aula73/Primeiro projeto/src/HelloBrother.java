import java.util.Scanner;

public class HelloBrother {
    public static void main(String[] args) {
        
    
        Scanner scann = new Scanner(System.in);

        System.out.println("Iforma seu nome aí parsa:");

        String name = scann.nextLine();

        System.out.println("Informa aí a sua idade parsa:");

        int age = scann.nextInt();

        System.out.println("Nome do parsa é " + name + " e a idade do parsa é " + age + " anos.");

        scann.close();

    }

}
