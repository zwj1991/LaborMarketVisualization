/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmv.ui;

//importing external packages
import lmv.backend.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

/**
 *
 * @author apurvai
 */
public class Labor_Market_Visualization extends JFrame {
	static String minColor ;
	static String midColor ;
	static String maxColor ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
       final JFrame frame = new JFrame("Prototype Labor Market UI");

        //frame closing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add components - slider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 20);
         // Putting labels for slider
        Hashtable labelTable = new Hashtable();
        labelTable.put( new Integer( 0 ), new JLabel("1995") );
        labelTable.put( new Integer( 50 ), new JLabel("2016") );
        slider.setLabelTable( labelTable );
        slider.setPaintLabels(true);
        
        JButton printScreen = new JButton("Print Screen");
        JButton loadMap  = new JButton("Load Map");
        JLabel sliderLabel = new JLabel("Range of years: ");
        sliderLabel.setForeground(Color.BLUE);
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(sliderLabel);
        topPanel.add(slider);
        topPanel.add(loadMap);
        topPanel.add(printScreen);
        
        
        // add checkboxes 
        JCheckBox unEmployment  = new JCheckBox("Unemployment");
        unEmployment.setSelected(true);
        JCheckBox newHire = new JCheckBox("New Hire");
        newHire.setSelected(true);
        // creating panel for checkboxes and adding checkboxex to it
        JPanel jplCheckBox = new JPanel();
        
        // creating Save and Rest buttons for storing and resetting labor conditions
        JButton conditionSave = new JButton("Save");
        JButton conditionReset = new JButton("Reset");
        // creating panel to handle Labor condition Buttons 
        JPanel conditionButtons = new JPanel();
        conditionButtons.setLayout(new FlowLayout());
        conditionButtons.add(conditionSave);
        conditionButtons.add(conditionReset);
        
        jplCheckBox.setLayout(new GridLayout(0, 1));  //0 rows, 1 Column
        JLabel laborConditions = new JLabel("Labor Conditions:");
        laborConditions.setForeground(Color.BLUE);
        jplCheckBox.add(laborConditions);  // adding label for labor condition
        jplCheckBox.add(unEmployment); // adding chekbox
        jplCheckBox.add(newHire);      // adding checkbox
        jplCheckBox.add(conditionButtons); // adding Save and Reset button panel
        
               
        // creating panel to handle colorscheme condition Buttons 
        JPanel colorOption = new JPanel();
        colorOption.setLayout(new FlowLayout());
        final JButton maxColorButton = new JButton("Choose Max Color");
        final JButton minColorButton = new JButton("Choose Min Color");
        final JButton midColorButton = new JButton("Choose Midium Color");
        // adding three color option buttons to panel
        colorOption.add(minColorButton);
        colorOption.add(midColorButton);
        colorOption.add(maxColorButton);
        //adding Save and Rset Buttons to panel
        JPanel colorSchemeButtons = new JPanel();
        colorSchemeButtons.setLayout(new FlowLayout());
        JButton colorSchemeSave = new JButton("Save");
        JButton colorSchemeReset = new JButton("Reset");
        colorSchemeButtons.add(colorSchemeSave);
        colorSchemeButtons.add(colorSchemeReset);
        // creating panel for color scheme--Menu List
        String listData[] ={" Continuous","Black & white "," 3-colored"};
        //JComboBox colorList = new JComboBox(listData);
        JPanel colorSchemePanel = new JPanel(); //creating panel for colorscheme
        colorSchemePanel.setLayout(new GridLayout(0,1));
        JLabel colorSchemeLabel = new JLabel("Choose Color Scheme:");
        colorSchemeLabel.setForeground(Color.BLUE);
        colorSchemePanel.add(colorSchemeLabel); // adding Label for color scheme
        //colorSchemePanel.add(colorList,BorderLayout.CENTER);  // adding list of options to panel
        colorSchemePanel.add(colorOption);//adding 3 color options
        colorSchemePanel.add(colorSchemeButtons); // adding Save and Rset for color buttons to panel
                
        // combining labor condition and color scheme in one panel
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new FlowLayout());
        optionsPanel.add(jplCheckBox);
        optionsPanel.add(colorSchemePanel);
        
        
        
        
        // adding map panel
        	///ImageIcon map = new ImageIcon("src/US_Map.png");
        	///JLabel mapLabel = new JLabel(map);
        
        // just testing panel existence 
        	///mapPanel.setBackground(Color.red);
          
      
        // Size the frame.
		//frame.add(webBrowserPanel, BorderLayout.CENTER);
        frame.setSize(800, 400);
        frame.setLayout(new GridLayout(3,1));
        
        frame.add(topPanel);
        frame.add(optionsPanel);// adding color scheme apnel to frame
        
        
        
        //Show frame
        frame.setVisible(true);
        
        // adding events to buttons
        
        //Action Listener for Load Map button
        
        loadMap.addActionListener(new ActionListener() {  // Load Map Action Listener
        	public void actionPerformed(ActionEvent e)
            {
                //Execute when  "Load Map" button is clicked
                System.out.println("You clicked Load Map button");
               /* ReadFile.readData("file.csv");
        		ReadFile.readBaseTable("base.xls");
        		JsFile jsf = new JsFile();
        		try {
        			jsf.outputJs("2006", "Unemployment Rate");
        		} catch (IOException ie) {
        			// TODO Auto-generated catch block
        			ie.printStackTrace();
        		}*/
              //EagleBrowser eBrowser = new EagleBrowser();
              //eBrowser.loadBrowser();
                Thread t = new Thread(new Runnable(){

					public void run() {
						// TODO Auto-generated method stub
						Map m = new Map();
		                m.showMap();
		                
		                
					}
                	
                });
                t.setPriority(10);
                t.start();
                
            }
        });  
        
        //Adding Action Listener for Print Screen
        printScreen.addActionListener(new ActionListener() {  // Load Map Action Listener
        	public void actionPerformed(ActionEvent e)
            {
                //Execute when  "Print Screen" button is clicked
                System.out.println("Clicked Print Screen..");
                frame.setSize(400,200);
                MouseScreenShot screenShot = new MouseScreenShot();
				screenShot.captureScreen();
                
            }
        });  
        
      //Adding Listener to all color buttons
      
        //Adding listener to mincolorbutton
        
        minColorButton.addActionListener(new ActionListener() {  // Load Map Action Listener
        	public void actionPerformed(ActionEvent e)
            {
                System.out.println("Selected Min Color Button");
                ColorChooser c = new ColorChooser();
          	    minColor =c.colorWindow();
          	    minColorButton.setBackground(Color.decode(minColor));
          	    
            }
        });
        
        
        //Adding listener to midcolorbutton
        
        midColorButton.addActionListener(new ActionListener() {  // Load Map Action Listener
        	public void actionPerformed(ActionEvent e)
            {
                System.out.println("Selected Mid Color Button");
                ColorChooser c = new ColorChooser();
          	    midColor =c.colorWindow();
          	    midColorButton.setBackground(Color.decode(midColor));
            }
        });  
        
        //Adding listener to midcolorbutton
        
        maxColorButton.addActionListener(new ActionListener() {  // Load Map Action Listener
        	public void actionPerformed(ActionEvent e)
            {
                System.out.println("Selected Max Color Button");
                ColorChooser c = new ColorChooser();
          	    maxColor =c.colorWindow();
          	    maxColorButton.setBackground(Color.decode(maxColor));
            }
        }); 
        
        colorSchemeSave.addActionListener(new ActionListener() {  // Load Map Action Listener
        	public void actionPerformed(ActionEvent e)
            {
                System.out.println("User Selected Following colors:: ");
                System.out.println("Min::  "+ minColor + " Mid:: "+ midColor + "Max:: "+ maxColor);
                JsFile jsf = new JsFile();
                StringBuilder sb = new StringBuilder();
                sb.append("options['colors'] = ['");
                sb.append(minColor+"','");
                sb.append(midColor+"','");
                sb.append(maxColor+"'];");
//                System.out.println(sb.toString());
                try {
					jsf.outputFile("option.js", sb.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        }); 
    }

		
    
}
