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


public final class Connexion extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	

	
	public Connexion(){
		
		
		Font font = new Font("SansSerif", Font.BOLD, 30);
		JPanel contenuFenętre = new JPanel();
		contenuFenętre.setSize(1920, 1080);
		GridLayout disposition = new GridLayout(3,2,30,15);
		contenuFenętre.setLayout(disposition);
		JLabel email = new JLabel("Email : ");
		JTextField entre_email = new JTextField(10);
		JLabel mdp = new JLabel("Mot de passe : ");
		JTextField entre_mdp = new JTextField(10);
		
		email.setFont(font);
		mdp.setFont (font);
		
		entre_email.setFont(font);
		entre_mdp.setFont(font);

		// Ajoute les contrôles au panneau			
		contenuFenętre.add(email);
		contenuFenętre.add(entre_email);
		contenuFenętre.add(mdp);
		contenuFenętre.add(entre_mdp);
		
		JButton retour=new JButton();
		contenuFenętre.add(retour);
		retour.setText("Retour");
		retour.setFont(font);
		retour.setBounds(100, 1000, 50, 50);
    	retour.addActionListener(new ActionListener(){
 	    	public void actionPerformed(ActionEvent e){
 	    		dispose();
 	    		}
    			});
		JButton valider=new JButton();
		contenuFenętre.add(valider);
		valider.setText("valider");
		valider.setFont(font);
		valider.setBounds(100, 1000, 50, 50);
		valider.addActionListener(new ActionListener(){
 	    	public void actionPerformed(ActionEvent e){
 	    	
 	    	controlConnexion.validUser(mainClass.getTousLesAbonnes(),entre_email.getText(), entre_mdp.getText());
 	    	
 	    	}
 	    });
		if(Accueil.isConnect()){
			dispose();
		}
		

		this.setContentPane(contenuFenętre);

		// Positionne les dimensions et rend la fenętre visible
		this.setSize(1200, 400);
		
		this.setVisible(true);

											}

	public static void main(String[] args){
		
	new Connexion().setVisible(true);
		
		
	}
}