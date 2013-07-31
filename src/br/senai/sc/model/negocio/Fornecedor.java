
package br.senai.sc.model.negocio;

/**
 *Classe  que representa os fornecedores do software
 * @version  1.0 31/07/13
 * @author leticia_jesus
 */
public class Fornecedor extends PessoaJuridica {
    private String tipoProduto;

    public Fornecedor() {
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    
    
}
