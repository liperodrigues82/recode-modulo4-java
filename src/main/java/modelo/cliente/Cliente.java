package modelo.cliente;

public class Cliente {

	
	private int codigo;
	private String nome;
	private String rg;
	private String email;
	private String telefone;
	
	public Cliente() {
		
	}

	public Cliente(int codigo, String nome, String rg, String email, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
