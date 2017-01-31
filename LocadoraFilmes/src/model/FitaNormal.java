package model;

public class FitaNormal implements Fita {
	private String titulo;
	private int pontosAlugadorFrequente = 0;
	
	public FitaNormal(){}
	
	public FitaNormal(String titulo){
		this.titulo = titulo;
	}
	@Override
	public String getTítulo() {
		return this.titulo;
	}

	@Override
	public double getValor(int diasAlugados) {
		 double valor = 2;
         if(diasAlugados > 2) {
           valor += (diasAlugados - 2) * 1.5;
         }
         return valor;
	}

	@Override
	public  int getPontosAlugadorFrequente() {
		return this.pontosAlugadorFrequente;
	}

}
