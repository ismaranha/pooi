
public class Mamifero extends Animal{
	
	private Animal mamifero;
	
	public Mamifero(String nome,int comprimento,int numeroPatas,String cor,String ambiente,int velocidade){
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
	}

	public Animal getMamifero() {
		return mamifero;
	}

	public void setMamifero(Animal mamifero) {
		this.mamifero = mamifero;
	}

	@Override
	public void listaDados() {
		super.listaDados();
	}
	
}
