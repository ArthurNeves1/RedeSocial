package RedeSociall;

import java.util.ArrayList;
import java.util.List;


public class Sala {
	List <Usuario> participantes = new ArrayList<>();
	List <String> feed = new ArrayList<>();
	String nome;
	String dataCriacao;
	
	public Sala() {
		
	}
//	Adiciona um usuario a sala
	public void entrarSala(Usuario x) {
		participantes.add(x);
	}
//	Percorre a lista de participantes para olhar se ele esta na sala e so deixa ele fazer a postagem se estiver logado e
//	tiver participando da sala
	public void fazerPostagem(Usuario x,String a,int p) {
		for (Usuario l : this.participantes) {
			if(l.getIdUsuario() == x.getIdUsuario() && x.getLogin() == true) {
				feed.add("Comentario: " + a + " Avaliação: " + Integer.toString(p) + " Usuario: " + x.getE_Mail());
				System.out.println("Postagem realizada");
			}
		}	
	}
//	Percorre a lista de de postagem da sala printando as postagens
	public void mostarFeed(Usuario x) {
		for (Usuario l : this.participantes) {
			if(l.getIdUsuario() == x.getIdUsuario()) { 
				for (String f : this.feed) {
					System.out.println(f);}
			}
		}	
	}
}
