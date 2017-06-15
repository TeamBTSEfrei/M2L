package vue;

import javax.swing.*;


import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
 
public class monCompte extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static boolean datechanger = false;
	public int rese=3;
	static java.sql.Date date=null;
	protected static final SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
	Validation valid=new Validation();
	public monCompte() {
		
		Font font = new Font("SansSerif", Font.BOLD, 30);
		JPanel contenuFenêtre = new JPanel();
		contenuFenêtre.setSize(1920, 1080);
		GridLayout disposition = new GridLayout(9,3,30,15);
		contenuFenêtre.setLayout(disposition);
		JLabel nom = new JLabel("Nom* : ");
		JTextField nomUser = new JTextField(10);
		JLabel prenom = new JLabel("Prénom* : ");
		JTextField prenomUser = new JTextField(10);
		JLabel email = new JLabel("Email* : (!Identifiant)");
		JTextField emailUser = new JTextField(10);
		JLabel Mot_de_passe = new JLabel("Mot de passe*");
		JPasswordField password = new JPasswordField(10);
		
		JPasswordField password1 = new JPasswordField(10);
		JTextField adresseUser = new JTextField(10);
		JLabel telephone = new JLabel("Téléphone : ");
		JTextField telephoneUser = new JTextField(10);
		JLabel adresse = new JLabel("Adresse : ");
		JLabel mdpSuperUser = new JLabel("Mot de passe superUser (si non, tapez 'non') ");
		JPasswordField pswdSUUser = new JPasswordField(10);
		
		
		
		nomUser.setFont(font);
		nom.setFont (font);
		prenom.setFont (font);
		adresse.setFont (font);
		mdpSuperUser.setFont (font);
		email.setFont (font);
		telephone.setFont (font);
		Mot_de_passe.setFont (font);
		
		
		nomUser.setFont(font);
		prenomUser.setFont(font);
		emailUser.setFont(font);
		password.setFont(font);
		password1.setFont(font);
		adresseUser.setFont(font);
		telephoneUser.setFont(font);
		pswdSUUser.setFont(font);
		
			
		nomUser.setDocument(new JTextFieldLimit(50));
		prenomUser.setDocument(new JTextFieldLimit(50));
		emailUser.setDocument(new JTextFieldLimit(50));
		password.setDocument(new JTextFieldLimit(50));
		password1.setDocument(new JTextFieldLimit(50));
		adresseUser.setDocument(new JTextFieldLimit(50));
		telephoneUser.setDocument(new JTextFieldLimit(50));
		pswdSUUser.setDocument(new JTextFieldLimit(50));
		
		
		// Ajoute les contrôles au panneau			
		contenuFenêtre.add(nom);
		contenuFenêtre.add(nomUser);
		contenuFenêtre.add(prenom);
		contenuFenêtre.add(prenomUser);
		contenuFenêtre.add(email);
		contenuFenêtre.add(emailUser);
		contenuFenêtre.add(Mot_de_passe);
		contenuFenêtre.add(password);
		contenuFenêtre.add(password1);
		contenuFenêtre.add(adresseUser);
		contenuFenêtre.add(adresse);
		contenuFenêtre.add(telephoneUser);
		contenuFenêtre.add(telephone);
		contenuFenêtre.add(pswdSUUser);
		contenuFenêtre.add(mdpSuperUser);
		
		nomUser.setText(mainClass.getUserConnected().getNom());
		prenomUser.setText(mainClass.getUserConnected().getPrenom());
		emailUser.setText(mainClass.getUserConnected().getEmail());
		password.setText(mainClass.getUserConnected().getMdp());
		password1.setText(mainClass.getUserConnected().getMdp());
		adresseUser.setText(mainClass.getUserConnected().getAdresse());
		telephoneUser.setText(""+mainClass.getUserConnected().getTel());
		if(mainClass.getUserConnected().isSuperUser())
		{
			pswdSUUser.setText(mainClass.getSU());
		}else
		{
			pswdSUUser.setText("non");
		}
		
	    this.setContentPane(contenuFenêtre);
		this.setSize(1920, 1080);
		this.setVisible(true);
		
		
		
	}
	public static void main(String[] args){
	
	new monCompte().setVisible(true);
	}
}
		/*
		Font font_button = new Font("Arial", Font.PLAIN, 35);
	    Font font_title = new Font("Arial", Font.PLAIN, 20);
	    this.setTitle("Mofifier/Annuler une reservation");
	    this.setSize(1920, 1080);
//	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//    this.setLocationRelativeTo(null);
	    JPanel b1= new JPanel();	    
	    
	    String reserva=("Réservation n°"+rese+" : ");
	    JLabel Reservation = new JLabel(reserva);
	    JLabel nom1 = new JLabel("Nom : ");
	    JLabel prenom1 = new JLabel("Prenom : ");
	    JLabel  batiment1= new JLabel("Batiment : ");
	    JLabel salle1 = new JLabel("Salle : ");
	    JLabel Date1 = new JLabel("Date de réservation : ");
	    JLabel Option = new JLabel("Option:");
	    date=Calendrier.cal(b1,900,700);
	    b1.setLayout(null);
	    b1.add(Reservation);
	    b1.add(nom1);
	    b1.add(prenom1);
	    b1.add(batiment1);
	    b1.add(salle1);
	    b1.add(Date1);
	    b1.add(Option);  
	    
	    JTextField nom = new JTextField(10);
	    JTextField prenom = new JTextField(10);
	    JTextField batiment = new JTextField(10);
	    JTextField salle = new JTextField(10);
	    JTextField dateReservation = new JTextField(10);
	    JTextField verif = new JTextField(10);
	    
	    nom.setFont(font_title);
	    prenom.setFont(font_title);
	    batiment.setFont(font_title);
	    salle.setFont(font_title);
	    dateReservation.setFont(font_title);    
	    verif.setFont(font_title);
	    
	    nom.setDocument(new JTextFieldLimit(50));
	    prenom.setDocument(new JTextFieldLimit(50));
	    batiment.setDocument(new JTextFieldLimit(50));
	    salle.setDocument(new JTextFieldLimit(50));
	    dateReservation.setDocument(new JTextFieldLimit(50));	    
	    verif.setDocument(new JTextFieldLimit(50));
	    
	    b1.add(nom);
	    b1.add(prenom);
	    b1.add(batiment);
	    b1.add(salle);
	    b1.add(dateReservation);    
	    b1.add(verif);
	    
	    JButton modifier = new JButton("modifier");
	    JButton quitter= new JButton("quitter");
	    JButton annuler= new JButton("annuler");
	    JButton retour= new JButton("retour");
	    
	    modifier.setFont(font_button);
	    quitter.setFont(font_button);
	    annuler.setFont(font_button);
	    retour.setFont(font_button);
	    
	    
	    b1.add(modifier);
	    b1.add(quitter);
	    b1.add(annuler);
	    b1.add(retour);
	    
	    Reservation.setBounds(300, 50, 200, 50);
	    nom1.setBounds(50, 250, 200, 50);
	    prenom1.setBounds(50, 350, 200, 50);
	    batiment1.setBounds(50, 450, 200, 50);
	    salle1.setBounds(50, 550, 200, 50);
	    Date1.setBounds(50, 650, 200, 50);
	    
	    nom.setBounds(300, 250, 200, 50);
	    prenom.setBounds(300, 350, 200, 50);
	    batiment.setBounds(300, 450, 200, 50);
	    salle.setBounds(300, 550, 200, 50);
	    dateReservation.setBounds(300, 650, 200, 50);
	    
	    modifier.setBounds(100, 800, 200, 50);
	    quitter.setBounds(300, 900, 200, 50);
	    annuler.setBounds(300, 800, 200, 50);
	    retour.setBounds(100, 900, 200, 50);
	    
	    nom.setText(reserv.getNomUser());
	    prenom.setText(reserv.getPrenomUser());
	    batiment.setText(reserv.getNomBatiment());
	    salle.setText(reserv.getNomSalle());
	    dateReservation.setText(reserv.getTxtDate());
	    
	    
	    modifier.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){
		    	 DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		    	 String text = df.format(date);
		    	 dateReservation.setText(text);
		    	 reserv.setDate(date);
		    	 reserv.setNomBatiment(batiment.getText());
		    	 reserv.setNomSalle(salle.getText());
		    	 reserv.setDate(date);

		    	 String a=new String();
		    	 a=("vos nouvelles information:\n Batiment :"+reserv.getNomBatiment()+"\nSalle: "+reserv.getNomSalle()+"\nDate de réservation:"+dateReservation.getText());
		    	 reserv.getDate();
		    	 System.out.println(a);
		    	 valid.Valid("Vos modifications ont ete pris en compte");
		    	 Accueil acc= new Accueil();
		    	 dispose();
		     }
		    });
	    
	    annuler.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){
		    	 dispose();
		    
		     }
		    });
	    quitter.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){
		    	 dispose();
		    
		     }
		    });
	    retour.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){
		    	 Accueil acc=new Accueil();
		    	 dispose();
		     }
		    });
	    
	    
	    JScrollPane _ScrollPane = new JScrollPane(b1);
	    
        this.add(_ScrollPane, BorderLayout.CENTER);
        
        this.setPreferredSize(new Dimension(800,600));
        this.pack(); 

		
	    this.setContentPane(b1);
		this.setSize(1920, 1080);
		this.setVisible(true);
	}
	  public static void main(String[] args){
		  
		  SQLReservation reserv=new SQLReservation();
		  reserv.setNum_res(1);
		  reserv.setNum_user(1);
		  reserv.setNum_bat(1);
		  reserv.setEtage(1);
		  reserv.setNum_salle(1);
		  reserv.setNomUser("Boufkhed");
		  reserv.setPrenomUser("Saïd");
		  reserv.setNomSalle("Galilée");
		  reserv.setNomBatiment("A");
		  reserv.setDate(java.sql.Date.valueOf("2017-06-18"));
		  monCompte compte=new monCompte(reserv);
		 
*/
		  
	