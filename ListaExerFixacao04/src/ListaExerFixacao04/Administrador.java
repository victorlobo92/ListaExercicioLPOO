package ListaExerFixacao04;
public class Administrador extends Empregado{
	double ajudas_de_custo;

	// Construtor padrão
	public Administrador(){
		super();
	}

	// Construtor sobrecarga
	public Administrador(String nome, int idade, double altura, String sexo, double salario, double ajudas_de_custo){
		super(nome, idade, altura, sexo, salario);
		setAjudasDeCusto(ajudas_de_custo);
	}

	// Getters e Setters
	public double getAjudasDeCusto() {
		return ajudas_de_custo;
	}

	public void setAjudasDeCusto(double ajudas_de_custo) {
		this.ajudas_de_custo = ajudas_de_custo;
	}
	
	// Retorna valor do salário do administrador somado com suas ajudas de custo
	public double obterLucros(){
		return super.obterLucros() + getAjudasDeCusto();
	}
	
	@Override
	public String toString(){
		// Retorna sobreposição dos dados do administrador
		return super.toString() + "\n" +
				"Salário: " + getSalario() + "\n" +
				"Ajudas de custo: " + getAjudasDeCusto();
	}
}
