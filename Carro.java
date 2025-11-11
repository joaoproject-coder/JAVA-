public class Carro extends Veiculo {
    private int portas;

    // Construtor
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    // Sobrescrita do método ligar
    @Override
    public void ligar() {
        System.out.println("Carro ligado com chave.");
    }

    // Sobrescrita do método mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Portas: " + portas);
    }

    // Getter e Setter
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
 