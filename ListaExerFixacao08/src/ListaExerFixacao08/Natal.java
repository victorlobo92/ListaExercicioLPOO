package ListaExerFixacao08;

public class Natal extends CartaoWeb{
	public Natal(String destinatario) {
		super(destinatario);
	}

	public String retornarMensagem(String remetente) {
		return "Querido(a) " + this.getDestinatario() + ",\n" +
				"Feliz Natal!\n" +
				"Que Deus ilumine seu coração!\n" +
				"Paz!\n"+
				"De: " + remetente;
	}
}
