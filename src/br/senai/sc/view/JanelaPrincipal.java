package br.senai.sc.view;

import javax.swing.JOptionPane;

/**
 * Classe que controla toda a parte visual da aplicação.
 *
 * @version 1.0 31/07/13
 * @author leticia_jesus
 */
public class JanelaPrincipal {

    public void mostraMenu() {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção:"
                    + "/n1 -funcionario"
                    + "/n2-cliente"
                    + "/n3-fornecedor"
                    + "/n4-transportadora"
                    + "/n5-sair"));
            switch (opcao) {
                case 1:
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
        }
    

    }
