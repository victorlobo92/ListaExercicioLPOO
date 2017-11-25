package ListaExerFixacao08;

public class Aniversario extends CartaoWeb{
	public Aniversario(String destinatario){
		super(destinatario);
	}
	
	public String retornarMensagem(String remetente){
		return "Querido(a) " + this.getDestinatario() + ",\n" +
				"Feliz Aniversário!\n" +
				"Que você continue com todo seu carisma cativando novos amigos por toda a vida.\n" +
				"De todo meu coração,\n"+
				remetente;
	}
}
