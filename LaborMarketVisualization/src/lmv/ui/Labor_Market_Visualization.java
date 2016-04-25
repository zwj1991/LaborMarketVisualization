/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmv.ui;

//importing external packages
import lmv.backend.*;
import javax.swing.JFileChooser;

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
	static String selectedYear;
	static String selectedVariable;
	private static  JComboBox listOfYears ;
	private static JComboBox listOfVariables;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
       final JFrame frame = new JFrame("Prototype Labor Market UI");

        //frame closing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add components - slider
//        final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 20);
//         // Putting labels for slider
//        Hashtable labelTable = new Hashtable();
//        labelTable.put( new Integer( 0 ), new JLabel("1995") );
//        labelTable.put( new Integer( 50 ), new JLabel("2016") );
//        slider.setLabelTable( labelTable );
//        slider.setPaintLabels(true);
//        
        //JButton printScreen = new JButton("Print Screen");
        JButton loadMap  = new JButton("Load Map");
        JButton loadFile = new JButton("Load File");
        
        final JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        
        //topPanel.add(slider);
        topPanel.add(loadMap);
        //topPanel.add(printScreen);
        topPanel.add(loadFile);
        
        
        // add checkboxes 
//        JCheckBox unEmployment  = new JCheckBox("Unemployment");
//        unEmployment.setSelected(true);
//        JCheckBox newHire = new JCheckBox("New Hire");
//        newHire.setSelected(true);
        // creating panel for checkboxes and adding checkboxex to it
//        JPanel jplCheckBox = new JPanel();
        
        // creating Save and Rest buttons for storing and resetting labor conditions
//        JButton conditionSave = new JButton("Save");
//        JButton conditionReset = new JButton("Reset");
        // creating panel to handle Labor condition Buttons 
//        JPanel conditionButtons = new JPanel();
//        conditionButtons.setLayout(new FlowLayout());
//        conditionButtons.add(conditionSave);
//        conditionButtons.add(conditionReset);
//        
//        jplCheckBox.setLayout(new GridLayout(0, 1));  //0 rows, 1 Column
//        JLabel laborConditions = new JLabel("Labor Conditions:");
//        laborConditions.setForeground(Color.BLUE);
//        jplCheckBox.add(laborConditions);  // adding label for labor condition
//        jplCheckBox.add(unEmployment); // adding chekbox
//        jplCheckBox.add(newHire);      // adding checkbox
//        jplCheckBox.add(conditionButtons); // adding Save and Reset button panel
//        
               
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
        //String listData[] ={" Continuous","Black & white "," 3-colored"};
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
        final JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new FlowLayout());
        //optionsPanel.add(jplCheckBox);
        optionsPanel.add(colorSchemePanel);
        
        
        
        
        // adding map panel
        	///ImageIcon map = new ImageIcon("src/US_Map.png");
        	///JLabel mapLabel = new JLabel(map);
        
        // just testing panel existence 
        	///mapPanel.setBackground(Color.red);
          
      
        // Size the frame.
		//frame.add(webBrowserPanel, BorderLayout.CENTER);
        frame.setSize(1000, 800);
        frame.setLayout(new GridLayout(3,1));
        frame.add(topPanel);
        frame.add(optionsPanel);// adding color scheme apnel to frame
        
        ReadFile.readBaseTable("base.xls");
        
        //Show frame
        frame.setVisible(true);
        
        // adding events to buttons
        
        // Action Listener for Load File button
        loadFile.addActionListener(new ActionListener() {  // Load Map Action Listener
        	public void actionPerformed(ActionEvent e)
            {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("."));
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                chooser.showOpenDialog(null);
                File selectedPfile = chooser.getSelectedFile();
                System.out.println("Selected File is :: "+selectedPfile);
                ReadFile.readData(selectedPfile); //Reading file
                // System.out.println(ReadFile.getYears().get(0));
                // Populating No.of Years based on User selected File
                listOfYears= new JComboBox(ReadFile.getYears().toArray());
                JLabel labelYear = new JLabel("List of Years: ");
                labelYear.setForeground(Color.BLUE);
                topPanel.add(labelYear);
                topPanel.add(listOfYears);
                
                
                //Populating No.of Variables based on User selecte File
                System.out.println(ReadFile.getVars());
                listOfVariables=new JComboBox(ReadFile.getVars().toArray());
                JLabel labelVar = new JLabel("List of Variables: ");
                labelVar.setForeground(Color.BLUE);
                optionsPanel.add(labelVar);
                optionsPanel.add(listOfVariables);
                
                Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = ((int) tk.getScreenSize().getWidth());
                int ySize = ((int) tk.getScreenSize().getHeight());
                frame.setSize(xSize,ySize);
                
                
                
            }
        });  
        
        //Action Listener for Load Map button
//        final Rectangle r ;
        loadMap.addActionListener(new ActionListener() {  // Load Map Action Listener
        	public void actionPerformed(ActionEvent e)
            {
                //Execute when  "Load Map" button is clicked
                System.out.println("You clicked Load Map button");
                frame.setSize(400,300);
                if(listOfVariables != null && listOfYears != null){
                    selectedYear= (String) listOfYears.getSelectedItem();
                    selectedVariable = (String) listOfVariables.getSelectedItem();
                }
                System.out.println("Selected Items:: "+ selectedYear + " , " + selectedVariable );
        		JsFile jsf = new JsFile();
        		try {
//        			jsf.outputJs("2006", "Unemployment Rate");
        			if(selectedYear != null && selectedVariable != null)
        				jsf.outputJs(selectedYear,selectedVariable);
        		} catch (IOException ie) {
        			// TODO Auto-generated catch block
        			ie.printStackTrace();
        		}
              //EagleBrowser eBrowser = new EagleBrowser();
              //eBrowser.loadBrowser();
                Thread t = new Thread(new Runnable(){

					public void run() {
						// TODO Auto-generated method stub
//						Map m = new Map();
//		                m.showMap();
						Map.showMap();
					}
                	
                });
                t.setPriority(10);
                t.start();
                Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = ((int) tk.getScreenSize().getWidth());
                int ySize = ((int) tk.getScreenSize().getHeight());
                frame.setSize(xSize,ySize);
                
            }
        });  
        
        //Adding Action Listener for Print Screen
//        printScreen.addActionListener(new ActionListener() {  // Load Map Action Listener
//        	public void actionPerformed(ActionEvent e)
//            {
//                //Execute when  "Print Screen" button is clicked
//                System.out.println("Clicked Print Screen..");
//                frame.setSize(100,100);
////                frame.setVisible(false);
////                MouseScreenShot screenShot = new MouseScreenShot();
////				screenShot.captureScreen();
//                Map.save();
////                frame.setVisible(true);
//                frame.setSize(1000, 800);
//            }
//        });  
//        
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
        		if(minColor==null || midColor==null || maxColor==null){
        			JOptionPane.showMessageDialog(null, "Please Select all three colors");
        		}
        		
        		//System.out.println("User Selected Following colors:: ");
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
					JOptionPane.showMessageDialog(null, "Color Scheme is Saved");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Ooops!! Something is Wrong!!");
				}
            }
        }); 
        
        //Adding event listener for ColorScheme Reset Button
        colorSchemeReset.addActionListener(new ActionListener() {  // Load Map Action Listener
        	public void actionPerformed(ActionEvent e)
            {
               //clicked Reset Button, setting background of Color BUtton to original
        		minColorButton.setBackground(null);
        		midColorButton.setBackground(null);
        		maxColorButton.setBackground(null);
            }
        }); 
    }

		
    
}
