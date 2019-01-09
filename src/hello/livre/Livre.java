/**
 * 
 */
package hello.livre;

/**
 * @author Dell
 *
 */
public class Livre {
	private String titre;
	private String resume;
	private int nbPages;
	/** Définition d'une constante de classe (en majuscule)
	 * Le mot clé final interdit la modification de la valeur
	 */
	private final int MINIMUMPAGES=4;
	
	/**getter/setter générés*/
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		if (nbPages>=MINIMUMPAGES) {
			this.nbPages = nbPages;
		}
		else { this.nbPages=MINIMUMPAGES;
		}
	}
	/**constructeurs*/
	public Livre() {
		System.out.println("constructeur Livre sans paramètres");
	}
	public Livre(String titre, String resume, int nbPages) {
		this.titre=titre;
		this.resume=resume;
		if (nbPages>=MINIMUMPAGES) {
			this.nbPages = nbPages;
		}
		else { this.nbPages=MINIMUMPAGES;
		}
		System.out.println("constructeurs 3 paramètres");
	}
	
	/**autres getter/setter*/
	public Livre titre(String titre) {
		this.titre=titre;
		return this;
	}
	public String titre() {
		return this.titre;
	}
	public Livre resume(String resume) {
		this.resume=resume;
		return this;
	}
	public String resume() {
		return this.resume;
	}
	public Livre nbPages(int nbPages) {
		if (nbPages>=MINIMUMPAGES) {
			this.nbPages = nbPages;
		}
		else { this.nbPages=MINIMUMPAGES;
		}
		return this;
	}
	public int nbPages() {
		return this.nbPages;
	}
}

