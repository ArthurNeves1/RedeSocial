package RedeSociall;

public class main {

	public static void main(String[] args) {
		Cadastro Cadastro = new Cadastro();
		
		Usuario Arthur = new Usuario(1234,"arthurnbnb","arthurneves010301");
		Usuario Isaac = new Usuario(5678,"isacasb","isacantonio");
		Usuario Joao = new Usuario(3698,"Joaoskl","joaozim");
		Usuario Caio = new Usuario(4875,"caiobar","cainho123");
		Usuario Andre = new Usuario(9472,"Andregayzao","laranjinha1");
		
		
		Cadastro.cadastrar(Arthur);
		Cadastro.cadastrar(Isaac);
		Cadastro.cadastrar(Joao);
		Cadastro.cadastrar(Caio);
		Cadastro.cadastrar(Andre);
		
		Cadastro.mostrarCadastrados();
		
		Sala The_Walking_Dead = new Sala();
		Sala Narcos = new Sala();
		Sala Vikings = new Sala();
		
		The_Walking_Dead.entrarSala(Arthur);
		The_Walking_Dead.entrarSala(Joao);
		The_Walking_Dead.fazerPostagem(Arthur, "Uma otima serie",5);
		The_Walking_Dead.fazerPostagem(Joao, "Serie razoavel",3);
		The_Walking_Dead.mostarFeed(Joao);
		
		Narcos.entrarSala(Arthur);
		Narcos.entrarSala(Joao);
		
		Vikings.entrarSala(Caio);
		Vikings.entrarSala(Andre); 
		
		Isaac.logar("isacasb","isacantonio");
		Isaac.enviarMensagem("Caioooo",Caio);

		Caio.logar("caiobar","cainho123");
		Caio.mostrarMensagensRecebidas();
		Caio.enviarMensagem("Oi?", Isaac);
		
		Isaac.mostrarMensagensRecebidas();
		Isaac.enviarMensagem("Passa a atividade", Caio);
		
		Caio.mostrarMensagensRecebidas();
		
		
		
	}

}
