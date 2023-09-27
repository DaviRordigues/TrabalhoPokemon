package dbz.main;

public class SementeDosDeuses {

    private String nome;

    public SementeDosDeuses(String nome) {
        this.nome = nome;
    }

    public void usar(Raca jogador) {
        // Recupera toda a vida do jogador.
        jogador.setVida(jogador.getVida());

        System.out.println(jogador.getClass().getSimpleName() + " usou a " + nome + " e recuperou toda a vida!");
    }
}
