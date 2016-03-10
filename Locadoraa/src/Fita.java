public class Fita {
	private String titulo;
	private double preco;
	private CategoriasDeFilmes categoria;
	private Autor autor;
	
	public Fita(){}
			
	public Fita(String titulo, double preco, CategoriasDeFilmes categoria, Autor autor) {
		this.titulo = titulo;
		this.preco = preco;
		this.categoria = categoria;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public CategoriasDeFilmes getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriasDeFilmes categoria) {
		this.categoria = categoria;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Fita [titulo=" + titulo + ", preco=" + preco + ", categoria=" + categoria + ", autor=" + autor + "]";
	}
	
}