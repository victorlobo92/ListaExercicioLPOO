package ListaExerFixacao04;
import javax.swing.JOptionPane;

public class Cocker extends Cachorro{
	// Variáveis de Cocker
	int tosa;
	
	// Construtor padrão
	public Cocker(){
		super();
	}

	// Construtor sobrecarga
	public Cocker(String tipo, String cor, String nome, String raca, int tosa){
		super(tipo, cor, nome, raca);
		setTosa(tosa);
	}

	// Getters e Setters
	public void setTosa(int tosa){
		this.tosa = tosa;
	}
	public int getTosa(){
		return tosa;
	}
	
	// Método que retorna necessidade de tosa
	public int precisaTosa(){
		return getTosa();
	}
	
	@Override
	public String toString(){
		// Retorna sobreposição dos dados do Cocker
		if(precisaTosa() == JOptionPane.YES_OPTION){
			return super.toString() + " e recebe tosa.";
		}
		else{
			return super.toString() + " e não recebe tosa.";
		}
	}
}
