/**
 * 
 */
package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;

/**
 * @author Dell
 *
 */
public class Hello {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		/**Création utilisateur*/
		Utilisateur moi = new Loueur();
		moi.setNom("Tartempion");
		moi.setPrenom("Jules");
		moi.setNumAdherent("5722001");
		
		Utilisateur lui= new Loueur("Rudd","jack","5722002",51);
		
		Utilisateur alien= new Loueur();
		alien
			.nom("ET")
			.prenom("Dvorak")
			.numAdherent("5722003");
		
		Utilisateur wall= new Emprunteur("wall","-E","5722002");
		((Emprunteur) wall).nbJour(10);
		((Emprunteur) wall).nbLivreEmprunte(3);
		
		
			
		
		
		System.out.println("Utilisateur: "+ moi.getNom());
		System.out.println("Utilisateur: "+ ((Loueur) lui).cotisationTTC()); // Casting de classe
		System.out.println("Utilisateur: "+ alien.nom()); 
		System.out.println("Utilisateur: "+ ((Emprunteur) wall).coutTotalHT());
		
		/**Création Livre*/
		
		Livre lesMiserables= new Livre();
		lesMiserables.setTitre("Les Misérables");
		lesMiserables.setResume("blah blah");
		lesMiserables.setNbPages(110);
		
		Livre fondation= new Livre("Fondation","youyou",80);
		
		Livre harryPotter= new Livre();
		harryPotter
			.titre("Harry Potter à l'école des sorciers")
			.resume("blablabla")
			.nbPages(2);
		
		System.out.println(lesMiserables.getTitre());
		System.out.println(fondation.getTitre());
		System.out.println(harryPotter.nbPages());
		
		/**Auteur?*/
		SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
		Date date= format.parse("1809-01-01");
		Auteur hugo= Auteur.getAuteur("Hugo","Victor",date);
		if (hugo==null) {
			System.out.println("impossible d'instancier hugo");
		}
		else {
		System.out.println("Auteur: " + hugo.getNom()+" né le "+ hugo.getNaissance() );
		}
		System.out.println(new Date());
	}

}
