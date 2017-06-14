package modele;

import java.sql.Date;


public class SQLReservation {
	
	private int num_res;     
	private int num_user;
	private String nomUser=new String();
	private String prenomUser=new String();
	private String nomBatiment=new String();
	private String nomSalle=new String();
	private int num_bat;
	private int etage ;
	private int num_salle;
	private Date date ;
	private String datetxt;
	
	/*public SQLReservation(int num_res,int num_user,String nomUser,String prenomUser,String nomBatiment,String nomSalle,int num_bat,int etage,int num_salle,Date date)
	{
		this.setNum_res(num_res);
		this.setNum_user(num_user);				
		this.setNomUser(nomUser);
		this.setPrenomUser(prenomUser);
		this.setNomBatiment(nomBatiment);
		this.setNomSalle(nomSalle);
		this.setNum_bat(num_bat);
		this.setEtage(etage);
		this.setNum_salle(num_salle);
		this.setDate(date);
		
	}*/
	
	public String getNomUser() {
		return nomUser;
	}



	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}



	public String getPrenomUser() {
		return prenomUser;
	}



	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}



	public String getNomBatiment() {
		return nomBatiment;
	}



	public void setNomBatiment(String nomBatiment) {
		this.nomBatiment = nomBatiment;
	}



	public String getNomSalle() {
		return nomSalle;
	}



	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	
	public int getNum_res() {
		return num_res;
	}



	public void setNum_res(int num_res) {
		this.num_res = num_res;
	}
	

	public int getNum_user() {
		return num_user;
	}

	public void setNum_user(int num_user) {
		this.num_user = num_user;
	}



	public int getNum_bat() {
		return num_bat;
	}

	public void setNum_bat(int num_bat) {
		this.num_bat = num_bat;
	}



	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}



	public int getNum_salle() {
		return num_salle;
	}

	public void setNum_salle(int num_salle) {
		this.num_salle = num_salle;
	}


	public void setDate(java.sql.Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public String getTxtDate(){
		Date date1 = this.getDate();
		datetxt=date1.toString();
		return datetxt;
	}
	public void setTxtDate(String dateStr)
	{
		this.setDate(java.sql.Date.valueOf(dateStr));
		
	}

	
}
