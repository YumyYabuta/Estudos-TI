import java.util.Scanner;

public class Menu {
    // Declarando variaveis dos preços do Menu
    int hamburguer;
    int batataFrita;
    int suco;
    int quantidade;
    static int total;

    Scanner sc = new Scanner(System.in);

    // Metodo para mostrar menu das comidas
    public void mostrarMenu() {
        System.out.println("------------------Bem vindo ao Restaurante------------------");
        System.out.println("============================================================");
        System.out.println("                1.Hamburguer                         R$15,00");
        System.out.println("                2.Batata Frita                       R$10,00");
        System.out.println("                3.Suco                                R$5,00");
        System.out.println("                4.Sair                                R$5,00");
        System.out.println("============================================================");
    }// Final Menu de Comida

    // Metodo pagamento
    public void pagamento() {
        System.out.println("Obrigado por pedir!");
        System.out.println("O total do pagamento foi: R$" + total);
    }

    // Metodo Fazer pedido
    public void pedir() {

        while (true) {
            System.out.println("Faça seu pedido: ");
            int ls = sc.nextInt();
            switch (ls) {
                case 1:// Hamburguer
                    System.out.println("Você escolheu Hamburguer");
                    System.out.println("Escreva a quantidade que deseja: ");
                    quantidade = sc.nextInt();
                    total = total + quantidade * hamburguer;
                    break;

                case 2:// Batata Frita
                    System.out.println("Você escolheu Batata Frita");
                    System.out.println("Escreva a quantidade que deseja: ");
                    quantidade = sc.nextInt();
                    total = total + quantidade * batataFrita;
                    break;

                case 3:// Suco
                    System.out.println("Você escolheu Suco");
                    System.out.println("Escreva a quantidade que deseja: ");
                    quantidade = sc.nextInt();
                    total = total + quantidade * suco;
                    break;

                case 4:// Sair
                    System.out.println("Você decidiu Sair");
                    System.exit(1);
                    break;

                default:
                    System.out.println("Algo deu errado!");
                    break;
            }
            System.out.println("Deseja pedir algo a mais? (Sim/Não): ");
            String repetir = sc.next();
            if (repetir.equalsIgnoreCase("Sim")) {
                pedir();
            } else if (repetir.equalsIgnoreCase("Não")) {
                pagamento();
                System.exit(1);
            } else {
                System.out.println("Resposta invalida");
            }

        }
    }

}
