package vue;

import java.util.ArrayList;

import modele.SQLBatiment;
import modele.SQLReservation;
import modele.SQLSalle;
import modele.SQLUtilisateur;
import modele.modeleUtilisateur;

public final class mainClass {
	private static ArrayList<SQLUtilisateur> tousLesAbonnes= new ArrayList<SQLUtilisateur>();
	private static ArrayList<SQLBatiment> batimentList=new ArrayList<SQLBatiment>();
	private static ArrayList<SQLSalle> sallesList=new ArrayList<SQLSalle>();
	private static SQLUtilisateur userConnected =new SQLUtilisateur();
	
	public static int getSizeOfTousLesAbonnes(){
		return tousLesAbonnes.size();
		
	}
	
	public static int getSizeOfSallesList(){
		return sallesList.size();
		
	}
	
	
	
	
	
	
	
	private static ArrayList<SQLReservation> reservationList=new ArrayList<SQLReservation>();
	public static ArrayList<SQLSalle> getSallesList() {
		return sallesList;
	}




	private static String SU="coca";
	
	public static String getSU() {
		return SU;
	}


	public static ArrayList<SQLUtilisateur> getTousLesAbonnes(){
		return tousLesAbonnes;
	}

	public static void setTousLesAbonnes(ArrayList<SQLUtilisateur> tousLesAbonnes) {
		mainClass.tousLesAbonnes = tousLesAbonnes;
	}

	public static ArrayList<SQLBatiment> getBatimentList() {
		return batimentList;
		
	}

	public static void setBatimentList(ArrayList<SQLBatiment> batimentList) {
		mainClass.batimentList = batimentList;
	}



	public static SQLUtilisateur getUserConnected() {
		return userConnected;
	}

	public static void setUserConnected(SQLUtilisateur userConnected) {
		mainClass.userConnected = userConnected;
	}

	public static ArrayList<SQLReservation> getReservationList() {
		return reservationList;
	}

	public static void setReservationList(ArrayList<SQLReservation> reservationList) {
		mainClass.reservationList = reservationList;
	}

	
	public static void addUnUtilisateur(SQLUtilisateur user)
	{
		tousLesAbonnes.add(user);
	}
	public static void afficheUtilisateur()
	{
		System.out.println("|Numéro Utilisateur|Nom|Prenom|Address|Email|Telephone|Mdp|SuperUser|"); 
		for(SQLUtilisateur abonne :tousLesAbonnes)
		{
			System.out.println("|"+abonne.getNum_user() +"|"+abonne.getNom()+"|"+abonne.getPrenom()+"|"+abonne.getAdresse()+"|"+abonne.getEmail()+"|"+abonne.getTel()+"|"+abonne.getMdp()+"|"+abonne.isSuperUser());
		}
	}
	
	public static void afficheSalle()
	{
		for(SQLSalle salle:sallesList)
		{
			System.out.println("|Numero de salle: "+salle.getNum_salle()+"|Nom de la salle: "+salle.getNom_salle()+"|Etage: "+salle.getEtage()+"|Nombre de places: "+salle.getPlaces());
		}
	}
	
	
	public static void main(String[] args) {
		modeleUtilisateur.select(tousLesAbonnes);
		sallesList.addAll(SQLSalle.placeSalle());
		mainClass.afficheSalle();
		int tel=013025;
		SQLUtilisateur moi= new SQLUtilisateur();
		moi.setAdresse("11 rue du poitou");
		moi.setEmail("said.boufkhed@gmail.com");
		moi.setNom("BOUFKHED");
		moi.setPrenom("Said");
		moi.setMdp("coca");
		moi.setNum_user(1);
		moi.setSuperUser(true);
		moi.setTel(tel);
		tousLesAbonnes.add(moi);
		afficheUtilisateur();
		new Accueil().setVisible(true);
		
		
		

	}

}
