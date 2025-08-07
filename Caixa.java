package aula3;

public class Caixa {

		private String c = "celular";
	private int vc = 1700;
	double  des, valor;
	
	





	public String getC() {
		return c;
	}







	public void setC(String c) {
		this.c = c;
	}







	public int getVc() {
		return vc;
	}







	public void setVc(int vc) {
		this.vc = vc;
	}







	public void produto (double des) {
		
		if(des <100) {
		des = (des / 100) *vc;
		
		
		
		System.out.println(vc - des);
		}
		
		else {
			System.out.println("esse desconto é invalido diga um valido");
		}
		}
		
	
	
	
}

