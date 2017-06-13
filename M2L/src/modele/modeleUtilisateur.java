package modele;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import vue.mainClass;


public class modeleUtilisateur {
	
	public static void main(String[] args){
		
		ArrayList<SQLUtilisateur> tousLesAbonnes = select(mainClass.getTousLesAbonnes());
			System.out.println("|Numéro Utilisateur   |    Nom   |    Prenom    |               Address            |    Email     |     Telephone    |     Mdp    |    SuperUser   |"); 
			for(SQLUtilisateur abonne :tousLesAbonnes)
			{
				System.out.println("|   "+abonne.getNum_user() +"  |  "+abonne.getNom()+"  |  "+abonne.getPrenom()+"  |  "+abonne.getAdresse()+"  |  "+abonne.getEmail()+"  |  "+abonne.getTel()+"  |  "+abonne.getMdp());
				
				
				
			}
	}
	
	static int i=0;
	
	
	public static ArrayList<SQLUtilisateur> select(ArrayList<SQLUtilisateur> listDAbonnes){

		BDDConnexion.connexionBD();
		try { 
	    Statement st = BDDConnexion.conn.createStatement();
	    
	    String query = "SELECT * FROM utilisateur WHERE mdp='admin'";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    

	    while (rs.next())
	    {
	    	SQLUtilisateur user=new SQLUtilisateur();
	    			user.setNum_user(rs.getInt("Num_User"));
	    			user.setNom(rs.getString("Nom_User"));
	    			user.setPrenom(rs.getString("Prenom_User"));
	    			user.setAdresse(rs.getString("Adresse"));
	    			user.setEmail(rs.getString("Email"));
	    			user.setTel(rs.getInt("Telephone"));
	    			user.setMdp(rs.getString("Mdp"));
	    			user.setSuperUser(rs.getBoolean("SuperUser"));
	    			listDAbonnes.add(user);
	      ;
	    }
	    st.close();
	    rs.close();
	    BDDConnexion.conn.close();
		} catch (Exception e) { 
		    System.err.println("Selection echouée "); 
		    System.err.println(e.getMessage()); 
		}
		return listDAbonnes;
			
	}
	
	public static void insert_user(SQLUtilisateur user){
		
		BDDConnexion.connexionBD();
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
