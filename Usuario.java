package RedeSociall;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private int idUsuario;
    private String eMail;
    private String senha;
    private boolean Login = false;
    
    List <String> Mensagens = new ArrayList<>();
    List <String> MensagensEnviadas = new ArrayList<>();
    List <Usuario> Amigos = new ArrayList<>();
    
    public Usuario(int idUsuario,String eMail,String senha) {
    	this.idUsuario = idUsuario;
    	this.eMail = eMail;
    	this.senha = senha;
    }
    
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getE_Mail() {
		return eMail;
	}
	public void setE_Mail(String eMail) {
		this.eMail = eMail;
	}
	public String getSenha() {
		return senha;
	}
	public boolean getLogin() {
		return this.Login;
	}
	public void setSenha(String senhaAntiga,String Novasenha) {
		this.senha = Novasenha;
	}
	
//	Percorre a lista de Cadastrados na rede, olha se o e-mail e a senha estao corretos 
	public void logar(String eMail,String senhaA) {
		for (Usuario x : Cadastro.Cadastrados) {
			if(this.getE_Mail() == eMail && this.getSenha() == senhaA) {
				this.Login = true;
				System.out.println("\nLogin efetuado" + " " +this.getE_Mail());
				System.out.println("\n-------------------");
				break;
			}
			else if(this.getE_Mail() != eMail) {
				System.out.println("\nE-Mail incorreto");
				break;
			}
			else {
				System.out.println("\nSenha Incorreta");
				break;
			}
		}
	}
//	O usuario sai do perfil
	public void sair() {
		this.Login = false;
	}
//	Recebe a mensagem como parametro e adiciona a mensagem na caixa de entrada do usuario destino (So pode fazer se estiver logado)
	public void enviarMensagem(String Mensage,Usuario x) {
		if(this.Login == true) {
			x.Mensagens.add(Mensage);
			this.MensagensEnviadas.add(Mensage + "Para:" + x.getE_Mail());
		}else {
			System.out.println("Login Não Efetuado");
		}
	}
//	Percorre a lista de mensagens enviadas (So pode fazer se estiver logado)
	public void MensagensEnviadas() {
		if(this.Login == true) {
			for (String y : this.MensagensEnviadas) {
				System.out.println(y);
				System.out.println("\n-------------------");
			}	
		}else {
			System.out.println("Login Não Efetuado");
		}

	}
//	Mostra a caixa de entrada do usuario que esta usando (So pode fazer se estiver logado)
	public void mostrarMensagensRecebidas() {
		if(this.Login == true) {
			for (String y : this.Mensagens) {
				System.out.println(y);
				System.out.println("\n-------------------");
			}	
		}else {
			System.out.println("Login Não Efetuado");
		}

	}
	
	public String toString() {
		return "\nId-Usuario: "+ idUsuario + "\nE-Mail: " + eMail + "\nSenha: "+ senha ;
		
	}
}
