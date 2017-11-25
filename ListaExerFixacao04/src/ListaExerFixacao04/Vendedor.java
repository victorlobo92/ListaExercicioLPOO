package ListaExerFixacao04;
public class Vendedor extends Empregado{
	double valor_vendas, comissao;

	// Construtor padrão
	public Vendedor(){
		super();
	}

	// Construtor sobrecarga
	public Vendedor(String nome, int idade, double altura, String sexo, double salario, double valor_vendas, double comissao){
		super(nome, idade, altura, sexo, salario);
		setValorVendas(valor_vendas);
		setComissao(comissao);
	}

	// Getters e Setters
	public double getValorVendas() {
		return valor_vendas;
	}

	public void setValorVendas(double valor_vendas) {
		this.valor_vendas = valor_vendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	// Retorna valor do salário do vendedor somado com sua comissão
	public double obterLucros(){
		return super.obterLucros() + (getValorVendas() * (getComissao() / 100));
	}
	
	@Override
	public String toString(){
		// Retorna sobreposição dos dados do vendedor
		return super.toString() + "\n" +
				"Salário: " + getSalario() + "\n" +
				"Comissão: " + (getValorVendas() * (getComissao() / 100));
	}
}
