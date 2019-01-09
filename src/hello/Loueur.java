/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur {

	private int nbLivreLoue;
	private double cotisationHT;
	private double cotisationTTC;
	public double remise;
	
	

	public int getNbLivreLoue() {
		return nbLivreLoue;
	}

	public void setNbLivreLoue(int nbLivreLoue) {
		this.nbLivreLoue = nbLivreLoue;
		/**if (nbLivreLoue>=30) {
			 remise=Cotisation.cotisationInitialeHT*Cotisation.tauxRemise;
			 cotisationHT=Cotisation.cotisationInitialeHT-remise;
		}else {cotisationHT=Cotisation.cotisationInitialeHT;
			remise=0;}
		cotisationTTC=cotisationHT*(1+Cotisation.tauxTva);*/
		
	}
	public double cotisationHT() {
		if (nbLivreLoue>=30) {
			 remise=Parametres.cotisationInitialeHT*Parametres.tauxRemise;
			 cotisationHT=Parametres.cotisationInitialeHT-remise;
		}else {cotisationHT=Parametres.cotisationInitialeHT;
			remise=0;}
		
		return this.cotisationHT;
	}
	public double cotisationTTC() {
		if (nbLivreLoue>=30) {
			remise=Parametres.cotisationInitialeHT*Parametres.tauxRemise;
			 cotisationHT=Parametres.cotisationInitialeHT-remise;
		}else {cotisationHT=Parametres.cotisationInitialeHT;
			remise=0;}
		cotisationTTC=cotisationHT*(1+Parametres.tauxTva);
		return this.cotisationTTC;
	}
	
	public double remise() {
		if (nbLivreLoue>=30) {
		 remise=Parametres.cotisationInitialeHT*Parametres.tauxRemise;
		 cotisationHT=Parametres.cotisationInitialeHT-remise;
	}else {cotisationHT=Parametres.cotisationInitialeHT;
		remise=0;}
		return this.remise;
	}

	/**
	 * 
	 */
	public Loueur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	public Loueur(String nom, String prenom, String numAdherent,int nbLivreLoue) {
		super(nom, prenom, numAdherent);
		this.nbLivreLoue=nbLivreLoue;
		
		
		
		
		
		// TODO Auto-generated constructor stub
	}

}
