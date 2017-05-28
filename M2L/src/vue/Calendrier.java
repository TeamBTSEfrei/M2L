package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import calendar.src.com.toedter.calendar.JCalendar;


public class Calendrier extends JPanel{
	public static java.util.Date date1;
	static SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	static java.sql.Date datesql =null;
	
	static java.sql.Date cal(JPanel b1, int x, int y) {
	    JButton valider = new JButton("choisir cette date");
	    JCalendar c = new JCalendar();
	    b1.add(c);
	    b1.add(valider);
	    valider.setBounds(x-250, y+110, 200, 150);
	    c.setBounds(x, y, 300, 100);
	    JLabel entrée1 = new JLabel("Date de reservation");
	    entrée1.setBounds(x-200, y-100, 300, 100);
	    b1.add(entrée1);
	    JTextField entrée2 = new JTextField("choisir une date ci-dessous");
	    entrée2.setBounds(x,y-100, 300, 100);
	    b1.add(entrée2);
	    valider.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){ 
		    	 
		    	 date1 = c.getCalendar().getTime();
		    	 Locale locale = Locale.getDefault();
		    	 String formatted = format1.format(date1.getTime());
		    	 DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		    	 entrée2.setText(dateFormat.format(date1));
		    	 Calendrier.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		     }
		    });
	    		
	    			
	    	    return datesql;
	    
		}
	public static void main(String[] args) {
		JFrame test=new JFrame();
		test.setTitle("Reservation de salle ");
		test.setSize(1920, 1080);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setLocationRelativeTo(null);
	    
		JPanel reservation1 = new JPanel();
		reservation1.setLayout(null);
		java.sql.Date date=Calendrier.cal(reservation1,700,700);
		System.out.println("la date reservé:"+date);
    	test.add(reservation1);
		test.setVisible(true);
	}

	}
	


