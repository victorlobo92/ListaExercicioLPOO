/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private double altura;
    private int idade;

    public Pessoa(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
    
    public Pessoa(){}
    
    
    public String getNome()
    {
        
        return  nome; 
    }
    
    public double getaltura()
    {
        return altura;
    }
    
    public int idade()
    {
        return idade;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setAltura(double Altura)
    {
        this.altura = altura;
    }
     public void setIdade(int idade)
    {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", altura=" + altura + ", idade=" + idade + '}';
    }
     
}
