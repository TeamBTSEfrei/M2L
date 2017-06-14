package controller;

import java.util.regex.Pattern;

import modele.SQLUtilisateur;
import vue.mainClass;
	
	
public class ControlInscription {
	private static String message=new String();
	
	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		ControlInscription.message = message;
	}

	public static boolean validData(String nom, String prenom,String email,String mdp,String mdp1,String adresse,long telephone,String SUmdp){
		
		//vérification de la typographie de l'email
		
		boolean comptValid=Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", email);
		
		//verification du superuser
		if(!SUmdp.equals(mainClass.getSU())){
			comptValid=false;
			//System.out.println("superuser 'mot de passe' faux...!");
			setMessage("superuser 'mot de passe' faux...!");
			if(SUmdp.equals("non"))
			{
				comptValid=true;
				//System.out.println("Mais vous n'etes pas un SuperUser (Y)");
				setMessage("Mais vous n'etes pas un SuperUser (Y)");
				
			}
		}
		
		//verification de l'occurence de l'email
		for(SQLUtilisateur uz:mainClass.getTousLesAbonnes())
		{
			if(email.equals(uz.getEmail()))
			{
				comptValid=false;
				//System.out.println("email similaire...!");
				setMessage("email similaire...!");
			}
			
		}
		
		//vérification de l'existance d'un nom et prénom 
		if(nom.equals(null)||prenom.equals(null)){
			comptValid=false;
			//System.out.println("nom ou prénom manquant...!");
			setMessage("Nom ou Prénom manquant...!");
			
		}
		
		//verification du mot de passe
		if(!mdp.equals(mdp1)){
			comptValid=false;
			//System.out.println("mots de passe non similaire...!");
			setMessage("mots de passe non similaire...!");
		}
		
		
		//verification du telephone
		if(telephone!=0)
		{
			if(telephone<100000000)
			{
				comptValid=false;
				//System.out.println("mots de passe non similaire...!");
				setMessage("votre numéro de telephone est invalide");
			}
		}


		
		
		return comptValid;
	}
	
	public static void main(String[] args) {
		
		System.out.println(ControlInscription.validData("boubou","said","sa@sa.sa","coca","coca","11 rue",0120,"non"));
	}
}
