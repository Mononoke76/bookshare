package hello.utilisateurs;

abstract public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;
	
	public Utilisateur nom(String nom) {
		this.nom=nom;
		return this;
	}
	
	public String nom() {
		return this.nom;
	}
	
	public Utilisateur prenom(String prenom) {
		this.prenom=prenom;
		return this;
	}
	
	public String prenom() {
		return this.prenom;
	}
	public Utilisateur numAdherent(String numAdherent) {
		this.numAdherent=numAdherent;
		return this;
	}
	
	public String numAdherent() {
		return this.numAdherent;
	}
	/** public void setNom(String nom){
	 * this.nom=nom;
	 * }
	 ATTENTION: on ne peut pas chainer type void. cest pk on prefere methode type utilisateur pour faire 
	 user
	 	.nom
	 	.prenom; / ca marche
	 	
	 user
	 	.setNom
	 	.prenom; / marche pas car setNom type void!
	* les setter et getter g�n�r�s sont de type void
	* */
	
	
	
	

}
