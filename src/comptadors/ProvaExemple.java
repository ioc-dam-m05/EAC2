package comptadors;

public class ProvaExemple {

	public static void main(String[] args) {
		ComptadorBasic c1=new ComptadorBasic(), c2=new ComptadorBasic(3);
		
		ComptadorDobla cd1=new ComptadorDobla(), cd2=new ComptadorDobla(3);
		
		
		c1.incrementa();
		c2.incrementa();
		System.out.println("c1:"+c1.getCompte());
		System.out.println("c2:"+c2.getCompte());
		
		
		c1.decrementa();
		c2.decrementa();
		System.out.println("c1:"+c1.getCompte());
		System.out.println("c2:"+c2.getCompte());

		
		cd1.dobla();
		cd2.dobla();
		System.out.println("cd1:"+cd1.getCompte());
		System.out.println("cd2:"+cd2.getCompte());
		
		
	}

}
