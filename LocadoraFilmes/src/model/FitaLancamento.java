package model;

public class FitaLancamento implements Fita {
	private String titulo;
	private int pontosAlugadorFrequente = 1;
	
	public FitaLancamento(){}
	
	public FitaLancamento(String titulo){
		this.titulo = titulo;
	}
	@Override
	public String getTítulo() {
		return this.titulo;
	}

	@Override
	public double getValor(int diasAlugados) {
  		 return diasAlugados * 3;
	}

	@Override
	public  int getPontosAlugadorFrequente() {
		return this.pontosAlugadorFrequente;
	}

}
