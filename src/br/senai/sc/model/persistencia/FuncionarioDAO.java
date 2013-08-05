package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que guarda as informações referentes aos funcionarios.
 *
 * @version 1.0 31/07/13
 * @author leticia_jesus
 */
public class FuncionarioDAO {

    public void adicionar(Funcionario f,
            List<Funcionario> funcionarios) {
        funcionarios.add(f);
        JOptionPane.showMessageDialog(null, "Funcionario"
                + "adicionado com sucesso.");

    }

    /*Método que lista todos os funcionáriosS
     * 
     */
    public void listar(List<Funcionario> funcionarios) {
        String msg = " ";
        for (Funcionario f : funcionarios) {
            msg = msg + "\nNome:" + f.getNome()
                    + "\n Data de nascimento:" + f.getDataNascimento()
                    + "\n RG:" + f.getRg()
                    + "\n CPF:" + f.getCpf()
                    + "\n Endereço:" + f.getEndereço()
                    + "\n Telefone:" + f.getTelefone()
                    + "\n Data Cadastro:" + f.getDataCadastro()
                    + "\n Salário:" + f.getSalario()
                    + "\n Data Admissão:" + f.getDataAdmissao()
                    + "\n CTPS" + f.getCtps()
                    + "\n Cargo" + f.getCargo();
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    public void excluir(String nome,List<Funcionario>funcionarios){
       Funcionario fRemove = null;
       for(Funcionario f: funcionarios){
           if(f.getNome().equals(nome)){
               fRemove=f;
           }
       }




    }
}
