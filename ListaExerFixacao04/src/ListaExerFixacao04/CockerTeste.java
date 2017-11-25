package ListaExerFixacao04;
import javax.swing.JOptionPane;

public class CockerTeste {
	public static void main(String[] args) {
		// Informa tipo de animal
		int tipo_animal = 0;
		// Enquanto o usuário não informar um tipo de animal válido (menu), o sistema solicita informação.
		while(tipo_animal < 1 || tipo_animal > 7){
			tipo_animal = Integer.parseInt(JOptionPane.showInputDialog(
				"Qual o tipo de animal?\n"+
				"1 - Anfíbios\n"+
				"2 - Aves\n"+
				"3 - Invertebrado\n"+
				"4 - Mamiferos\n"+
				"5 - Peixes\n"+
				"6 - Répteis\n"+
				"7 - Vertebrados\n"
			));
		}
		// Informado o número do menu, o sistema salva tipo de animal em nova variável
		String tipo = "";
		switch(tipo_animal){
			case 1:
				tipo = "Anfíbio";
				break;
			case 2:
				tipo = "Ave";
				break;
			case 3:
				tipo = "Invertebrado";
				break;
			case 4:
				tipo = "Mamifero";
				break;
			case 5:
				tipo = "Peixe";
				break;
			case 6:
				tipo = "Réptil";
				break;
			case 7:
				tipo = "Vertebrado";
				break;
			default:
				break;
		}
		
		// Informa cor do animal
		String cor = JOptionPane.showInputDialog("Qual a cor do animal?");
		
		// Informa nome do animal
		String nome = JOptionPane.showInputDialog("Qual o nome do animal?");
		
		// Informa raça do animal
		String raca = JOptionPane.showInputDialog("Qual a raça do animal?");
		
		// Informa se animal recebe tosa
		int tosa = JOptionPane.showConfirmDialog(null, "O animal recebe tosa?", "Selecionar uma opção", JOptionPane.YES_NO_OPTION);
		
		// Instancia novo Cocker chamando construtor de sobrecarga
		Cocker animal_1 = new Cocker(tipo, cor, nome, raca, tosa);
		
		// Mostra dados do Cocker utilizando método toString()
		JOptionPane.showMessageDialog(null, animal_1);
	}
}
