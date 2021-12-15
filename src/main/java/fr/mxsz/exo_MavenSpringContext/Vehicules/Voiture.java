package fr.mxsz.exo_MavenSpringContext.Vehicules;

import org.springframework.stereotype.Component;

@Component
public class Voiture extends Vehicule{

	@Override
	public String toString() {
		return "Voiture [Couleur de la voiture=" + getCouleur() + ", Poid de la voiture (T)=" + getPoid() + "]";
	}
	
	
	
}
