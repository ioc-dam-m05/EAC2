package comptadors;

/**
 * @author JRamon
 *
 */
public class ComptadorBasic {
	private int compte;

	/**Crea un comptador inicialitzat a zero
	 * 
	 */
	public ComptadorBasic() {

	}
	
	/**Crea un comptador inicialitzat a compt
	 * @param compte valor inicial del comptador
	 */
	public ComptadorBasic(int compte) {
		this.compte = compte;
	}

	/** consulta el valor del comptador
	 * @return the compt
	 */
	public int getCompte() {
		return compte;
	}

	/** modifica el valor del comptador
	 * @param compt the compt to set
	 */
	public void setCompte(int compt) {
		this.compte = compt;
	}
	
	
	
	/**
	 * incrementa en una unitat el comptador
	 */
	public void incrementa(){
		this.compte++;
	}
	
	/**
	 * decrementa en una unitat el comptador
	 */
	public void decrementa(){
		
	}

}
