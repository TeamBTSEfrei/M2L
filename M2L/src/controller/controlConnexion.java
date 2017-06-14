package controller;

import java.util.*;

import modele.*;
import vue.Accueil;
import vue.Validation;
import vue.mainClass;

public class controlConnexion {
	public static boolean laVerite;
	public static boolean userExist;


	
	public static void validUser(ArrayList<SQLUtilisateur> userList ,String user, String mdp) {
		userExist=false;
		laVerite=false;
		Validation valid= new Validation();
			for(SQLUtilisateur theUser:userList){
				if (theUser.getEmail().equals(user)){
					userExist=true;
					if(theUser.getMdp().equals(mdp)){
					laVerite=true;
					mainClass.setUserConnected(theUser);
					valid.Valid("vous etes bien connecté: "+mainClass.getUserConnected().getPrenom()+" "+mainClass.getUserConnected().getNom());
					Accueil.setConnect(true);
				}
			}
			}
			System.out.println("\n le compte exist? =>"+userExist+"\n le mdp existe? =>"+laVerite);
			

				if(userExist && !laVerite)
				{
					valid.Valid("Votre mot de passe est incorrect");
					
				}
				else if(!userExist){
					valid.Valid("Votre compte n'existe pas, faite retour et créer en un dans le menu principal");
					
				}

}
	public static void main(String[] args){
		

		controlConnexion.validUser(mainClass.getTousLesAbonnes(),"said.boufkhed@gmail.com","root");
		
	}
}
