/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa{
    private String nome1;
    private int cpf;
    private float altura1;
    private int idade1;

    public Cliente() {
        super();
    }

    public Cliente(String nome1, int cpf, float altura1, int idade1, String nome, double altura, int idade) {
        super();
        this.nome1 = nome1;
        this.cpf = cpf;
        this.altura1 = altura1;
        this.idade1 = idade;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public float getAltura1() {
        return altura1;
    }

    public void setAltura1(float altura1) {
        this.altura1 = altura1;
    }

    public int getIdade1() {
        return idade1;
    }

    public void setIdade1(int idade1) {
        this.idade1 = idade1;
    }


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public float getAltura() {
        return altura1;
    }

    public void setAltura(float altura) {
        this.altura1 = altura;
    }
    
    
}
