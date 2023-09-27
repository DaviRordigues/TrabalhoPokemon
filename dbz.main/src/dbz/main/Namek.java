package dbz.main;

public class Namek extends Raca {

    private String maxregen; // se regenera caso perca uma batalha e recebe stats adicionais após a batalha

    public Namek(int vida, int ki, String tecnica, String maxregen) {
        super(vida, ki, tecnica);
        this.maxregen = maxregen;
    }

    public String getMaxregen() {
        return maxregen;
    }

    public void setMaxregen(String maxregen) {
        this.maxregen = maxregen;
    }

    // Método específico para regeneração de Namek
    public void regenerar() {
        System.out.println("Você se regenerou após a batalha!");
        setVida(getVida() + 200);
        setKi(getKi() + 100);
    }
}
