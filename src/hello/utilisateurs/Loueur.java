/**
 * 
 */
package hello.utilisateurs;

import java.util.ArrayList;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur implements LoueurInterface {
	/**tableau pas la bonne pratique 
	 * private Livre[] books;// books : variable qui designe un tableau d'objets de la classe Livre
	 */
	private ArrayList<Livre> books;
	/**
	 * attention a definir l'objet ArrayList !!! 
	 */
	public Loueur() {
		this.books=new ArrayList<Livre>();
		// TODO Auto-generated constructor stub
	}
	public String booksNumber() {
		String message="Nombre de livre:";
		message += this.books.size();
		return message;
	}
	public String listBooks() {
		String message= "livre de la collection "+this.nom+ "\n";
		//Boucle sur la collection de livre (for each)
		for(Livre livre:this.books) {
			message +=livre.titre()+"\n";
		}
		return message;
	}
	@Override
	public Utilisateur addBook(Livre livre) {
		/**si on avait choisit un tableau
		 * int tailleTableau=this.books.length;
		int indice=0;
		if(tailleTableau>0) {
			indice=tailleTableau;
		}
		this.books[indice]= livre;
		*/
		if(!this.books.contains(livre)) {
		this.books.add(livre);
		}
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur coutCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

}
