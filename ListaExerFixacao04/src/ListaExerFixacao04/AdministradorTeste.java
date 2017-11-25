package ListaExerFixacao04;
import javax.swing.JOptionPane;

public class AdministradorTeste {
	public static void main(String[] args) {
		// Informa dados do administrador (nome, idade, altura, sexo, salário e ajudas_de_custo)
		String nome = JOptionPane.showInputDialog("Qual o nome do administrador?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de " + nome + "?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura de " + nome + "?"));
		String sexo = JOptionPane.showInputDialog("Qual o sexo de " + nome + "?");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário de " + nome + "?"));
		double ajudas_de_custo = Double.parseDouble(JOptionPane.showInputDialog("Quanto " + nome + " recebe de ajuda de custo?"));
		
		// Instancia novo administrador utilizando o construtor de sobrecarga
		Administrador administrador_1 = new Administrador(nome, idade, altura, sexo, salario, ajudas_de_custo);
		
		// Mostra informações do administrador para usuário do sistema
		JOptionPane.showMessageDialog(null, administrador_1.toString() + "\nSalário final: " + administrador_1.obterLucros());
	}
}
