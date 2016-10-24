package model;

public class ItemAluguel {
	private int diasAlugado;
	private Fita fita;
	
	public ItemAluguel(){
		
	}

	public ItemAluguel(int diasAlugado, Fita fita) {
		this.diasAlugado = diasAlugado;
		this.fita = fita;
	}

	public int getDiasAlugado() {
		return diasAlugado;
	}

	public void setDiasAlugado(int diasAlugado) {
		this.diasAlugado = diasAlugado;
	}

	public Fita getFita() {
		return fita;
	}

	public void setFita(Fita fita) {
		this.fita = fita;
	}
	
	
}
