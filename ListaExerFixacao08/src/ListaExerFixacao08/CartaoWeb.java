package ListaExerFixacao08;

public abstract class CartaoWeb {
	private String destinatario;
	
	public CartaoWeb(String destinatario){
		this.destinatario = destinatario;
	}
	
	public abstract String retornarMensagem(String remetente);

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDestinatario() {
		return this.destinatario;
	}
}