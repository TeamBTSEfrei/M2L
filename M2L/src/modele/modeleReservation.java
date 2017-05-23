package modele;

import java.sql.ResultSet;
import java.sql.Statement;

public class modeleReservation {
	
	public static SQLReservation select(){
		
		SQLReservation reservation=new SQLReservation();
	    
		BDDConnexion.connexionBD();
		try { 
	    Statement st = BDDConnexion.conn.createStatement();
	    
	    String query = "SELECT * FROM reservation WHERE mdp='admin'";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    

	    while (rs.next())
	    {
	    	
	    	reservation.setNum_res(rs.getInt("Num_res"));
	    	reservation.setNum_user(rs.getInt("Num_user"));
	    	reservation.setNum_bat(rs.getInt("Num_bat"));
	    	reservation.setEtage(rs.getInt("Etage"));
	    	reservation.setNum_salle(rs.getInt("Num_salle"));
	    	reservation.setDate(rs.getDate("Date"));

	      
	      // print the results
	      System.out.println(
	    		  "Num_reservation " + reservation.getNum_res() + 
	    		  ", Num_user " + reservation.getNum_user() +
	    		  ", Num_bat " + reservation.getNum_bat() +
	    		  ", Etage " + reservation.getEtage() + 
	      		  " ,Num_salle " + reservation.getNum_salle() +
	      		  " ,Date " + reservation.getDate());
	    }
	    st.close();
	    rs.close();
	    BDDConnexion.conn.close();
	    
		} catch (Exception e) { 
		    System.err.println("Selection echouée "); 
		    System.err.println(e.getMessage()); 
		}
		return reservation;
	}
}
