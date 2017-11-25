package ListaExerFixacao04;
import javax.swing.JOptionPane;

public class FornecedorTeste {
	public static void main(String[] args) {
		// Informa dados do fornecedor (nome, idade, altura, sexo, crédito máximo e valor em dívida)
		String nome = JOptionPane.showInputDialog("Qual o nome do fornecedor?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de " + nome + "?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura de " + nome + "?"));
		String sexo = JOptionPane.showInputDialog("Qual o sexo de " + nome + "?");
		double credito_maximo = Double.parseDouble(JOptionPane.showInputDialog("Qual o crédito máximo de " + nome + "?"));
		double valor_em_divida = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor em dívida de " + nome + "?"));

		// Instancia novo fornecedor utilizando o construtor de sobrecarga
		Fornecedor fornecedor_1 = new Fornecedor(nome, idade, altura, sexo, credito_maximo, valor_em_divida);
		
		// Busca saldo do fornecedor
		double saldo = fornecedor_1.obterSaldo();
		
		// Mostra informações do fornecedor para usuário do sistema
		JOptionPane.showMessageDialog(null, fornecedor_1.toString() + "\nSaldo: R$ " + saldo + "\n" + ((saldo >= 0)? "Uhuuul... pode gastar. Tá liberado! Você ainda tem R$ " + saldo + ".": "Oops... saldo negativo! Bora maneirar aí, jovem gafanhoto.\nHoje você bebe só água. Nada de uma gelada pra você."));
	}
}