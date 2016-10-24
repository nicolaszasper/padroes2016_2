package refatorado;

public class ItemAluguel {
	private int diasAlugado;
	private Fita fita;
	
	public ItemAluguel(){
		
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
