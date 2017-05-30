package controller;

import java.util.*;

import modele.*;
import vue.Validation;

public class controlConnexion {
	public static boolean laVerite;
	public static boolean userExist;
		
	private static ArrayList<SQLUtilisateur> userList= new ArrayList<SQLUtilisateur>();
	private static ArrayList<SQLBatiment> batimentList=new ArrayList<SQLBatiment>();
	private static ArrayList<SQLSalle> salleList=new ArrayList<SQLSalle>();
	private static SQLUtilisateur userConnected = new SQLUtilisateur();
	private static ArrayList<SQLReservation> reservationList=new ArrayList<SQLReservation>();
	
	public static SQLUtilisateur user(String user, String mdp) {
		userExist=false;
		laVerite=false;
		SQLUtilisateur util = new SQLUtilisateur();
		util.setEmail("said.boufkhed@gmail.com");
		util.setMdp("root");
		util.setNom("Said");
		userList.add(util);
			for(SQLUtilisateur theUser:userList){
				if (theUser.getEmail().equals(user)){
					userExist=true;
					if(theUser.getMdp().equals(mdp)){
					laVerite=true;
					userConnected=theUser;
					Validation.Validation("vous etes bien connecté: "+userConnected.getNom());
				
					
				}
			}
			}
			System.out.println("\n le compte exist? =>"+userExist+"\n le mdp existe? =>"+laVerite);
			

				if(userExist && !laVerite)
				{
					Validation.Validation("Votre mot de passe est incorrect");
					
				}
				else if(!userExist){
					Validation.Validation("Votre compte n'existe pas, faite retour et créer en un dans le menu principal");
					
				}

		return userConnected;
}
	public static void main(String[] args){
		controlConnexion.user("said.boufkhed@gmail.com","root");
		
	}
}
