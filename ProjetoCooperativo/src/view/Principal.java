package view;

import java.util.Scanner;
import java.util.ArrayList;

import controller.GerarAluguel;
import model.*;

public class Principal {
    static ArrayList <Pessoa> pessoas= new ArrayList<Pessoa>();
    static ArrayList <Automovel> automoveis= new ArrayList<Automovel>();
    static ArrayList <AluguelAutomovel> alugueis= new ArrayList<AluguelAutomovel>();
    public static void main(String[] args){
        
        int resposta = -1;
        while(resposta != 4){
            System.out.println("Escolha uma opção:\n"
                    + "1 - Cadastrar Pessoa\n"
                    + "2 - Cadastrar Automóvel\n"
                    + "3 - Criar Alugueln\n"
                    + "4 - Sair");
            Scanner sc = new Scanner(System.in);
            
           
            resposta = sc.nextInt();
       
            switch (resposta){
                case 1: 
                    System.out.println("1 para cliente " + "2 para funcionario");
                    int opcao = sc.nextInt();
                    
                    if(opcao == 1){
                        Cliente cliente = new Cliente(); 
                        System.out.println("Nome:");
                        cliente.setNome(sc.next());
                        System.out.println("CPF:");
                        cliente.setCpf(sc.nextInt());
                        System.out.println("Altura:");
                        cliente.setAltura(sc.nextFloat());
                        System.out.println("Idade:");
                        cliente.setIdade(sc.nextInt());
                        pessoas.add(cliente);
                    }
                    
                    else if(opcao == 2){
                        Funcionario funcionario = new Funcionario();
                         
                        System.out.println("Nome:");
                        funcionario.setNome(sc.next());
                        System.out.println("CPF:");
                        funcionario.setCpf(sc.nextInt());
                        System.out.println("Altura:");
                        funcionario.setAltura(sc.nextFloat());
                        System.out.println("Idade:");
                        funcionario.setIdade(sc.nextInt());
                        pessoas.add(funcionario);
                    };
                   
//                    String nome = JOptionPane.showInputDialog(null, "Nome: ");
//                    String altura = JOptionPane.showInputDialog(null, "Altura: ");
//                    double alturaDouble = Double.parseDouble(altura);
//                    String idade = JOptionPane.showInputDialog(null, "Idade: ");
//                    int idadeInt = Integer.parseInt(idade);
//                    Pessoa p1 = new Pessoa(nome, alturaDouble, idadeInt);
//                    pessoas.add(p1);
//                    JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
                    break;
                case 2 : 
                    System.out.println("1 para carro " + "2 para caminhão");
                    int opcao2 = sc.nextInt();
                   
                    if(opcao2 == 1){
                        Carro veiculo = new Carro(); 
                        
                        System.out.println("Modelo:");
                        veiculo.setModelo(sc.next());
                        System.out.println("Marca:");
                        veiculo.setMarca(sc.next());
                        System.out.println("Cor:");
                        veiculo.setCor(sc.next());
                        automoveis.add(veiculo);
                    }
                    
                    else if(opcao2 == 2){
                       
                        Caminhao veiculo = new Caminhao();
                        
                        System.out.println("Modelo:");
                        veiculo.setModelo(sc.next());
                        System.out.println("Marca:");
                        veiculo.setMarca(sc.next());
                        System.out.println("Cor:");
                        veiculo.setCor(sc.next());
                        automoveis.add(veiculo);
                    };
                    
                   /* String cor = JOptionPane.showInputDialog(null, "Cor: ");
                    String tipo = JOptionPane.showInputDialog(null, "Tipo: ");
                    String kmRodado = JOptionPane.showInputDialog(null, "Km Rodados: ");
                    int kmInt = Integer.parseInt(kmRodado);*/
                    break;
                    case 3 :
                        GerarAluguel aluguel = new GerarAluguel();
                        System.out.println("Informe o tipo de aluguel");
                        String tipoAluguel = sc.next();
                        AluguelAutomovel al = aluguel.calcularAluguel(pessoas.get(0), automoveis.get(0), tipoAluguel);
                        break;
                    case 4 :
                        break;
            }
        }
    }

}