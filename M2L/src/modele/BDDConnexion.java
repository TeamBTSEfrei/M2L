package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BDDConnexion {
	private static String url = "jdbc:mysql://localhost/m2l?autoReconnect=true&useSSL=false";
	private static String log ="root";
	private static String mdp ="root";
	
	public BDDConnexion(String url,String log,String mdp){
		
		
	};
	public static Connection conn ;
	public static void connexionBD()
	{
		//String myDriver = "com.mysql.jdbc.Driver";
	     
	    try {
	    	if(conn==null){
			 conn = DriverManager.getConnection(url,log,mdp);
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Connexion BDD echou�e");
			e.printStackTrace();
		} 

	}

/*	public static void  select(){
		 connexionBD();
		try { 
	    Statement st = conn.createStatement();
	    
	    String query = "SELECT * FROM utilisateur";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    
	    while (rs.next())
	    {
	      int num_user = rs.getInt("Num_User");
	      String nom = rs.getString("Nom_User");
	      String prenom = rs.getString("Prenom_User");
	      String adresse = rs.getString("Adresse");
	      String email = rs.getString("Email");
	      int tel = rs.getInt("Telephone");
	      
	      // print the results
	      System.out.format("%s, %s, %s, %s, %s, %s\n", num_user, nom, prenom, adresse, email, tel);
	    }
	    
	    //System.out.println(rs);
	    st.close();
	    rs.close();
	    conn.close();
	    
		} catch (Exception e) { 
		    System.err.println("Selection echou�e "); 
		    System.err.println(e.getMessage()); 
		}
			
		}
	*/
	
}

