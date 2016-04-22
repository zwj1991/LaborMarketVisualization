package lmv.ui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooser {
//  public static void main(String args[]) {
//	  ColorChooser c = new ColorChooser();
//	  c.colorWindow();
//  }
  
  public String colorWindow(){
//	  JFrame f = new JFrame("JColorChooser Sample");
//	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    Container content = f.getContentPane();
//	    final JButton button = new JButton("Pick to Change Background");
	    
	   
//	        Color initialBackground = button.getBackground();
	        Color background = JColorChooser.showDialog(null,
	            "JColorChooser Sample", null);
	       
	        if (background != null) {
//	          button.setBackground(background);
	        	String hexValue = Integer.toHexString((background.getRGB())).replaceFirst("ff", "#");
	        	System.out.println(hexValue);
	        	return hexValue;
	        }
	        else 
	        	return null;
	      
//	    button.addActionListener(actionListener);
//	    content.add(button, BorderLayout.CENTER);
//	    f.setSize(300, 200);
//	    f.setVisible(true);
  }

}