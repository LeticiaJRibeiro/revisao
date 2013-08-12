/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que controla toda a parte visual da aplicação
 *
 * @version 1.0 31/07/2013
 * @author leticia_jesus
 */
public class JanelaPrincipal {

    public static void main(String[] args) {


        // Vetor dinamico para armazenar funcionarios cadastrados
        List<Funcionario> funcionarios = new ArrayList<>();

        //Vetor dinamico para armazenar produtos cadastrados
        List<Produto> produtos = new ArrayList<>();

        mostraMenu(funcionarios, produtos);

    }

    public static void mostraMenu(List<Funcionario> funcionarios, List<Produto> produtos) {

        JanelaFuncionario jf = new JanelaFuncionario();

        JanelaProduto jp = new JanelaProduto();

        int opcao = 0;
        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção: "
                    + "\n1 - Funcionario: "
                    + "\n2 - Produto: "
                    + "\n3 - Fornecedor"
                    + "\n4 - Transportadora"
                    + "\n5 - Sair"));

            switch (opcao) {
                case 1:
                    jf.menuFuncionario(funcionarios);
                    break;
                case 2:
                    jp.menuProduto(produtos);
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
