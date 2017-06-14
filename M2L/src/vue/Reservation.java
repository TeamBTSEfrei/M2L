package vue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import calendar.src.com.toedter.calendar.JCalendar;

import modele.SQLSalle;
import modele.SQLUtilisateur;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.Date;
import java.util.Locale;
public class Reservation extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String dateString=new String();
	static java.util.Date dateUtil=new java.util.Date();
	static java.sql.Date dateSQL;
	static SQLSalle cetteSalle = new SQLSalle();
	public Reservation(int salle){
	
	
	ArrayList<SQLSalle> listSalle=new ArrayList<SQLSalle>();
	listSalle.addAll(SQLSalle.placeSalle());

	cetteSalle=SQLSalle.TrouveSalle(listSalle,salle);
	SQLSalle.afficheSalle(cetteSalle);
	SQLUtilisateur userConnected = mainClass.getUserConnected();
		

	String nom_salle = cetteSalle.getNom_salle();
	int taille_salle= cetteSalle.getPlaces();
	String localisation_salle= new String("Batiment A");
	String materiel_salle= new String("Rétroprojecteur, Tableau à feutre , 20 Tables ,30 chaises ");
	
	
	
	
	
    this.setTitle("Reservation de la "+nom_salle);
    this.setSize(1920, 1080);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
	JPanel reservation1 = new JPanel();
	reservation1.setLayout(null);
	
	JLabel titre = new JLabel("Reservation de la salle "+nom_salle);
	titre.setBounds(500, 0, 1000, 50);
	Font font = new Font("SansSerif", Font.BOLD, 40);
	titre.setFont(font);
	JLabel loca = new JLabel("Localisation: "+localisation_salle);
	loca.setBounds(200, 200, 1000, 50);
	JLabel taille = new JLabel("taille de la salle: "+taille_salle);
	taille.setBounds(200, 300, 1000, 50);
	JLabel materiel = new JLabel("Materiel disponible: "+materiel_salle);
	materiel.setBounds(200, 400, 1000, 50);
	JLabel id = new JLabel("N° "+userConnected.getNum_user());
	id.setBounds(200, 100, 1000, 50);
	JLabel utilisateur = new JLabel("Utilisateur: "+userConnected.getNom()+" "+userConnected.getPrenom());
	utilisateur.setBounds(400, 100, 1000, 50);
	
	reservation1.add(utilisateur);
	reservation1.add(id);
	reservation1.add(titre);
	reservation1.add(loca);
	reservation1.add(taille);
	reservation1.add(materiel);
    JButton returne = new JButton();
    JButton valider = new JButton("choisir cette date");
    JButton selection = new JButton("Valider la réservation");
    
    selection.setBounds(1100, 810, 200, 150);
    reservation1.add(selection);
    valider.setBounds(450, 810, 200, 150);
    reservation1.add(valider);
    reservation1.add(returne);
    returne.setText("retour");
    returne.setBounds(100, 850, 100, 100);
    JCalendar c = new JCalendar();
    c.setBounds(700, 700, 300, 300);
    reservation1.add(c);
    
    JLabel entrée1 = new JLabel("Date de reservation");
    entrée1.setBounds(500, 600, 300, 100);
    reservation1.add(entrée1);
    JTextField entrée2 = new JTextField("choisir une date ci-dessous");
    entrée2.setBounds(700, 600, 300, 100);
    reservation1.add(entrée2);
    valider.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent e){ 
	    	 SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	    	 Date date = c.getCalendar().getTime();
	    	 Locale locale = Locale.getDefault();
	    	 String formatted = format1.format(date.getTime());
	    	 DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
	    	 entrée2.setText(dateFormat.format(date)); 
	    	 System.out.print(formatted);
	    	 dateString=formatted;
	    	 dateUtil=date;
	    	 dateSQL= java.sql.Date.valueOf(formatted);
	            //other.myMethod();
	    	 
	     }
	    });
    
    selection.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent e){ 
	    	 System.out.println("");
	    	 System.out.println("");
	    	 SQLUtilisateur.SQLutilisateurShow(userConnected);
	    	 SQLSalle.afficheSalle(cetteSalle);
	    	 System.out.println("date SQL: "+dateSQL);
	     }
	    });
    
    
    
    returne.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent e){ 
	     new Building().setVisible(true);
	     dispose();
	            //other.myMethod();
	     }
	    });
    this.getContentPane().add(reservation1);
    
    this.setVisible(true);
	}
	public static void main(String[] args){

		   
		new Reservation(101).setVisible(true);
	      
	   }
	
}
