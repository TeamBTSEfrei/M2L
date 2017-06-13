package modele;

import java.util.ArrayList;

public class SQLSalle {
	
	private int num_salle;
	private int num_bat;
	private int etage ;
	private String nom_salle;
	private int places ;
	
	public int getNum_salle() {
		return num_salle;
	}
	public void setNum_salle(int num_salle) {
		this.num_salle = num_salle;
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
	public String getNom_salle() {
		return nom_salle;
	}
	public void setNom_salle(String nom_salle) {
		this.nom_salle = nom_salle;
	}
	public int getPlaces() {
		return places;
	}
	public void setPlaces(int places) {
		this.places = places;
	}
	public static SQLSalle TrouveSalle(ArrayList<SQLSalle> list ,int id)
	{
		SQLSalle laSalle= new SQLSalle(); 
		System.out.println("id "+id+"|la salle "+laSalle.getNum_salle());
		for(SQLSalle sal : list)
		{
			if(id==sal.getNum_salle())
			{
				laSalle = sal;
				System.out.println("la salle "+laSalle.getNum_salle()+"|la salle trouvé "+sal.getNum_salle());
			}
			
		}
		System.out.println("la salle return"+laSalle.getNum_salle());
		return laSalle;
	}
	public static void afficheSalle(SQLSalle salle)
	{
		System.out.println("Numero de la salle: "+salle.getNum_bat()+" |Nom de la salle: "+salle.getNom_salle()+" |Etage: "+salle.getEtage()+" |Places: "+salle.getPlaces());
		
		
	}
	public static ArrayList<SQLSalle> placeSalle()
	{
		ArrayList<SQLSalle> listS=new ArrayList<SQLSalle>();
		SQLSalle salA1=new SQLSalle();
		salA1.setNum_salle(101);
		salA1.setEtage(1);
		salA1.setNom_salle("Salle Daume");
		salA1.setPlaces(30);
		
		SQLSalle salA2=new SQLSalle();
		salA2.setNum_salle(102);
		salA2.setEtage(1);
		salA2.setNom_salle("Salle Gallé");
		salA2.setPlaces(30);
		
		SQLSalle salA3=new SQLSalle();
		salA3.setNum_salle(103);
		salA3.setEtage(1);
		salA3.setNom_salle("Salle Corbine");
		salA3.setPlaces(30);
		
		SQLSalle salA4=new SQLSalle();
		salA4.setNum_salle(104);
		salA4.setEtage(1);
		salA4.setNom_salle("Salle Baccarate");
		salA4.setPlaces(30);
		
		SQLSalle salB1=new SQLSalle();
		salB1.setNum_salle(201);
		salB1.setEtage(1);
		salB1.setNom_salle("Salle Lamour");
		salB1.setPlaces(30);
		
		SQLSalle salB2=new SQLSalle();
		salB2.setNum_salle(202);
		salB2.setEtage(1);
		salB2.setNom_salle("Amphithéâtre");
		salB2.setPlaces(200);
		
		SQLSalle salB3=new SQLSalle();
		salB3.setNum_salle(203);
		salB3.setEtage(1);
		salB3.setNom_salle("Service");
		salB3.setPlaces(10);
		
		SQLSalle salB4=new SQLSalle();
		salB4.setNum_salle(204);
		salB4.setEtage(1);
		salB4.setNom_salle("Salle Multiplexe");
		salB4.setPlaces(100);
		
		SQLSalle salB5=new SQLSalle();
		salB5.setNum_salle(205);
		salB5.setEtage(1);
		salB5.setNom_salle("Salle Longwy");
		salB5.setPlaces(30);
		
		SQLSalle salC1=new SQLSalle();
		salC1.setNum_salle(301);
		salC1.setEtage(1);
		salC1.setNom_salle("Salle Grüber");
		salC1.setPlaces(30);
		
		SQLSalle salC2=new SQLSalle();
		salC2.setNum_salle(302);
		salC2.setEtage(1);
		salC2.setNom_salle("Administration MDL");
		salC2.setPlaces(5);
		
		SQLSalle salD1=new SQLSalle();
		salD1.setNum_salle(401);
		salD1.setEtage(1);
		salD1.setNom_salle("Salle Majorelle");
		salD1.setPlaces(30);
		
		SQLSalle salD2=new SQLSalle();
		salD2.setNum_salle(402);
		salD2.setEtage(1);
		salD2.setNom_salle("Cuisine");
		salD2.setPlaces(10);
		
		SQLSalle salD3=new SQLSalle();
		salD3.setNum_salle(403);
		salD3.setEtage(1);
		salD3.setNom_salle("Salle Restaurant");
		salD3.setPlaces(300);
		
		SQLSalle salD4=new SQLSalle();
		salD4.setNum_salle(404);
		salD4.setEtage(1);
		salD4.setNom_salle("Reprographie");
		salD4.setPlaces(15);
		
		listS.add(salA1);
		listS.add(salA2);
		listS.add(salA3);
		listS.add(salA4);
		listS.add(salB1);
		listS.add(salB2);
		listS.add(salB3);
		listS.add(salB4);
		listS.add(salB5);
		listS.add(salC1);
		listS.add(salC2);
		listS.add(salD1);
		listS.add(salD2);
		listS.add(salD3);
		listS.add(salD4);
		return listS;
	}

}
