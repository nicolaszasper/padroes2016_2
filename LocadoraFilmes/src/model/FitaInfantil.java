package model;

public class FitaInfantil implements Fita {
	private String titulo;
	
	public FitaInfantil(){}
	
	public FitaInfantil(String titulo){
		this.titulo = titulo;
	}
	@Override
	public String getTítulo() {
		return this.titulo;
	}

}
