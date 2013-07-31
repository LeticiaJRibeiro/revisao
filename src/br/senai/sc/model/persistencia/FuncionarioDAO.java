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
    //Vetor dinâmico para armazenar os funcionários cadastrados.

    private List<Funcionario> funcionarios = new ArrayList<>();
    //Método para adicionar um funcionário no vetor de funcionários. 

    public void adicionar(Funcionario f) {
        funcionarios.add(f);
        JOptionPane.showMessageDialog(null, "Funcionario"
                + "adicionado comn sucesso.");

    }
}
