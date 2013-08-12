/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import br.senai.sc.model.negocio.Produto;
import br.senai.sc.model.persistencia.ProdutoDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que controla a parte visual do menu produto
 *
 * @version 1.0 07/08/2013
 * @author gustavo_lourenco
 */
public class JanelaProduto {

    public void menuProduto(List<Produto> produtos) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("PRODUTOS\nInforme a opção desejada: "
                    + "\n1 - Inserir"
                    + "\n2 - Excluir"
                    + "\n3 - Alterar"
                    + "\n4 - Buscar"
                    + "\n5 - Listar"
                    + "\n6 - Sair"));
            switch (opcao) {
                case 1:
                    adicionaProduto(produtos);
                    break;
                case 2:
                    removeProduto(produtos);
                    break;
                case 3:
                    alteraProduto(produtos);
                    break;
                case 4:
                    break;
                case 5:
                    listaProduto(produtos);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta");
            }
        } while (opcao != 6);
    }

    //Metodo para adicionar produtos
    public void adicionaProduto(List<Produto> funcionarios) {

        Produto p = new Produto();
        p.setNome(JOptionPane.showInputDialog("Informe o nome do produto: "));
        p.setMarca(JOptionPane.showInputDialog("Informe a marca do produto: "));
        p.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: ")));


        ProdutoDAO dao = new ProdutoDAO();
        dao.adicionar(p, funcionarios);

    }

    //Metodos para listar produtos
    private void listaProduto(List<Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();
        dao.listar(produtos);
    }

    //Metodo para remover produtos
    private void removeProduto(List<Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do produto a ser excluido: ");

        dao.excluir(nome, produtos);
    }

    //Metodo para alterar produto atraves do nome
    private void alteraProduto(List<Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();

        String nome = JOptionPane.showInputDialog("Informe o nome do produto a ser alterado: ");

        Produto pAltera = new Produto();

        pAltera = dao.buscarProdutoByNome(nome, produtos);

        if (pAltera != null) {

            pAltera.setNome(JOptionPane.showInputDialog("Informe o nome: ", pAltera.getNome()));
            pAltera.setMarca(JOptionPane.showInputDialog("Informe a marca: ", pAltera.getMarca()));
            pAltera.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: ", pAltera.getPreco())));

            dao.altera(nome, produtos, pAltera);

        } else {
            JOptionPane.showMessageDialog(null, "Produto: " + nome + " não existe");
        }
    }
}
