package comptadors;

public class ProvaExemple {

	public static void main(String[] args) {
		ComptadorBasic c1=new ComptadorBasic(), c2=new ComptadorBasic(3);
		
		c1.incrementa();
		c2.incrementa();
		System.out.println("c1:"+c1.getCompte());
		System.out.println("c2:"+c2.getCompte());
		
		
		c1.decrementa();
		c2.decrementa();
		System.out.println("c1:"+c1.getCompte());
		System.out.println("c2:"+c2.getCompte());

		
	}

}
