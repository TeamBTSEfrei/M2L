package vue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Building extends JFrame{

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Building(){
		
    this.setTitle("B�timents");
    this.setSize(1920, 1080);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    JPanel b1 = new JPanel();
    b1.setLayout(null);
    
    JButton bat_A = new JButton();
    
    b1.add(bat_A);
    bat_A.setText("B�timent A");
    bat_A.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_A.setBounds(720, 350, 400, 100);
    bat_A.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		new RDC_A().setVisible(true) ;
    		dispose();
            //other.myMethod();
    	}
    });
    
    JButton bat_B = new JButton();
    b1.add(bat_B);
    bat_B.setText("B�timent B");
    bat_B.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_B.setBounds(450, 50, 400, 300);
    bat_B.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		new RDC_B().setVisible(true);
    		dispose();
            //other.myMethod();
    	}
    });
    
    
    JButton bat_C = new JButton();
    b1.add(bat_C);
    bat_C.setText("B�timent C");
    bat_C.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_C.setBounds(80, 350, 370, 100);
    bat_C.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		new RDC_C().setVisible(true);
    		dispose();
            //other.myMethod();
    	}
    });
    
    
    JButton bat_D = new JButton();
    b1.add(bat_D);
    bat_D.setText("B�timent D");
    bat_D.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_D.setBounds(100, 50, 200, 300);
    bat_D.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		new RDC_D().setVisible(true);
    		dispose();
            //other.myMethod();
    	}
    });
    
    
    JButton bat_H = new JButton();
    b1.add(bat_H);
   
    bat_H.setText("Hall d'accueil");
    bat_H.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_H.setBounds(450, 350, 270, 100);
    
    
    JButton returne = new JButton();
    b1.add(returne);
    returne.setText("retour");
    returne.setBounds(100, 800, 100, 100);
    
    returne.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
     new Accueil().setVisible(true);
      dispose();
            //other.myMethod();
     }
    });

    
    bat_H.setBackground(Color.blue);
    
    this.getContentPane().add(b1);
    this.setVisible(true);
  }
}