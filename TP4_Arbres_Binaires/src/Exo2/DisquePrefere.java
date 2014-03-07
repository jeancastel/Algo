package Exo2;

public class DisquePrefere extends Disque implements Comparable<DisquePrefere>{

	public DisquePrefere(String titre, String auteur, int nbEcoutes) {
		super(titre, auteur, nbEcoutes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(DisquePrefere o) {
		// TODO Auto-generated method stub
		return (this.getEcoutes()-o.getEcoutes());
	}
	
}
