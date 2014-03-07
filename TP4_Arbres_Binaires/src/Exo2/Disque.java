package Exo2;

public class Disque {
	private String _titre;
	private String _auteur;
	private int _nbEcoutes;
	
	public Disque(String titre, String auteur, int nbEcoutes){
		_nbEcoutes = nbEcoutes;
		_titre = titre;
		_auteur = auteur;
	}
	
	public String getTitre(){
		return _titre;
	}
	
	public int getEcoutes(){
		return _nbEcoutes;
	}
	
	public String getAuteur(){
		return _auteur;
	}
	
	
	public void setTitre(String titre){
		_titre = titre;
	}
	
	public void setEcoutes(int ecoutes){
		_nbEcoutes = ecoutes;
	}
	
	public void setAuteur(String auteur){
		_auteur = auteur;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titre : "+_titre+" Auteur: "+_auteur+" NbEcoutes : "+_nbEcoutes;
	}
	
	public void lire(){
		_nbEcoutes++;
	}
}
