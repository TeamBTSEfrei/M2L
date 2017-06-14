package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controller.ControlInscription;
import modele.SQLUtilisateur;
import modele.modeleUtilisateur;


public class Inscription extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	
	public Inscription(){
		
		
		Font font = new Font("SansSerif", Font.BOLD, 30);
		JPanel contenuFenêtre = new JPanel();
		contenuFenêtre.setSize(1920, 1080);
		GridLayout disposition = new GridLayout(9,3,30,15);
		contenuFenêtre.setLayout(disposition);
		JLabel nom = new JLabel("Nom* : ");
		JTextField entre1 = new JTextField(10);
		JLabel prenom = new JLabel("Prénom* : ");
		JTextField entre2 = new JTextField(10);
		JLabel email = new JLabel("Email* : (!Identifiant)");
		JTextField entre3 = new JTextField(10);
		JLabel Mot_de_passe = new JLabel("Mot de passe*");
		JTextField entre4 = new JTextField(10);
		JLabel Mot_de_passe1 = new JLabel("Valider le mot de passe* : ");
		JTextField entre5 = new JTextField(10);
		JLabel telephone = new JLabel("Téléphone : ");
		JTextField entre6 = new JTextField(10);
		JLabel adresse = new JLabel("Adresse : ");
		JTextField entre7 = new JTextField(10);
		JLabel mdpSuperUser = new JLabel("Mot de passe superUser (si non, tapez 'non') ");
		JTextField entre8 = new JTextField(10);
		
		entre1.setFont(font);
		nom.setFont (font);
		prenom.setFont (font);
		adresse.setFont (font);
		mdpSuperUser.setFont (font);
		email.setFont (font);
		telephone.setFont (font);
		Mot_de_passe.setFont (font);
		Mot_de_passe1.setFont (font);
		
		entre1.setFont(font);
		entre2.setFont(font);
		entre3.setFont(font);
		entre4.setFont(font);
		entre5.setFont(font);
		entre6.setFont(font);
		entre7.setFont(font);
		entre8.setFont(font);
			
		entre1.setDocument(new JTextFieldLimit(50));
		entre2.setDocument(new JTextFieldLimit(50));
		entre3.setDocument(new JTextFieldLimit(50));
		entre4.setDocument(new JTextFieldLimit(50));
		entre5.setDocument(new JTextFieldLimit(50));
		entre6.setDocument(new JTextFieldLimit(50));
		entre7.setDocument(new JTextFieldLimit(50));
		entre8.setDocument(new JTextFieldLimit(50));
		
		// Ajoute les contrôles au panneau			
		contenuFenêtre.add(nom);
		contenuFenêtre.add(entre1);
		contenuFenêtre.add(prenom);
		contenuFenêtre.add(entre2);
		contenuFenêtre.add(email);
		contenuFenêtre.add(entre3);
		contenuFenêtre.add(Mot_de_passe);
		contenuFenêtre.add(entre4);
		contenuFenêtre.add(Mot_de_passe1);
		contenuFenêtre.add(entre5);
		contenuFenêtre.add(adresse);
		contenuFenêtre.add(entre6);
		contenuFenêtre.add(telephone);
		contenuFenêtre.add(entre7);
		contenuFenêtre.add(mdpSuperUser);
		contenuFenêtre.add(entre8);

		
		JButton retour=new JButton();
		contenuFenêtre.add(retour);
		retour.setText("Retour");
		retour.setBounds(100, 1000, 50, 50);
    	retour.addActionListener(new ActionListener(){
 	    	public void actionPerformed(ActionEvent e){
 	    		Accueil accueil = new Accueil();
 	    		dispose();
 	    		}
    			});
		JButton valider=new JButton();
		contenuFenêtre.add(valider);
		valider.setText("valider");
		valider.setBounds(100, 1000, 50, 50);
		valider.addActionListener(new ActionListener(){
 	    	public void actionPerformed(ActionEvent e){
	    			String nom=entre1.getText();
	    			String prenom=entre2.getText();
	    			String email=entre3.getText();
	    			String adress=entre6.getText();
	    			String mdp=entre4.getText();
	    			String mdp1=entre5.getText();
	    			int tel=Integer.parseInt(entre7.getText());
	    			String SUSU=entre8.getText();

 	    		//System.out.print("s1:"+s1);
 	    		Validation valid=new Validation();
 	    		if(entre1.getText().isEmpty())
 	    		{
 	    			valid.Valid("ERREUR: Vous n'avez pas rempli tous les champs obligatoires");
 	    		}
 	    		else if(!(entre4.getText().equals(entre5.getText())))
 	    		{
 	    			valid.Valid("ERREUR: Votre mot de passe ne concorde pas ");
 	    			
 	    		}
 	    		else if(entre4.getText().isEmpty()||entre5.getText().isEmpty())
 	    		{
 	    			valid.Valid("ERREUR: veillez saisir votre mot de passe 2 fois ");
 	    		}
 	    		/*else if(s1!=null)
 	    		{
 	    		valid.Validation("Message informatif: Votre compte a été créé");	
 	    		
 	    		dispose();
 	    		}*/
 	    		else{

 	    			if(ControlInscription.validData(nom,prenom ,email ,mdp ,mdp1 ,adress,tel,SUSU))
 	    				{
 	    				int a=mainClass.compteUsers();
 	    				SQLUtilisateur utilisateur = new SQLUtilisateur();
 	    				utilisateur.setNum_user(a);
 	 	    			utilisateur.setNom(entre1.getText());
 	 		    		utilisateur.setPrenom(entre2.getText());
 	 		    		utilisateur.setEmail(entre3.getText());
 	 		    		utilisateur.setMdp(entre4.getText());
 	 		    		if(entre6.getText().isEmpty()){
 	 		    			utilisateur.setAdresse("Non renseigné");
 	 		    		}
 	 		    		
 	 		    		else{
 	 		    			utilisateur.setAdresse(entre6.getText());
 	 		    		}
 	 		    		if(entre7.getText().isEmpty()){
 	 		    			utilisateur.setTel(0000000000);
 	 		    		}
 	 		    		else{
 	 	 		    		utilisateur.setTel(Long.parseLong(entre7.getText()));
 	 		    		}
 	 		    		if(SUSU=="non"){
 	 		    			utilisateur.setSuperUser(false);
 	 		    		}
 	 		    		else if(SUSU.equals(mainClass.getSU())){
 	 		    			utilisateur.setSuperUser(true);
 	 		    		}
 	 		    		
 	 		    		mainClass.addUnUtilisateur(utilisateur);
 	 		    		mainClass.afficheUtilisateur();
 	 		    		valid.Valid("Votre compte a été enregistré.");
 	 	 	    		Accueil accueil = new Accueil();
 	 	 	    		dispose();
 	    				
 	    			}
 	    			
 	    			else
 	    			{
 	    				valid.Valid("Le compte n'est pas enregistré, "+ControlInscription.getMessage()+".");
 	    			}
 	    			
 	    		}
 	    		
 	    		
 	    		}
    			});
		this.add(contenuFenêtre);
		

		// Positionne les dimensions et rend la fenêtre visible
		this.setSize(1920, 1080);
		this.setVisible(true);

											}
	public static void main(String[] args) {
		Inscription inscri = new Inscription();
	
	}
	}

					