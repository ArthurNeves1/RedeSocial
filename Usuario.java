package RedeSociall;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	
    private boolean Login = false;
    private String eMail;
    private String senha;
    private String nome;
    private int idade;
    private int idUsuario;
    
	static List <Usuario> Cadastrados = new ArrayList<>();
    List <String> Mensagens = new ArrayList<>();
    List <String> MensagensEnviadas = new ArrayList<>();
    List <Usuario> Amigos = new ArrayList<>();
    
    //Construtor
    public Usuario(String eMail,String senha,String nome,int idade) {
    	this.eMail = eMail;
    	this.senha = senha;
    	this.nome = nome;
    	this.idade = idade;
    	Usuario.this.cadastrar(this);
    }
    
    public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

    public boolean isLogin() {
		return Login;
	}
	public void setLogin(boolean login) {
		Login = login;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	//Cadastra ususarios
	public void cadastrar(Usuario x) {
		Cadastrados.add(x);
	}
	//Percorre lista e mostra os cadastrados
	public void mostrarCadastrados() {
			for (Usuario x : Cadastrados) {
				System.out.println(x);
			
		}
	}
	//Remove Cadastrados
	public void removerCadastrado(Usuario x) {
		if(this.Login == true) {
			Cadastrados.remove(x);
		}
	}
	//Size Cadastrados
	public void qtdCadastrados() {
		if(this.Login == true) {
			System.out.println(Cadastrados.size());
		}
	}
	
	
	

	//	Percorre a lista de Cadastrados na rede, olha se o e-mail e a senha estao corretos 
	public void logar(String eMail,String senhaA) {
		for (Usuario l : Usuario.Cadastrados) {
			if(l.geteMail() == eMail && l.getSenha() == senhaA) {
				this.Login = true;
				System.out.println("\nLogin efetuado" + " " +l.getNome());
				System.out.println("\n-------------------");
				break;
				
			}
			/*else if(l.geteMail() != eMail) {
				System.out.println("\nE-Mail incorreto");
				break;
			}
			else {
				System.out.println("\nSenha Incorreta");
				break;
			}*/
		}
	}
//	O usuario sai do perfil
	public void sair() {
		this.Login = false;
	}

	//	Recebe a mensagem como parametro e adiciona a mensagem na caixa de entrada do usuario destino (So pode fazer se estiver logado)
	public void enviarMensagem(String Mensage,Usuario x) {
		if(this.Login == true) {
			x.Mensagens.add("De " + this.nome + ": "+ Mensage);
			this.MensagensEnviadas.add(Mensage + "Para:" + x.geteMail());
			System.out.println("Mensagem enviada com sucesso!");
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
		return "\nE-Mail: " + eMail + "\nSenha: "+ senha + "\nNome:" + nome + "\nIdade" + idade ;
		
	}
}
