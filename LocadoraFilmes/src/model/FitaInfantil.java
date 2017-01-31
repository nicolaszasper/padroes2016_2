package model;

public class FitaInfantil implements Fita {
	private String titulo;
	private int pontosAlugadorFrequente = 0;
	
	public FitaInfantil(){}
	
	public FitaInfantil(String titulo){
		this.titulo = titulo;
	}
	@Override
	public String getTítulo() {
		return this.titulo;
	}

	@Override
	public double getValor(int diasAlugados) {
		double valor = 1.5;
		if(diasAlugados > 3) {
			valor += (diasAlugados - 3) * 1.5;
		}
        return valor;
	}

	@Override
	public  int getPontosAlugadorFrequente() {
		return this.pontosAlugadorFrequente;
	}

}
