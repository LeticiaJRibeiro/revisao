
package br.senai.sc.model.negocio;

/**
 *Classe que representa as pessoas juridicas do sistema
 * @version 1.0 31/07/13
 * @author leticia_jesus
 */
public class ClientePJ extends PessoaJuridica{
    private double limite;
    private int nrConta;
    private char categoria;
    private int qtVezesComprou;
    private double vlTotalGasto;

    public ClientePJ() {
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezesComprou() {
        return qtVezesComprou;
    }

    public void setQtVezesComprou(int qtVezesComprou) {
        this.qtVezesComprou = qtVezesComprou;
    }

    public double getVlTotalGasto() {
        return vlTotalGasto;
    }

    public void setVlTotalGasto(double vlTotalGasto) {
        this.vlTotalGasto = vlTotalGasto;
    }
    
    
    
}
