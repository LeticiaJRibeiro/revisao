
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 */
public class JanelaFuncionario {

    public void menuFuncionario(List<Funcionario> funcionarios) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada:"
                    + "\n1-Inserir"
                    + "\n2-Excluir"
                    + "\n3-Alterar"
                    + "\n4-Buscar"
                    + "\n5-Listar"
                    + "\n6-Sair"));
            switch (opcao) {
                case 1:
                    adicionaFuncionario(funcionarios);
                    break;
                case 2:
                    removefuncionario(funcionarios);
                    break;
                case 3:
                    alteraFuncionario(funcionarios);
                    break;
                case 4:
                    break;
                case 5:
                    listaFuncionarios(funcionarios);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta");

            }
        } while (opcao != 6);
    }

    void adicionaFuncionario(List<Funcionario> funcionarios) {
        Funcionario f = new Funcionario();
        f.setNome(JOptionPane.showInputDialog(
                "Informe o nome do funcionário"));
        f.setCpf(JOptionPane.showInputDialog(
                "Informe o CPF do funcionário"));
        f.setDataNascimento(JOptionPane.showInputDialog(
                "Informe a data de nascimento do funcionário"));
        f.setRg(JOptionPane.showInputDialog(
                "Informe o RG do funcionário"));
        f.setEndereço(JOptionPane.showInputDialog(
                "Informe o endereço do funcionário"));
        f.setSalario(Double.parseDouble(JOptionPane.showInputDialog(
                "Informe o salário do funcionário")));
        f.setDataAdmissao(JOptionPane.showInputDialog(
                "Informe a data de admissão do funcionário"));
        f.setDataCadastro(JOptionPane.showInputDialog(
                "Informe a data de cadastro do funcionário"));
        f.setCtps(JOptionPane.showInputDialog(
                "Informe o número da carteira de trabalho do funcionário"));
        f.setCargo(JOptionPane.showInputDialog(
                "Informe o cargo do funcionário"));
        f.setTelefone(JOptionPane.showInputDialog(
                "Informe o telefone do funcionário"));

        FuncionarioDAO dao = new FuncionarioDAO();
        dao.adicionar(f, funcionarios);


    }

    private void listaFuncionarios(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.listar(funcionarios);
    }

    private void removefuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário que deseja excluir");
        dao.excluir(nome, funcionarios);
    }

    private void alteraFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário a ser alterado");
        Funcionario fAltera = new Funcionario();

        fAltera = dao.buscaFuncionarioByNome(nome, funcionarios);
          if(fAltera != null){
              
        fAltera.setNome(JOptionPane.showInputDialog("Informe o nome",fAltera.getDataNascimento()));
        fAltera.setCpf(JOptionPane.showInputDialog(
                "Informe o CPF do funcionário",fAltera.getCpf()));
        fAltera.setDataNascimento(JOptionPane.showInputDialog(
                "Informe a data de nascimento do funcionário" , fAltera.getDataNascimento()));
        fAltera.setRg(JOptionPane.showInputDialog(
                "Informe o RG do funcionário",fAltera.getRg()));
        fAltera.setEndereço(JOptionPane.showInputDialog(
                "Informe o endereço do funcionário",fAltera.getEndereço()));
        fAltera.setSalario(Double.parseDouble(JOptionPane.showInputDialog(
                "Informe o salário do funcionário",fAltera.getSalario())));
        fAltera.setDataAdmissao(JOptionPane.showInputDialog(
                "Informe a data de admissão do funcionário",fAltera.getDataAdmissao()));
        fAltera.setDataCadastro(JOptionPane.showInputDialog(
                "Informe a data de cadastro do funcionário",fAltera.getDataCadastro()));
        fAltera.setCtps(JOptionPane.showInputDialog(
                "Informe o número da carteira de trabalho do funcionário",fAltera.getCtps()));
        fAltera.setCargo(JOptionPane.showInputDialog(
                "Informe o cargo do funcionário",fAltera.getCargo()));
        fAltera.setTelefone(JOptionPane.showInputDialog(
                "Informe o telefone do funcionário",fAltera.getTelefone()));
        dao.altera(nome,funcionarios,fAltera);

    }else{
              JOptionPane.showMessageDialog(null,"Funcionário" +nome + "não existe");
          }
}
}