package hello.utilisateurs.interfaces;

import hello.livre.Livre;
import hello.utilisateurs.Utilisateur;

public interface LoueurInterface {
	public Utilisateur addBook(Livre livre);
	public Utilisateur loan(Livre livre);
	public Utilisateur coutCotisation();

}
