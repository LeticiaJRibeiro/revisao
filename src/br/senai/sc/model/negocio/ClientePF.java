/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.negocio;

/**
 *@version 1.0 31/07/13
 * @author leticia_jesus
 */
public class ClientePF extends PessoaFisica {
    
    private double nrConta;
    private double limiteCompra;
    private char categoria;
    private int qtVezComprou;
    private double vlTotalGasto;

    public ClientePF() {
    }

    public double getNrConta() {
        return nrConta;
    }

    public void setNrConta(double nrConta) {
        this.nrConta = nrConta;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezComprou() {
        return qtVezComprou;
    }

    public void setQtVezComprou(int qtVezComprou) {
        this.qtVezComprou = qtVezComprou;
    }

    public double getVlTotalGasto() {
        return vlTotalGasto;
    }

    public void setVlTotalGasto(double vlTotalGasto) {
        this.vlTotalGasto = vlTotalGasto;
    }
    
    
    
    
}
