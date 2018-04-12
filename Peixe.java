
public class Peixe extends Animal {
	
	private Animal peixe;
	
	public Peixe(String nome,int comprimento,int numeroPatas,String cor,String ambiente,int velocidade){
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
		
	}
	public Animal getPeixe() {
		return peixe;
	}

	public void setPeixe(Animal peixe) {
		this.peixe = peixe;
	}
	
	@Override
	public void listaDados(){
		super.listaDados();
	}
	
}
