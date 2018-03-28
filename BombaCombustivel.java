
public class BombaCombustivel {
	
	private String tipoDeCombustivel;
	private double valorPorLitro;
	private double quantidadeDeCombustivel;
	
	public BombaCombustivel() {
		this.tipoDeCombustivel = "";
		this.valorPorLitro = 0.0;
		this.quantidadeDeCombustivel = 0.0;
	}
	public double abastecerPorValor(double valor) throws Exception{
		
		double preco;
		double qtdCombustivel,qtdLitro=0;
		
		preco = getValorPorLitro();
		qtdCombustivel = getQuantidadeDeCombustivel();
		
		if(valor < 0 ){
			
			throw new Exception("O valor informado não pode ser negativo");
		}
		
		qtdLitro = (valor/preco);
		qtdCombustivel = qtdCombustivel - qtdLitro;		
		
		if( qtdCombustivel < 0)
		{
			throw new Exception("A bomba nao pode ficar negativa");
		}
		
		setQuantidadeDeCombustivel(qtdCombustivel);
		
		return qtdLitro;
		
	}
	
	public double abastecerPorLitro(double litro)throws Exception{
		
		double preco;
		double qtdCombustivel,valor;
		
		preco = getValorPorLitro();
		qtdCombustivel = getQuantidadeDeCombustivel();
		
		if(litro <0)
		{
			throw new Exception("Litro informado não pode ser negativo");
		}
		
		valor = preco*litro;
		
		return valor;
		
	}
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
	
	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	public double getValorPorLitro() {
		return valorPorLitro;
	}
	
	public void setValorPorLitro(double valorPorLitro) {
		this.valorPorLitro = valorPorLitro;
	}
	
	public double getQuantidadeDeCombustivel() {
		return quantidadeDeCombustivel;
	}
	
	public void setQuantidadeDeCombustivel(double quantidadeDeCombustivel) {
		this.quantidadeDeCombustivel = quantidadeDeCombustivel;
	}
	
	
}
