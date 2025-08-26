import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FonteDeDados fonte = new FonteDeDados();

        VisualizadorDeMedia visMedia = new VisualizadorDeMedia();
        VisualizadorDeSomatorio visSomatorio = new VisualizadorDeSomatorio();
        VisualizadorDeMaximo visMaximo = new VisualizadorDeMaximo();

        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Digite números positivos para adicionar.");
        System.out.println("Comandos especiais:");
        System.out.println("-1 = ligar visualizador de média");
        System.out.println("-2 = ligar visualizador de somatório");
        System.out.println("-3 = ligar visualizador de máximo");
        System.out.println("0  = sair");

        do {
            System.out.print("> ");
            opcao = sc.nextInt();

            switch (opcao) {
                case -1:
                    fonte.registrarObservador(visMedia);
                    System.out.println("Visualizador de média ligado.");
                    break;
                case -2:
                    fonte.registrarObservador(visSomatorio);
                    System.out.println("Visualizador de somatório ligado.");
                    break;
                case -3:
                    fonte.registrarObservador(visMaximo);
                    System.out.println("Visualizador de máximo ligado.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    if (opcao > 0) {
                        fonte.add(opcao);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}