/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Utilisateur {
	public int nbLivreEmprunte;
	public double coutTotalHT;
	public int nbJour;
	
	

	/**
	 * 
	 */
	public double coutTotalHT() {
		coutTotalHT=nbLivreEmprunte*Parametres.coutParJourHT*nbJour;	
		return coutTotalHT;
	}
	
	public void nbLivreEmprunte(int nbLivreEmprunte) {
		this.nbLivreEmprunte = nbLivreEmprunte;
	}

	public void nbJour(int nbJour) {
		this.nbJour = nbJour;
	}

	public Emprunteur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	
	public Emprunteur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	}
	
	

}
