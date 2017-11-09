package RedeSociall;

public class Usuario {
	private int idUsuario;
    private String eMail;
    private String senha;
    
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
	public void setSenha(String senhaAntiga,String Novasenha) {
		this.senha = Novasenha;
	}
    
	public String toString() {
		return "\nId-Usuario: "+ idUsuario + "\nE-Mail: " + eMail + "\nSenha: "+ senha ;
		
	}
	
}
