package modele;

import java.sql.ResultSet;
import java.sql.Statement;

public class modeleSalle {
	
	
	public static SQLSalle select(){
		
		SQLSalle salle = new SQLSalle();
	    
		BDDConnexion.connexionBD();
		try { 
	    Statement st = BDDConnexion.conn.createStatement();
	    
	    String query = "SELECT * FROM salle ";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    

	    while (rs.next())
	    {
	    	
	    	salle.setNum_salle(rs.getInt("Num_Salle"));
	    	salle.setNum_bat(rs.getInt("Num_Bat"));
	    	salle.setEtage(rs.getInt("Etage"));
	    	salle.setNom_salle(rs.getString("Nom_Salle"));
	    	salle.setPlaces(rs.getInt("Places"));
	      
	      // print the results
	      System.out.println(
	    		  "Num_Salle " + salle.getNum_salle() + 
	    		  ", Nom_Bat " + salle.getNum_bat() +
	    		  ", Etage " + salle.getEtage() +
	    		  ", Nom_Salle " + salle.getNom_salle() + 
	      		  " ,Places " + salle.getPlaces() 
	      )
	      ;
	    }
	    st.close();
	    rs.close();
	    BDDConnexion.conn.close();
	    
		} catch (Exception e) { 
		    System.err.println("Selection echouée "); 
		    System.err.println(e.getMessage()); 
		}
		return salle;
	}

}
