package vue;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.controlConnexion;


public class Connexion extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	

	
	public Connexion(){
		
		
		Font font = new Font("SansSerif", Font.BOLD, 30);
		JPanel contenuFenêtre = new JPanel();
		contenuFenêtre.setSize(1920, 1080);
		GridLayout disposition = new GridLayout(3,2,30,15);
		contenuFenêtre.setLayout(disposition);
		JLabel email = new JLabel("Email : ");
		JTextField entre_email = new JTextField(10);
		JLabel mdp = new JLabel("Mot de passe : ");
		JTextField entre_mdp = new JTextField(10);
		
		email.setFont(font);
		mdp.setFont (font);
		
		entre_email.setFont(font);
		entre_mdp.setFont(font);

		// Ajoute les contrôles au panneau			
		contenuFenêtre.add(email);
		contenuFenêtre.add(entre_email);
		contenuFenêtre.add(mdp);
		contenuFenêtre.add(entre_mdp);
		
		JButton retour=new JButton();
		contenuFenêtre.add(retour);
		retour.setText("Retour");
		retour.setFont(font);
		retour.setBounds(100, 1000, 50, 50);
    	retour.addActionListener(new ActionListener(){
 	    	public void actionPerformed(ActionEvent e){
 	    		new Accueil().setVisible(true);
 	    		dispose();
 	    		}
    			});
		JButton valider=new JButton();
		contenuFenêtre.add(valider);
		valider.setText("valider");
		valider.setFont(font);
		valider.setBounds(100, 1000, 50, 50);
		valider.addActionListener(new ActionListener(){
 	    	public void actionPerformed(ActionEvent e){

 	    	controlConnexion.validUser(mainClass.getTousLesAbonnes(),entre_email.getText(), entre_mdp.getText());
 	    	}
 	    });
    	

		this.setContentPane(contenuFenêtre);

		// Positionne les dimensions et rend la fenêtre visible
		this.setSize(1200, 400);
		this.setVisible(true);

											}

	public static void main(String[] args){
		
	new Connexion().setVisible(true);
		
		
	}
}