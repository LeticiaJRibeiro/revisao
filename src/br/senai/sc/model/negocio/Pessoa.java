package br.senai.sc.model.negocio;
//    Essa classe representa pessoas do software
//@version 1.0 31/07/13
//@author leticia.jesus

public class Pessoa {

    private int id;
    private String endereço;
    private String telefone;
    private String dataCadastro;

    public Pessoa() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
    
}
