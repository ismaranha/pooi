
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			
			BombaCombustivel b = new BombaCombustivel();
		
			b.setQuantidadeDeCombustivel(100);
			b.setTipoDeCombustivel("Etanol");
			b.setValorPorLitro(4.633);
			
			System.out.println(String.format("%.4f", b.abastecerPorLitro(10)));
			System.out.println(String.format("%.4f", b.abastecerPorValor(46)));
			
		} 
		catch (Exception ex)
		{
			System.out.println(ex);
		}
	}

}
