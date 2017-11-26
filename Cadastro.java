package RedeSociall;

import java.util.ArrayList;
import java.util.List;


public class Cadastro {
	
	 static List <Usuario> Cadastrados = new ArrayList<>();

//	Cadastra um usuario na rede
	public void cadastrar(Usuario x) {
		Cadastrados.add(x);
	}
	public List<Usuario> getCadastrados() {
		return Cadastrados;
	}
	public void setCadastrados(List<Usuario> cadastrados) {
		Cadastrados = cadastrados;
	}
	public void mostrarCadastrados() {
		for (Usuario x : Cadastro.Cadastrados) {
			System.out.println(x);
		}	
	}
	public void removerCadastrado(Usuario x) {
		Cadastrados.remove(x);
	}
	public void qtdCadastrados() {
		System.out.println(Cadastrados.size());
	}
	
}
