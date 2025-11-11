public class Trator extends Veiculo {
    private boolean cabineFechada;

    // Construtor
    public Trator(String marca, String modelo, int ano, boolean cabineFechada) {
        super(marca, modelo, ano);
        this.cabineFechada = cabineFechada;
    }

    // Sobrescrita do método ligar
    @Override
    public void ligar() {
        System.out.println("Trator ligado com botão de ignição.");
    }

    // Sobrescrita do método mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cabine fechada: " + (cabineFechada ? "Sim" : "Não"));
    }

    // Getter e Setter
    public boolean isCabineFechada() {
        return cabineFechada;
    }

    public void setCabineFechada(boolean cabineFechada) {
        this.cabineFechada = cabineFechada;
    }
}