/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraatividadelp219_2;

/**
 *
 * @author Frank
 */
public class DAO {
    private ExibirResultado exibirResultado = new ExibirResultado();
    
    public void salvar(Aluno aluno){
        //Ligação com BD
        //Salvo o conteúdo da variável aluno no BD
        this.exibirResultado.exibir(aluno);
    }
    
    public void remover(){
        
    }
}
