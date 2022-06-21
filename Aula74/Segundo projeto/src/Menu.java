import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de opções: \n1 - Para contratar serviço\n2 - Para falar com atendente\n3 - Para reclamações\n4 - Para sair");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Seja muito bem vindo! \nSua visita é um prazer!");
                break;
            case 2:
                System.out.println("Algum problema?");
                break;
            case 3:
                System.out.println("Infelizmente todos os canais de atendimento estão ocupados. \nTente novamente mais tarde.");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}
