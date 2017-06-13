package modele;

public class SQLUtilisateur {
	
	private  int num_user;
	private  String nom;
	private  String prenom ;
	private  String adresse;
	private  String email;
	private  int tel;
	private  String mdp;
	private boolean superUser;
	
	public boolean isSuperUser() {
		return superUser;
	}
	public void setSuperUser(boolean superUser) {
		this.superUser = superUser;
	}
	public  int getNum_user() {
		return this.num_user;
	}
	public  void setNum_user(int num_user) {
		this.num_user = num_user;
	}
	
	
	public  String getNom() {
		return this.nom;
	}
	public  void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public  String getPrenom() {
		return this.prenom;
	}
	public  void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	public  String getAdresse() {
		return this.adresse;
	}
	public  void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public  String getEmail() {
		return this.email;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	
	
	public  int getTel() {
		return this.tel;
	}
	public  void setTel(int tel) {
		this.tel = tel;
	}
	public  String getMdp() {
		return this.mdp;
	}
	public  void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public static void SQLutilisateurShow(SQLUtilisateur user){
		System.out.println("|ID: "+user.getNum_user()+ " |Nom: " +user.getNom()+" |Prenom: "+user.getPrenom()+ " |email: " +user.getEmail()+" |telephone: "+user.getTel()+" |Adresse: "+user.getAdresse());
		
		
	}

}
