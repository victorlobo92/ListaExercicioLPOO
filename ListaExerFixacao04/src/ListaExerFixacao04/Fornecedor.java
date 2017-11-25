package ListaExerFixacao04;
public class Fornecedor extends Pessoa{
	// Variáveis de fornecedor
	double credito_maximo, valor_em_divida;

	// Construtor padrão
	public Fornecedor(){
		super();
	}

	// Construtor sobrecarga
	public Fornecedor(String nome, int idade, double altura, String sexo, double credito_maximo, double valor_em_divida){
		super(nome, idade, altura, sexo);
		setCreditoMaximo(credito_maximo);
		setValorDivida(valor_em_divida);
	}

	// Getters e Setters
	public double getCreditoMaximo() {
		return credito_maximo;
	}

	public void setCreditoMaximo(double credito_maximo) {
		this.credito_maximo = credito_maximo;
	}

	public double getValorDivida() {
		return valor_em_divida;
	}

	public void setValorDivida(double valor_em_divida) {
		this.valor_em_divida = valor_em_divida;
	}
	
	// Calcula o saldo disponível do fornecedor
	public double obterSaldo(){
		return getCreditoMaximo() - getValorDivida();
	}
	
	@Override
	public String toString(){
		// Retorna sobreposição dos dados do fornecedor
		return super.toString() + "\n" +
				"Tipo: " + getClass().getName() + "\n" +
				"Crédito Máximo: " + getCreditoMaximo() + "\n" +
				"Valor Dívida: " + getValorDivida();
	}
}
