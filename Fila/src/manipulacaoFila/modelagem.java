import javax.swing.JOptionPane;
import java.util.List;

public class modelagem {
    public static void main(String[] args) {
       
        GerenciadorLivros gerenciadorLivros = new GerenciadorLivros();

 
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n"
                    + "1. Adicionar livro\n"
                    + "2. Sair"));

            switch (opcao) {
                case 1:
                  
                    String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
                    String autor = JOptionPane.showInputDialog("Digite o nome do autor:");

                    Livro novoLivro = new Livro(titulo, autor);


                    gerenciadorLivros.adicionarLivro(novoLivro);
                    break;
                case 2:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 2);

        List<Livro> listaLivros = gerenciadorLivros.getListaLivros();
        StringBuilder mensagem = new StringBuilder("Lista de Livros:\n");
        for (Livro livro : listaLivros) {
            mensagem.append("Título: ").append(livro.getTitulo()).append(", Autor: ").append(livro.getAutor()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}