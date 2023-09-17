package programa_filmes;

public abstract class Filmes {
	
	protected String titulo;	
	
	public Filmes(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}		

}
