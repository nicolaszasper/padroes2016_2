package controller;

import java.util.ArrayList;

import model.Aluguel;
import model.Cliente;
import model.Fita;

public class Locadora {
	private ArrayList<Aluguel> alugueis;
	
	public Locadora(){
		alugueis = new ArrayList<Aluguel>();
	}
	
	public Aluguel addAluguel(Cliente c, Fita f, int dias){
		Aluguel a = new Aluguel();
		a.setCliente(c);
		a.addItemAluguel(f, dias);
		alugueis.add(a);
		return a;
	}
	
	public void addAluguel(Aluguel a){
		alugueis.add(a);
	}
	
	public String listarAlugueis(){
		
		if(alugueis.isEmpty()){
			return "\n\nNão existe nenhum aluguel cadastrado";
		}
		
		String str = "";
		str += "\n\n--- LISTA DOS ALUGUEIS REGISTRADOS ---\n\n";
		for(Aluguel a : alugueis){
			int idx = alugueis.indexOf(a) + 1;
			str += "ALUGUEL " + idx + "\n";
			str += "Cliente: " + a.getCliente().getNome() + "\n";
			str += "Fitas: " + a.getItensAluguel().size() + "\n";
			str += "---------\n";
		}
		return str;
	}
	
	
}
