/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraatividadelp219_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Frank
 */
public class PrimeiraAtividadeLP219_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String opcao = JOptionPane.showInputDialog("0 - Sair\n1 - Salvar Aluno");

        switch(opcao){
            case "0":
                JOptionPane.showMessageDialog(null, opcao);
                break;
            case "1":
                String nome = JOptionPane.showInputDialog("Entre com o nome: ");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Idade: "));
                int ra = Integer.parseInt(JOptionPane.showInputDialog("Entre com o RA: "));
                Aluno aluno = new Aluno();
                aluno.setNome(nome);
                aluno.setIdade(idade);
                aluno.setRa(ra);
                
                DAO dao = new DAO();
                dao.salvar(aluno);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inexistente");
        }
        /*
        if (opcao.equals("1") || opcao.equals("2")) {
            String valor1 = JOptionPane.showInputDialog("Entre com o valor 1: ");
            String valor2 = JOptionPane.showInputDialog("Entre com o valor 2: ");
            Calcular calcular = new Calcular();
            
            if (opcao.equals("1")) {
                calcular.soma(Integer.parseInt(valor1), Integer.parseInt(valor2));
            } else if (opcao.equals("2")) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Opção Inexistente", "Atividade LP2", 0);
        }
        */
    }

}
