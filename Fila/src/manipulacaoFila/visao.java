package manipulacaoFila;
import javax.swing.JOptionPane;

public class visao {
    public static void main(String[] args) {
        
        GerenciadorEstudantes gerenciadorEstudantes = new GerenciadorEstudantes();

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n"
                    + "1. Adicionar estudante\n"
                    + "2. Remover estudante\n"
                    + "3. Sair"));

            switch (opcao) {
                case 1:
                    
                    String nome = JOptionPane.showInputDialog("Digite o nome do estudante:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do estudante:"));

                
                    Estudante novoEstudante = new Estudante(nome, idade);


                    gerenciadorEstudantes.adicionarEstudante(novoEstudante);
                    JOptionPane.showMessageDialog(null, "Estudante adicionado com sucesso!");
                    break;
                case 2:
                    
                    if (!gerenciadorEstudantes.filaVazia()) {
                        Estudante estudanteRemovido = gerenciadorEstudantes.removerEstudante();
                        JOptionPane.showMessageDialog(null, "Estudante removido: " + estudanteRemovido.getNome());
                    } else {
                        JOptionPane.showMessageDialog(null, "A fila de estudantes está vazia!");
                    }
                    break;
                case 3:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 3);
    }
}
