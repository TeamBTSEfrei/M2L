package modele;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class modeleBatiment {
	
public static ArrayList<SQLBatiment> select(){
		SQLBatiment batiment =new SQLBatiment();
		ArrayList<SQLBatiment> batimentL =new ArrayList<SQLBatiment>();
	    
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
	    	batimentL.add(batiment);
	      
	      // print the results
	    	
	    }
	    st.close();
	    rs.close();
	    BDDConnexion.conn.close();
	    
		} catch (Exception e) { 
		    System.err.println("Selection echouée: modeleBatiment "); 
		    System.err.println(e.getMessage()); 
		}
		return batimentL;
	}
	

}
