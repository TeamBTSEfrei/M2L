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
	private static SQLUtilisateur userConnected =new SQLUtilisateur();
	public static SQLUtilisateur getUserConnected() {
		return userConnected;
	}
	public static void setUserConnected(SQLUtilisateur userConnected) {
		controlConnexion.userConnected = userConnected;
	}
	private static ArrayList<SQLReservation> reservationList=new ArrayList<SQLReservation>();
	
	public static SQLUtilisateur validUser(ArrayList<SQLUtilisateur> userList ,String user, String mdp) {
		userExist=false;
		laVerite=false;
		Validation valid= new Validation();
			for(SQLUtilisateur theUser:userList){
				if (theUser.getEmail().equals(user)){
					userExist=true;
					if(theUser.getMdp().equals(mdp)){
					laVerite=true;
					userConnected=theUser;
					valid.Valid("vous etes bien connecté: "+userConnected.getNom());
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

		return userConnected;
}
	public static void main(String[] args){
		
		SQLUtilisateur util = new SQLUtilisateur();
		util.setEmail("said.boufkhed@gmail.com");
		util.setMdp("root");
		util.setNom("Said");
		userList.add(util);
		controlConnexion.validUser(userList,"said.boufkhed@gmail.com","root");
		
	}
}
