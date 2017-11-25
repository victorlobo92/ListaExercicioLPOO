package ListaExerFixacao08;

import javax.swing.JOptionPane;
import ListaExerFixacao08.Aniversario;
import ListaExerFixacao08.DiaDosNamorados;
import ListaExerFixacao08.Natal;
import ListaExerFixacao08.CartaoWeb;

public class Principal {
	public static void main(String[] args){
		CartaoWeb[] cartoes;
		cartoes = new CartaoWeb[3];

		String remetente = JOptionPane.showInputDialog("Informe o nome do remetente?");
		String destinatario = JOptionPane.showInputDialog("Informe o nome do destinatário?");
		
		cartoes[0] = new Aniversario(destinatario);
		cartoes[1] = new DiaDosNamorados(destinatario);
		cartoes[2] = new Natal(destinatario);
		String[] titulo = new String[3];
		titulo[0] = "Aniversario";
		titulo[1] = "Dia dos Namorados";
		titulo[2] = "Natal";
		
		for(int i = 0; i < cartoes.length; i++){
			JOptionPane.showMessageDialog(null, cartoes[i].retornarMensagem(remetente), titulo[i], JOptionPane.PLAIN_MESSAGE);
		}
	}
}
