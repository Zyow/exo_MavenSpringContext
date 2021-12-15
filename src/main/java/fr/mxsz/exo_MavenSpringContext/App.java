package fr.mxsz.exo_MavenSpringContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import fr.mxsz.exo_MavenSpringContext.Vehicules.Voiture;

@ComponentScan("fr.mxsz")
public class App {

	public static void main(String[] args) {
		
		//Initialisation du spring context
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		Voiture voiture = context.getBean(Voiture.class);
		voiture.setCouleur("Rouge");
		voiture.setPoid(3f);
		System.out.println(voiture);
		
		Voiture voiture2 = context.getBean(Voiture.class);
		System.out.println();
	}

}
