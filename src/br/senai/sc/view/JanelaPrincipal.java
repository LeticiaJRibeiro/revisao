package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que controla toda a parte visual da aplicação.
 *
 * @version 1.0 31/07/13
 * @author leticia_jesus
 */
public class JanelaPrincipal {

    public static void main(String[] args) {
     List<Funcionario> funcionarios = new ArrayList<>();
    //funcionários cadastrados
        mostraMenu(funcionarios);
    }

    public static void mostraMenu(List<Funcionario>funcionarios) {
        JanelaFuncionario jf = new JanelaFuncionario();
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a opção:"
                    + "\n1 -funcionario"
                    + "\n2-cliente"
                    + "\n3-fornecedor"
                    + "\n4-transportadora"
                    + "\n5-Sair"));
            switch (opcao) {
                case 1:
                   jf.menuFuncionario(funcionarios);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inexistente");


            }
        } while (opcao != 0);

    }
}
