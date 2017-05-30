package vue;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;


public class Validation{

     public static void Validation(String message){

 

    ImageIcon img = new ImageIcon("images/information.png");

    JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE, img);      

  
     }
}       