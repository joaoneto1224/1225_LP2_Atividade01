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
public class ExibirResultado {
    
    public void exibir(Aluno aluno){
        JOptionPane.showMessageDialog(null, "O aluno " + aluno.getNome() + " foi salvo com sucesso");
    }
}
