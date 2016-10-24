package refatorado;

public class FitaNormal implements Fita {
	private String titulo;
	
	public FitaNormal(){}
	
	public FitaNormal(String titulo){
		this.titulo = titulo;
	}
	@Override
	public String getTítulo() {
		return this.titulo;
	}

}
