public class LocadoraMain {
	public static void main(String[] args) {
		FitaInfantil Dvdinfa = new FitaInfantil();
		FitaLancamento Dvdlanc = new FitaLancamento(); 
		Autor autorDeTodos = new Autor("Thales");
		
		Dvdinfa.setTitulo("Cavaleiro dos Zoodiacos");
		Dvdinfa.setAutor(autorDeTodos);
		Dvdinfa.setCategoria(CategoriasDeFilmes.INFANTIL);
		Dvdinfa.setPreco(10.5);
		
		Dvdlanc.setTitulo("Atividade Paranormal");
		Dvdlanc.setAutor(autorDeTodos);
		Dvdlanc.setCategoria(CategoriasDeFilmes.TERROR);
		Dvdlanc.setPreco(15);
		
		System.out.println(Dvdinfa);
		System.out.println(Dvdlanc);
	}
}
