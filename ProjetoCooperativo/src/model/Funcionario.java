/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */

public class  Funcionario extends Pessoa {
    private String nome;
    private int cpf;
    private int idade;
    private float altura;

    public Funcionario(){
        super();
    }
    public Funcionario(String nome, int cpf, int idade, float altura) {
        
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}

