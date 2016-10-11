package refatorado;

import java.util.*;
public class Cliente {
	
  private String nome;
  private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
  
  public Cliente(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }
  public void adicionaAluguel(Aluguel aluguel) {
    fitasAlugadas.add(aluguel);
  }
  public String extrato() {
    final String fimDeLinha = System.getProperty("line.separator");
    double valorTotal = 0.0;
    int pontosDeAlugadorFrequente = 0;
    Iterator<Aluguel> alugueis = fitasAlugadas.iterator();
    String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
    while(alugueis.hasNext()) {
      double valorCorrente = 0.0;
      Aluguel cada = (Aluguel)alugueis.next();
      // determina valores para cada linha
      if(cada.getFita().getClass().equals(FitaNormal.class)){
    	  valorCorrente += 2;
          if(cada.getDiasAlugada() > 2) {
            valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
          }
      }else
    	  if(cada.getFita().getClass().equals(FitaLancamento.class)){
    		  valorCorrente += cada.getDiasAlugada() * 3;
    		// adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
    		  if(cada.getDiasAlugada() > 1)
    			  pontosDeAlugadorFrequente++;
    		  
      }else{
    	  valorCorrente += 1.5;
          if(cada.getDiasAlugada() > 3) {
            valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
          }
      }
    	  
  
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

