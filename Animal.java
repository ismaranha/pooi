
public class Animal {
	private String nome;
	private int comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private int velocidade;
	
	public Animal(String nome,int comprimento,int numeroPatas,String cor,String ambiente,int velocidade){
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void listaDados(){
		System.out.println("Nome " + getNome()
								   + " Comprimento " + getComprimento()
								   + " Numero de patas " + getNumeroPatas()
								   + " Cor " + getCor()
								   + " Ambiente " + getAmbiente()
								   + " Velocidade " + getVelocidade());
	}
	
}
