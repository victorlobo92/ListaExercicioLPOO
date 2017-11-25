package ListaExerFixacao08;

public class DiaDosNamorados extends CartaoWeb {
	public DiaDosNamorados(String destinatario) {
		super(destinatario);
	}

	public String retornarMensagem(String remetente) {
		return "Querida " + this.getDestinatario() + ",\n"
				+ "Te desejo um feliz dia dos namorados com todo o amor do mundo!\n"
				+ "Que esse ano você consiga se lembrar do meu nome.\n"
				+ "Dica: não é João do caminhão.\n"
				+ "Com amor,\n"
				+ remetente;
	}
}