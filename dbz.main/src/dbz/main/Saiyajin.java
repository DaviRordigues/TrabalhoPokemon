package dbz.main;

public class Saiyajin extends Raca {

    private int despertar; // em 100% dobra seus stats

    public Saiyajin(int vida, int ki, String tecnica, int despertar) {
        super(vida, ki, tecnica);
        this.despertar = despertar;
    }

    public int getDespertar() {
        return despertar;
    }

    public void setDespertar(int despertar) {
        this.despertar = despertar;
    }

    // Método específico para transformação de Saiyajin
    public void transformar() {
        System.out.println("Você se transformou em Super Saiyajin! Seus poderes aumentaram!");
        setVida(getVida() * 2);
        setKi(getKi() * 2);
    }
}
