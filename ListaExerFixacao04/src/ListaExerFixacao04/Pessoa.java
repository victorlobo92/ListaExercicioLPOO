package ListaExerFixacao04;
import javax.swing.JOptionPane;

public class Pessoa{
	// Variáveis de pessoa
	String nome, sexo;
	int idade;
	double altura;

	// Construtor padrão
	public Pessoa(){}

	// Construtor sobrecarga
	public Pessoa(String nome, int idade, double altura, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.sexo = sexo;
	}

	// Getters e Setters
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString(){
		// Retorna sobreposição dos dados da pessoa
		return "Nome: " + getNome() + "\n" +
				"Idade: " + getIdade() + "\n" +
				"Altura: " + getAltura() + "\n" +
				"Sexo: " + getSexo();
	}
}