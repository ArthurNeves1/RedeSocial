package RedeSociall;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	
	List <Usuario> Cadastrados = new ArrayList<>();
	
	public void logar(Usuario x,String eMail,String senhaA) {
		for (Usuario l : this.Cadastrados) {
			if(x.getLogin() == eMail && x.getSenha() == senhaA) {
				System.out.println("\nLogin efetuado");
			}
			else if(x.getLogin() != eMail) {
				System.out.println("\nE-Mail nao cadastrado");
			}
			else {
				System.out.println("\nSenha Incorreta");
			}
		}
	}

	
	public void cadastrar(Usuario x) {
		Cadastrados.add(x);
	}
	public void mostrarCadastrados() {
		for (Usuario x : this.Cadastrados) {
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
