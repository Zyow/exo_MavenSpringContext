package fr.mxsz.exo_MavenSpringContext.appConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.mxsz.exo_MavenSpringContext.Vehicules.Vehicule;
import fr.mxsz.exo_MavenSpringContext.Vehicules.Voiture;

@Configuration
public class VehiculeConf {

	@Bean Vehicule vehicule() {
		return new Vehicule();
	}
	
	@Bean 
	public Voiture voiture() {
		return new Voiture();
	}
}
