/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author aluno
 */
public class Diaria extends AluguelAutomovel{
    private Automovel automovel;
    private Pessoa pessoa;

    public Diaria(Automovel automovel, Pessoa pessoa) {
        super();
        this.setAutomovel(automovel); 
        this.setPessoa(pessoa); 
        
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
  
            
}

