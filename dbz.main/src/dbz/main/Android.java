package dbz.main;

public class Android extends Raca {

    private String infinito; // máximo em ki

    public Android(int vida, int ki, String tecnica, String infinito) {
        super(vida, ki, tecnica);
        this.infinito = infinito;
    }

    public String getInfinito() {
        return infinito;
    }

    public void setInfinito(String infinito) {
        this.infinito = infinito;
    }

    // Método específico para absorção de energia de Android
    public void absorverEnergia() {
        System.out.println("Você absorveu a energia do oponente e aumentou seu ki!");
        setKi(getKi() + 300);
    }
}
