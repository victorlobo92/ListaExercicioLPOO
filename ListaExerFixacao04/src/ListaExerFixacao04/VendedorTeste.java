package ListaExerFixacao04;
import javax.swing.JOptionPane;

public class VendedorTeste {
	public static void main(String[] args){
		// Informa dados do vendedor (nome, idade, altura, sexo, salário, valor das vendas e comissão)
		String nome = JOptionPane.showInputDialog("Qual o nome do vendedor?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de " + nome + "?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura de " + nome + "?"));
		String sexo = JOptionPane.showInputDialog("Qual o sexo de " + nome + "?");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário de " + nome + "?"));
		double valor_vendas = Double.parseDouble(JOptionPane.showInputDialog("Quanto " + nome + " vendeu?"));
		double comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a comissão de " + nome + "?"));
		
		// Instancia novo vendedor utilizando o construtor de sobrecarga
		Vendedor vendedor_1 = new Vendedor(nome, idade, altura, sexo, salario, valor_vendas, comissao);
		
		// Mostra informações do vendedor para usuário do sistema
		JOptionPane.showMessageDialog(null, vendedor_1.toString() + "\nSalário final: " + vendedor_1.obterLucros());
	}
}
