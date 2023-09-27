package dbz.main;

public class Raca {

    private int vida;
    private int ki;
    private String tecnica;

    public Raca(int vida, int ki, String tecnica) {
        this.vida = vida;
        this.ki = ki;
        this.tecnica = tecnica;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    // Método para lutar contra um inimigo
    public void lutar(Raca inimigo) {

        int dano = this.ki * 10; // Suponhamos que 10 de ki cause 10 de dano.
        inimigo.vida -= dano;

        System.out.println("Você atacou o inimigo com " + dano + " de dano.");
        System.out.println("Vida do inimigo: " + inimigo.vida);
    }

    // Método para treinar e aumentar status
    public void treinar() {

        this.vida += 100;
        this.ki += 50;

        System.out.println("Você treinou e aumentou seus status.");
        System.out.println("Vida atual: " + this.vida);
        System.out.println("Ki atual: " + this.ki);
    }

    // Método para fugir de uma batalha
    public boolean fugir() {

        double chanceDeFuga = Math.random(); // Gera um número aleatório entre 0 e 1.

        if (chanceDeFuga < 0.5) {
            System.out.println("Você fugiu com sucesso da batalha!");
            return true; // Retorna verdadeiro se a fuga for bem-sucedida.
        } else {
            System.out.println("Você não conseguiu fugir e continua na batalha.");
            return false; // Retorna falso se a fuga não for bem-sucedida.
        }
    }
}
