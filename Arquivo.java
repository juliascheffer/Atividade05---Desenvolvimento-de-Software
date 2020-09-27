package at.cinco.dominio;

public class Arquivo {

	private String nome;
	private String separador;
	private int posicaoNome;
	private int posicaoPreco;

	public Arquivo(String nomeArquivo, String separador, int posicaoNome, int posicaoPreco) {
		super();
		this.nome = nomeArquivo;
		this.separador = separador;
		this.posicaoNome = posicaoNome;
		this.posicaoPreco = posicaoPreco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSeparador() {
		return separador;
	}

	public void setSeparador(String separador) {
		this.separador = separador;
	}

	public int getPosicaoNome() {
		return posicaoNome;
	}

	public void setPosicaoNome(int posicaoNome) {
		this.posicaoNome = posicaoNome;
	}

	public int getPosicaoPreco() {
		return posicaoPreco;
	}

	public void setPosicaoPreco(int posicaoPreco) {
		this.posicaoPreco = posicaoPreco;
	}
	
	public boolean isInvertido(){
		return posicaoNome > posicaoPreco;
	}
	
	





}
