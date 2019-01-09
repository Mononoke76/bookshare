/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;

/**
 * @author Dell
 *
 */
public class CreateUsers {
	/** ne créra jamais d 'objet, dc pr utiliser methode de cette classe , mettre static*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Utilisateur loueur=CreateUsers.createLoueur();
		Utilisateur emprunteur= CreateUsers.createEmprunteur();
		Utilisateur emprunteurLoueur=createEmprunteurLoueur();
		/** 2 possibilités soit CreateUsers.createLoueur()
		 * ou createLoueur() ( car on est da la classe CreateUsers*/
		
		if(loueur instanceof Loueur) {
			System.out.println(loueur.nom()+" est un loueur.");
		}
		if(emprunteur instanceof Loueur) {
			System.out.println(emprunteur.nom() + " est un loueur");
		} else {
			System.out.println(emprunteur.nom() + " n'est pas un loueur");
		}
		if(emprunteurLoueur instanceof EmprunteurLoueur) {
			System.out.println(emprunteurLoueur.nom()+ " est un emprunteur ou un loueur");
		}
		//Créer un livre
		Livre livre= new Livre();
		livre
			.titre("Les Misérables")
			.resume("blahblah")
			.nbPages(520);
		((Loueur) loueur).addBook(livre);
		System.out.println(((Loueur) loueur).booksNumber());
		System.out.println(((Loueur) loueur).listBooks());
		
	}
		private static Utilisateur createLoueur() {
			return new Loueur()
					.nom("Aubert")
					.prenom("Jean-Luc")
					.numAdherent("000001234");
			 
		}
		private static Utilisateur createEmprunteur() {
			return new Emprunteur()
					.nom("Talaron")
					.prenom("delephine")
					.numAdherent("000001235");
			
		}
		private static Utilisateur createEmprunteurLoueur() {
			return new EmprunteurLoueur()
					.nom("Bigoudi")
					.prenom("petitChat")
					.numAdherent("000001236");
			
		}
}
