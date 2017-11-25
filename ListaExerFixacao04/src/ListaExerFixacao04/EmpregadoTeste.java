package ListaExerFixacao04;
import javax.swing.JOptionPane;

public class EmpregadoTeste {
	public static void main(String[] args) {
		// Informa dados do empregado (nome, idade, altura, sexo e salário)
		String nome = JOptionPane.showInputDialog("Qual o nome do empregado?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de " + nome + "?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura de " + nome + "?"));
		String sexo = JOptionPane.showInputDialog("Qual o sexo de " + nome + "?");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário de " + nome + "?"));
		
		// Instancia novo empregado utilizando o construtor de sobrecarga
		Empregado empregado_1 = new Empregado(nome, idade, altura, sexo, salario);
		
		// Mostra informações do empregado para usuário do sistema
		JOptionPane.showMessageDialog(null, empregado_1.toString() + "\nSalário: " + empregado_1.obterLucros());
	}
}
