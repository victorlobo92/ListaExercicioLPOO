/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public abstract class AluguelAutomovel
{
    private int atraso;
    private float valor;
    private float multa;

    public AluguelAutomovel(int atraso, float valor, float multa) {
        this.atraso = atraso;
        this.valor = valor;
        this.multa = multa;
    }
    public AluguelAutomovel() {

    }

    public int getAtraso() {
        return atraso;
    }

    public void setAtraso(int atraso) {
        this.atraso = atraso;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }
    
    
}
