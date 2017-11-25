package ListaExerFixacao04;
public class Cachorro extends Animal{
	// Variáveis de cachorro
	String nome, raca;

	// Construtor padrão
	public Cachorro(){
		super();
	}

	// Construtor sobrecarga
	public Cachorro(String tipo, String cor, String nome, String raca){
		super(tipo, cor);
		setNome(nome);
		setRaca(raca);
	}

	// Getters e Setters
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getRaca(){
		return raca;
	}
	
	public void setRaca(String raca){
		this.raca = raca;
	}
	
	@Override
	public String toString(){
		// Retorna sobreposição dos dados do cachorro
		return super.toString() + ", atende por " + getNome() + ", é da raça " + getRaca();
	}
}
