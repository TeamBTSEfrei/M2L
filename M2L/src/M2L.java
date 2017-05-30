import java.util.ArrayList;

import modele.*;
import vue.*;

public class M2L {
	public static ArrayList<SQLUtilisateur> userList=new ArrayList<SQLUtilisateur>();
	public static ArrayList<SQLBatiment> buildingList =new ArrayList<SQLBatiment>();
	public static ArrayList<SQLReservation> reservationList =new ArrayList<SQLReservation>();
	public static ArrayList<SQLSalle> roomList=new ArrayList<SQLSalle>();

	public M2L() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		userList.add(modeleUtilisateur.select());
		reservationList.addAll(modeleReservation.select());
		roomList.add(modeleSalle.select());
		buildingList.addAll(modeleBatiment.select());
		Accueil accueil = new Accueil(); 
	}

}
