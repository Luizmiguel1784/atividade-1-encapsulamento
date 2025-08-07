package aula3;

public class Mercado {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		Caixa c = new Caixa();
		
		System.out.println("os produtos são " + c.getC() + " é o seu valor é " + c.getVc());
		
		System.out.println("qual o desconto do produto");
		c.produto(sc.nextDouble());
		
		sc.close();

	}

}

