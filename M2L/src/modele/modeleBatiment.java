package modele;

import java.sql.ResultSet;
import java.sql.Statement;

public class modeleBatiment {
	
public static SQLBatiment select(){
		
		SQLBatiment batiment =new SQLBatiment();
	    
		BDDConnexion.connexionBD();
		try { 
	    Statement st = BDDConnexion.conn.createStatement();
	    
	    String query = "SELECT * FROM utilisateur WHERE mdp='admin'";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    

	    while (rs.next())
	    {
	    	batiment.setNum_Bat(rs.getInt("Num_User"));
	    	batiment.setNom_Bat(rs.getString("Nom_User"));

	      
	      // print the results
	      System.out.println("Num_User "+batiment.getNum_Bat() +", Nom "+batiment.getNom_Bat());
	    }
	    st.close();
	    rs.close();
	    BDDConnexion.conn.close();
	    
		} catch (Exception e) { 
		    System.err.println("Selection echouée: modeleBatiment "); 
		    System.err.println(e.getMessage()); 
		}
		return batiment;	
	}
	

}
