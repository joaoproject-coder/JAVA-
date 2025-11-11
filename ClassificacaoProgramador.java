import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class ClassificacaoProgramador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        System.out.print("Quantos anos de experiência você tem em programação? ");
        int anos = entrada.nextInt(); // Lê o número de anos digitado pelo usuário

        System.out.print("Quantos projetos você já participou? ");
        int projetos = entrada.nextInt(); // Lê o número de projetos digitado pelo usuário

        // Verifica a classificação com base nas condições
        if (anos < 1 && projetos < 2) {
            System.out.println("Classificação: Estagiário");
        } else {
            System.out.println("Classificação: Júnior");
        }

        entrada.close(); // Fecha o Scanner (boa prática)
    }
}
