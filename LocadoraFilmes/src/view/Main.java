package view;

import controller.Locadora;
import model.Aluguel;
import model.Cliente;
import model.Fita;
import model.FitaInfantil;
import model.FitaLancamento;
import model.FitaNormal;

public class Main {
	public static void main(String[] args) {
	    Locadora locadora = new Locadora();
	    
	    Cliente c1 = new Cliente("Juliana");

	    Fita f1 = new FitaNormal("O Exorcista");
	    Fita f2 = new FitaNormal("Men in Black");
	    Fita f3 = new FitaLancamento("Jurassic Park III");
	    Fita f4 = new FitaLancamento("Planeta dos Macacos");
	    Fita f5 = new FitaInfantil("Pateta no Planeta dos Macacos");
	    Fita f6 = new FitaInfantil("O Rei Leão");
	    
	    Aluguel a1 = new Aluguel();
	    a1.setCliente(c1);
	    
	    a1.addItemAluguel(f1, 3);
	    a1.addItemAluguel(f2, 2);
	    a1.addItemAluguel(f3, 3);
	    a1.addItemAluguel(f4, 4);
	    a1.addItemAluguel(f5, 10);
	    a1.addItemAluguel(f6, 30);
	    
	    locadora.addAluguel(a1);

	    System.out.println(a1.extrato());
	    
	    System.out.println(locadora.listarAlugueis());
	  }
}
