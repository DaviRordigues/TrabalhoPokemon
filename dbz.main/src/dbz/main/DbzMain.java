package dbz.main;

import java.util.Scanner;

public class DbzMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Escolher o nome do jogador
        System.out.println("Digite seu nome: ");
        String nomeJogador = scanner.nextLine();

        // Escolher a raça do jogador
        System.out.println("Escolha sua raça: ");
        System.out.println("1. Saiyajin");
        System.out.println("2. Android");
        System.out.println("3. Humano");
        System.out.println("4. Namek");
        int escolhaRaca = scanner.nextInt();
        Raca jogador = null;

        // Consumir o caractere de nova linha pendente
        scanner.nextLine();

        switch (escolhaRaca) {
            case 1:
                jogador = new Saiyajin(1000, 500, "Kamehameha", 2);
                break;
            case 2:
                jogador = new Android(800, 99999999, "Energy Absorption", "Sim");
                break;
            case 3:
                jogador = new Humano(750, 600, "Solar Flare", "Treinamento em 4 missões");
                break;
            case 4:
                jogador = new Namek(1500, 700, "Regeneration", "Sim");
                break;
            default:
                System.out.println("Raça inválida. Jogo encerrado.");
                return;
        }

        System.out.println("Bem-vindo, " + nomeJogador + "!");
        System.out.println("Você escolheu a raça " + jogador.getClass().getSimpleName());

        // Criar uma instância de SementeDosDeuses
        SementeDosDeuses semente = new SementeDosDeuses("Semente dos Deuses");

        boolean continuarJogo = true;
        while (continuarJogo) {
            // Exibir os status da raça
            exibirStatus(jogador);

            // Opções do jogador e lógica do jogo aqui
            System.out.println("Escolha uma ação:");
            System.out.println("1. Lutar");
            System.out.println("2. Treinar");
            System.out.println("3. Fugir");
            System.out.println("4. Sair");
            System.out.println("5. Usar Semente dos Deuses");

            int escolhaAcao = scanner.nextInt();

            // Consumir o caractere de nova linha pendente
            scanner.nextLine();

            switch (escolhaAcao) {
                case 1:
                    jogador.lutar(jogador); // Implemente a lógica de luta dentro do método lutar da classe Raca.
                    break;
                case 2:
                    jogador.treinar(); // Implemente a lógica de treinamento dentro do método treinar da classe Raca.
                    break;
                case 3:
                    continuarJogo = !jogador.fugir(); // Implemente a lógica de fuga dentro do método fugir da classe Raca.
                    if (!continuarJogo) {
                        System.out.println("Você fugiu do combate.");
                    }
                    break;
                case 4:
                    continuarJogo = false;
                    System.out.println("Você saiu do jogo.");
                    break;
                case 5:
                    // Usar a Semente dos Deuses para recuperar a vida
                    semente.usar(jogador);
                    break;
                default:
                    System.out.println("Ação inválida. Escolha novamente.");
            }
        }

        System.out.println("O jogo acabou.");

        scanner.close();
    }

    private static void exibirStatus(Raca jogador) {
        System.out.println("Status da Raça:");
        System.out.println("Vida: " + jogador.getVida());
        System.out.println("Ki: " + jogador.getKi());
        System.out.println("Técnica: " + jogador.getTecnica());
        // Adicione outros atributos específicos da raça, se houver.
    }
}
