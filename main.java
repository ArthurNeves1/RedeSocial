package RedeSociall;

public class main {

	public static void main(String[] args) {
		Cadastro ax = new Cadastro();
		Usuario Arthur = new Usuario(1234,"arthurnbnb","arthurneves010301");
		Usuario Isaac = new Usuario(5678,"isacasb","isacantonio");
		
		ax.cadastrar(Arthur);
		ax.cadastrar(Isaac);
		ax.mostrarCadastrados();
		
		ax.logar(Arthur, "arthurnbn","arthurneves010301");
		Sala x = new Sala();
		x.fazerPostagem("Arthur é Lindo");
		x.mostarFeed();
		x.fazerPostagem("Lllllllllll");
		x.mostarFeed();
	}

}
