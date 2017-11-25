/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Automovel 
{
    private String cor;
    private String tipo;
    private int kmRodado;
    
    public String getcor()
    {
        
        return cor;
    }
     
    public String getTipo()
    {
        
        return tipo;
    }
    public int getKmRodado()
    {
        
        return kmRodado;
    }
    
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    
     public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
     
     public void setkmRodado(int kmRodado)
     {
         this.kmRodado = kmRodado;
     }
}
