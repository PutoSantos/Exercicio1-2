package aluno;

public class Aluno 
{
	String nome;
	int idade;
	int contacto;
	
	public Aluno(String nome, int idade, int contacto) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.contacto = contacto;
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

	public int isContacto() {
		return contacto;
	}

	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	
	 
}
