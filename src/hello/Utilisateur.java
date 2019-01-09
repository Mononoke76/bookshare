/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
/**utilisateur: soit loueur soit emprunteur: donc classe abstraite)*/
abstract public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;
	
	/**
	 * constructeur d'une classe Java
	 * = methode qui porte le nom de la classe
	 */
	public Utilisateur() {
		System.out.println("Je suis le constructeur Utilisateur");
	}
	
	/**
	 *deuxième constructeur avec 3 paramètres 
	 *
	 */
	public Utilisateur(String nom, String prenom, String numAdherent) {
		this.nom=nom;
		this.prenom=prenom;
		this.numAdherent=numAdherent;
		
	}
	
	/**getter et setter générés à partir des attributs en allant dans l'onglet source->enerate getter et setter...*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumAdherent() {
		return numAdherent;
	}
	public void setNumAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
	}
	
	
	/**une autre manière d'écrire des getter*/
	public String nom() {
		return this.nom;
	}
	public String prenom() {
		return this.prenom;
	}
	public String numAdherent() {
		return this.numAdherent;
	}
	
	
	/**une autre manière d'écrire des setter*/
	public Utilisateur nom(String nom) {
		this.nom=nom;
		return this;
	}
	public Utilisateur prenom(String prenom) {
		this.prenom=prenom;
		return this;
	}
	public Utilisateur numAdherent(String numAdherent) {
		this.numAdherent=numAdherent;
		return this;
	}
	
	//** pr utiliser une methode de la classe fille*/
	//public abstract double remise();
	
}
