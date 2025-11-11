import java.util.ArrayList;
import java.util.List;

// Classe que representa o candidato 
class Candidato {
    String nome;
    int anosExperiencia;
    int quantidadeProjetos;
    boolean conheceSpring;

    // Construtor para para a criação de candidatos
    public Candidato(String nome, int anosExperiencia, int quantidadeProjetos, boolean conheceSpring) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.quantidadeProjetos = quantidadeProjetos;
        this.conheceSpring = conheceSpring;
    }
}

// criação da classe avaliador 
class Avaliador {
    // Método que recebe uma lista de candidatos e mostra o nível de cada um
    void avaliarCandidatos(List<Candidato> candidatos) {
        for (Candidato c : candidatos) {
            String nivel;

            //  Regra de classificação:
            // - Estagiário: menos de 2 anos de experiência OU menos de 3 projetos
            // - Júnior: 2 anos ou mais e 3 projetos ou mais
            if (c.anosExperiencia < 2 || c.quantidadeProjetos < 3) {
                nivel = "Estagiário";
            } else {
                nivel = "Júnior";
            }

            // Mostra o resultado no console
            System.out.println(c.nome + " - " + nivel);
        }
    }
}

// Classe principal (executa o programa)
public class SistemaAvaliacao {
    public static void main(String[] args) {

        // Cria uma lista de candidatos
        List<Candidato> lista = new ArrayList<>();

        // Adiciona candidatos de exemplo
        lista.add(new Candidato("Maria", 1, 2, false));
        lista.add(new Candidato("João", 3, 5, true));
        lista.add(new Candidato("Ana", 2, 1, false));
        lista.add(new Candidato("Carlos", 2, 4, true));

        // Cria um avaliador
        Avaliador avaliador = new Avaliador();

        // Avalia todos os candidatos
        avaliador.avaliarCandidatos(lista);
    }
}
