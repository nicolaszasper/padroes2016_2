package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Aluguel {
	
	private Cliente cliente;
	private ArrayList<ItemAluguel> itens;
	
	public Aluguel(){
		itens = new ArrayList<ItemAluguel>();
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemAluguel> getItensAluguel() {
		return itens;
	}
	
	public void addItemAluguel(Fita f, int dias){
		itens.add(new ItemAluguel(dias, f));
	}
	
	public void removeFita(Fita fita){
		itens.remove(fita);
	}
	
	public String extrato() {
	    final String fimDeLinha = System.getProperty("line.separator");
	    double valorTotal = 0.0;
	    int pontosDeAlugadorFrequente = 0;
	    Iterator<ItemAluguel> itensAluguelI = itens.iterator();
	    String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;
	    while(itensAluguelI.hasNext()) {
	      double valorCorrente = 0.0;
	      ItemAluguel cada = (ItemAluguel) itensAluguelI.next();
	      // determina valores para cada linha
	      valorCorrente += cada.getValorItem();
	      
	      // adiciona pontos extras, caso o tipo de fita ofereça
	      pontosDeAlugadorFrequente += cada.getPontosAlugadorFrequenteItem();
	  
	      // trata de pontos de alugador frequente
	      pontosDeAlugadorFrequente++;
	      
	      // mostra valores para este aluguel
	      resultado += "\t" + cada.getFita().getTítulo() + "\t" + valorCorrente + fimDeLinha;
	      valorTotal += valorCorrente;
	    } // while
	    // adiciona rodapé
	    resultado += "Valor total devido: " + valorTotal + fimDeLinha;
	    resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
	              " pontos de alugador frequente";
	    return resultado;
	  }
	
	
	
}
