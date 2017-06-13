package controller;

import modele.modeleUtilisateur;

import java.sql.*;
import java.util.*;

import modele.BDDConnexion;
import modele.SQLUtilisateur;

public class contUtilisateur extends modeleUtilisateur{
	static ArrayList<SQLUtilisateur> user_list;
	static String test;
	static int i=0;

	static SQLUtilisateur gs = new SQLUtilisateur();
	
	public static void selectInfo(){
		 BDDConnexion.connexionBD();
		try { 
	    Statement st = BDDConnexion.conn.createStatement();
	    
	    String query = "SELECT * FROM utilisateur";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    
	    // iterate through the java resultset
	   while (rs.next())
	    {
		   gs.setNum_user(rs.getInt("Num_User"));
		   gs.setNom(rs.getString("Nom_User"));
		   gs.setPrenom(rs.getString("Prenom_User"));
		   gs.setAdresse(rs.getString("Adresse"));
		   gs.setEmail(rs.getString("Email"));
		   gs.setTel(rs.getInt("Telephone"));
		   user_list.add(gs);
	    }
	   System.out.println(gs.getNom());
	    st.close();
	    rs.close();
	    BDDConnexion.conn.close();
	    
		} catch (Exception e) { 
		    System.err.println("Selection echouée "); 
		    System.err.println(e.getMessage()); 
		}
		System.out.println(test);
	}
	
	

}
