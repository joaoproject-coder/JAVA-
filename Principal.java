public class Principal {
    public static void main(String[] args) {
        // Criação dos objetos
        Carro carro1 = new Carro("Bmw", "m4 ", 2025, 3);
        Trator trator1 = new Trator("John Deere", "8R 410", 2023, true);

        // Demonstração do polimorfismo
        Veiculo v1 = carro1;
        Veiculo v2 = trator1;

        // Exibindo informações
        System.out.println("=== Informações do Carro ===");
        v1.mostrarInfo();
        v1.ligar();

        System.out.println("\n=== Informações do Trator ===");
        v2.mostrarInfo();
        v2.ligar();
    }
}


