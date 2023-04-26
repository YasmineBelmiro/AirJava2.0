package classes;

public class Cliente {
	protected String nome;
	protected String dataNascimento;
	protected String sexo;
	protected String telefone;
	protected String email;
	protected String senha;
	
	public Cliente(String nome, String dataNascimento, String sexo, String telefone, String email, String senha) {
		setNome(nome);
		setDataNascimento(dataNascimento);
		setSexo(sexo);
		setTelefone(telefone);
		setEmail(email);
		setSenha(senha);

	}

	
	public String getNome() {
		return nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", telefone="
				+ telefone + ", email=" + email + ", senha=" + senha + "]";
	}
	
	
}
