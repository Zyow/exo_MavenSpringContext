package fr.mxsz.exo_MavenSpringContext.Vehicules;

public class Vehicule {
	
	private String couleur;
	private float poid;
	
	public Vehicule() {
		
	}
	
	public Vehicule (String couleur, float poid) {
		this.couleur = couleur;
		this.poid = poid;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public float getPoid() {
		return poid;
	}

	public void setPoid(float poid) {
		this.poid = poid;
	}

	@Override
	public String toString() {
		return "Vehicule [couleur=" + couleur + ", poid=" + poid + "]";
	}
	
	
}
