package controller;

import model.AluguelAutomovel;
import model.Automovel;
import model.Diaria;
import model.Mensal;
import model.Pessoa;

public class GerarAluguel{
        public AluguelAutomovel calcularAluguel(Pessoa cliente, Automovel automovel, String tipoAl){
            if(tipoAl == "Diaria"){
                Diaria d = new Diaria(automovel,cliente);
                d.setAutomovel(automovel);
                d.setPessoa(cliente);
                return d;
            }else if(tipoAl == "Mensal"){
                Mensal m = new Mensal(automovel,cliente);
                m.setAutomovel(automovel);
                m.setPessoa(cliente);
                return m;
            }
                
            System.out.println("Erro");
            AluguelAutomovel al = null;
            return al;
            
        }
}
