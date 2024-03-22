import java.util.LinkedList;
import java.util.Queue;

// Classe que armazena e manipula uma fila de estudantes
public class GerenciadorEstudantes {
    private Queue<Estudante> filaEstudantes;

    public GerenciadorEstudantes() {
        this.filaEstudantes = new LinkedList<>();
    }

    // Método para adicionar um estudante à fila
    public void adicionarEstudante(Estudante estudante) {
        filaEstudantes.add(estudante);
    }

    // Método para remover um estudante da fila
    public Estudante removerEstudante() {
        return filaEstudantes.poll();
    }

    // Método para verificar se a fila está vazia
    public boolean filaVazia() {
        return filaEstudantes.isEmpty();
    }
}package manipulacaoFila;

public class negocio {

}
