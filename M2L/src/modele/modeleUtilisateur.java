package modele;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;


public class modeleUtilisateur {
	
	public static void main(String[] args){
			select();
	}
	
	static int i=0;
	
	
	public static SQLUtilisateur select(){
		
		SQLUtilisateur user = new SQLUtilisateur();
	    
		BDDConnexion.connexionBD();
		try { 
	    Statement st = BDDConnexion.conn.createStatement();
	    
	    String query = "SELECT * FROM utilisateur WHERE mdp='admin'";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    

	    while (rs.next())
	    {
	    	
	    	user.setNum_user(rs.getInt("Num_User"));
	    	user.setNom(rs.getString("Nom_User"));
	    	user.setPrenom(rs.getString("Prenom_User"));
	    	user.setAdresse(rs.getString("Adresse"));
	    	user.setEmail(rs.getString("Email"));
	    	user.setTel(rs.getInt("Telephone"));
	    	user.setMdp(rs.getString("Mdp"));
	      
	      // print the results
	      System.out.println(
	    		  "Num_User " + user.getNum_user() + 
	    		  ", Nom " + user.getNom() +
	    		  ", Prenom " + user.getPrenom() +
	    		  ", Address " + user.getAdresse() + 
	      		  " ,Email " + user.getEmail() +
	      		  " ,Telephone " + user.getTel() +
	      		  " ,Mdp " + user.getMdp()
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
		return user;
			
	}
	
	public static void insert_user(){
		BDDConnexion.connexionBD();
		SQLUtilisateur user = new SQLUtilisateur();
		try { 
		//	String myDriver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost/m2l?autoReconnect=true&useSSL=false"; 
            Connection conn = (Connection) DriverManager.getConnection(url,"root","root"); 
            Statement st = conn.createStatement();
            
            String SQL = "INSERT INTO utilisateur(`Num_User`,`Nom_User`,`Prenom_User`,`Adresse`,`Telephone`,`Email`,`Mdp`)"
            		+ "VALUES ( 4"
            		+ ",'" +user.getNom()
            		+ "','" +user.getPrenom()
            		+ "','" +user.getAdresse()
            		+ "'," +user.getTel()
            		+ ",'" +user.getEmail()
            		+ "','" +user.getMdp()
            		+"')";
            st.executeUpdate( SQL );
            conn.close();
        } catch (Exception error) { 
            System.err.println("Got an exception! "); 
            System.err.println(error.getMessage()); 
        }
		
	}

}
