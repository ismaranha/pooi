{
    public static float Soma(float n1, float n2){
	    
	    float s;
	    
	    s = n1+n2;
	    
	    return s;
	}
	public static float Subtracao(float n1, float n2){
	    
	    float s;
	    
	    s = n1-n2;
	    
	    return s;
	}
	public static float Multiplicacao(float n1, float n2){
	    
	    float s;
	    
	    s = n1*n2;
	    
	    return s;
	}
	public static float Divisao(float n1, float n2){
	    Scanner tec = new Scanner(System.in);
	    float num1;
	    float num2;
	    float s;
	    
	    String erro = "Nao existe divisao por zero";
	    
	    while(n2==0.0){
	        System.out.println(erro);
	        System.out.println("Digite um novo n2");
	        n2 = tec.nextFloat();
	    }
	    s = n1/n2;
	    
	    return s;
	}
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
	    
	    float n1,n2;
	    
		System.out.println("Digite os numeros");
		System.out.println("N1 ");
		n1 = teclado.nextFloat();
		
		System.out.println("N2 ");
		n2 = teclado.nextFloat();
		
	    System.out.println("Soma " + Soma(n1,n2));
	    
	    System.out.println("Subtracao " + Subtracao(n1,n2));
	    
	    System.out.println("Multiplicacao " + Multiplicacao(n1,n2));
	 
        System.out.println("Divisao " + Divisao(n1,n2));
   
	}
	
}