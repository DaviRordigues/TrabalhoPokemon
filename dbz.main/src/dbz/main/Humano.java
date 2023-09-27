package dbz.main;

public class Humano extends Raca {

    private String agilidade; // termina o treinamento em 4 missões

    public Humano(int vida, int ki, String tecnica, String agilidade) {
        super(vida, ki, tecnica);
        this.agilidade = agilidade;
    }

    public String getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(String agilidade) {
        this.agilidade = agilidade;
    }

    // Método específico para treinamento rápido de Humano
    public void treinamentoRapido() {
        System.out.println("Seu treinamento foi concluído em 4 missões! Você ganhou agilidade!");
        setAgilidade("Treinamento concluído");
    }
}
