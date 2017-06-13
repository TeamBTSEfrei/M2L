package controller;

import java.util.regex.Pattern;

import vue.Inscription;
import vue.mainClass;

public class ControlInscription {

	
	public static boolean validData(String nom, String prenom,String email,String mdp,String mdp1,String adresse,int telephone,String SUmdp){
		
		//vérification de l'email
		
		boolean comptValid=Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", email);
		
		//vérification de l'existance d'un nom et prénom 
		if(nom.equals(null)||prenom.equals(null)){
			comptValid=false;
			System.out.println("nom ou prénom");
		}
		
		//verification du mot de passe
		if(!mdp.equals(mdp1)){
			comptValid=false;
			System.out.println("mot de passe");
		}
		//verification du superuser
		if(!SUmdp.equals(mainClass.getSU())){
			comptValid=false;
			System.out.println("superuser 'mot de passe'");
			if(SUmdp.equals("non"))
			{
				comptValid=true;
				
			}
		}

		
		
		return comptValid;
	}
	
	public static void main(String[] args) {
		
		System.out.println(ControlInscription.validData("boubou","said","sa@sa.sa","coca","coca","11 rue",0120,"non"));
	}
}
