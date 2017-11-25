package ListaExerFixacao04;
public class Empregado extends Pessoa{
	// Variáveis de empregado
	double salario;

	// Construtor padrão
	public Empregado(){
		super();
	}

	// Construtor sobrecarga
	public Empregado(String nome, int idade, double altura, String sexo, double salario){
		super(nome, idade, altura, sexo);
		setSalario(salario);
	}

	// Getters e Setters
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Retorna valor do salário do empregado
	public double obterLucros(){
		return getSalario();
	}
	
	@Override
	public String toString(){
		// Retorna sobreposição dos dados do empregado
		return super.toString() + "\n" +
				"Tipo: " + getClass().getName();
	}
}