package ListaExerFixacao04;
import javax.swing.JOptionPane;
public class Animal {
	// Variáveis de animais
	String tipo, cor;
	
	// Construtor padrão
	public Animal(){}
	
	// Construtor sobrecarga
	public Animal(String tipo, String cor){
		setTipo(tipo);
		setCor(cor);
	}
	
	// Getters e Setters
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getCor(){
		return cor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}

	@Override
	public String toString(){
		// Retorna sobreposição dos dados do animal
		return "Animal: " + getTipo() + " de cor " + getCor();
	}
}