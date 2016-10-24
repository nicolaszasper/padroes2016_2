package refatorado;

public class FitaLancamento implements Fita {
	private String titulo;
	
	public FitaLancamento(){}
	
	public FitaLancamento(String titulo){
		this.titulo = titulo;
	}
	@Override
	public String getTítulo() {
		return this.titulo;
	}

}
