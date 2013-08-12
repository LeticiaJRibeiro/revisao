/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Produto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que guarda informações referentes a produto
 *
 * @version 1.0 07/08/2013
 * @author gustavo_lourenco
 */
public class ProdutoDAO {

    //Metodo para adicionar um produto no vetor de Produtos.
    public void adicionar(Produto p, List<Produto> produtos) {
        produtos.add(p);
        JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso.");
    }

    //Metodo que lista todos os produtos do vetor Produto
    public void listar(List<Produto> produtos) {
        String msg = "";
        for (Produto p : produtos) {
            msg = msg + "\nNome: " + p.getNome()
                    + "\nMarca: " + p.getMarca()
                    + "\nPreço: " + p.getPreco()
                    + "\n----------";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    //Método para excluir atraves do nome
    public void excluir(String nome, List<Produto> produtos) {

        Produto pRemove = null;

        for (Produto p : produtos) {
            if (p.getNome().equals(nome)) {
                pRemove = p;
            }
        }
        produtos.remove(pRemove);

    }

    //Metodo para alterar produtos
    public void altera(String nome, List<Produto> produtos, Produto pAltera) {
        excluir(nome, produtos);
        adicionar(pAltera, produtos);

    }

    //Metodo para buscar produtos pelo nome
    public Produto buscarProdutoByNome(String nome, List<Produto> produtos) {
        for (Produto pBusca : produtos) {
            if (pBusca.getNome().equals(nome)) {
                return pBusca;
            }

        }
        return null;
    }
}
