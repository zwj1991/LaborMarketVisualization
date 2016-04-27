package lmv.ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.swing.JTable;
import javax.swing.ImageIcon;

import lmv.backend.JsFile;
import lmv.backend.ReadFile;


public class Labor_Market_Visualization extends JFrame {
	static String minColor ;
	static String midColor ;
	static String maxColor ;
	static String selectedYear;
	static String selectedVariable;
	private static  JComboBox listOfYears ;
	private static JComboBox listOfVariables;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	/**
	 * Create the frame.
	 */
	
		 final JFrame frame = new JFrame("Prototype Labor Market UI");

	        //frame closing
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBounds(100, 100, 725, 465);
	    
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton minColorButton = new JButton("Select Min Color");
		minColorButton.setBounds(130, 187, 133, 39);
		contentPane.add(minColorButton);
		
		final JButton midColorButton = new JButton("Select Mid Color");
		midColorButton.setBounds(273, 187, 133, 39);
		contentPane.add(midColorButton);
		
		final JButton maxColorButton = new JButton("Select Max Color");
		maxColorButton.setBounds(416, 187, 133, 39);
		contentPane.add(maxColorButton);
		
		JButton colorSchemeSave = new JButton("Save");
		colorSchemeSave.setBounds(200, 237, 96, 39);
		contentPane.add(colorSchemeSave);
		
		JButton colorSchemeReset = new JButton("Reset");
		colorSchemeReset.setBounds(331, 237, 96, 37);
		contentPane.add(colorSchemeReset);
		
		JLabel colorSchemeLabel = new JLabel("Choose your Color Scheme");
		colorSchemeLabel.setForeground(Color.BLUE);
		colorSchemeLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		colorSchemeLabel.setBounds(130, 162, 182, 14);
		contentPane.add(colorSchemeLabel);
		
		JButton loadMap = new JButton("Load Map");
		loadMap.setForeground(new Color(0, 0, 0));
		loadMap.setBounds(453, 293, 96, 45);
		contentPane.add(loadMap);
		
		final JPanel topPanel = new JPanel();
		topPanel.setBounds(130, 71, 419, 68);
		topPanel.setBackground(Color.white);
		contentPane.add(topPanel);
		topPanel.setLayout(new FlowLayout());
		
		JButton loadFile = new JButton("Load File");
		loadFile.setBounds(10, 25, 100, 38);
		topPanel.add(loadFile);
		
		JLabel projectLabel = new JLabel("Labor Market Visualization");
		projectLabel.setForeground(Color.RED);
		projectLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 32));
		projectLabel.setIcon(new ImageIcon("credits.png"));
		projectLabel.setBounds(130, 11, 419, 51);
		contentPane.add(projectLabel);
		final JLabel labelVar = new JLabel("List of Variables: ");
        final JLabel labelYear = new JLabel("List of Years: ");
		//adding event listeners 
        ReadFile.readBaseTable("base.xls");
        
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
                if(listOfYears != null){
                	topPanel.remove(listOfYears);
                }
                topPanel.remove(labelYear);
                topPanel.add(labelYear);
                
                	
                listOfYears= new JComboBox(ReadFile.getYears().toArray());
               
                labelYear.setForeground(Color.BLUE);
                
               
                topPanel.add(listOfYears);
                
                
                //Populating No.of Variables based on User selecte File
                System.out.println(ReadFile.getVars());
                if(listOfVariables != null)
                	topPanel.remove(listOfVariables);
                listOfVariables=new JComboBox(ReadFile.getVars().toArray());
                
                labelVar.setForeground(Color.BLUE);
                topPanel.add(listOfVariables);
                
               frame.repaint();
                frame.setSize(0, 0);
//                Toolkit tk = Toolkit.getDefaultToolkit();
//                int xSize = ((int) tk.getScreenSize().getWidth());
//                int ySize = ((int) tk.getScreenSize().getHeight());
//                frame.setSize(xSize,ySize);
                frame.setSize(1000,800);
                
                
                
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
        			if(selectedYear != null && selectedVariable != null){
        				 StringBuilder sb = new StringBuilder();
                         sb.append("var title = {};\n");
                         sb.append("title['year'] = '" +selectedYear+"'; \n");
                         sb.append("title['var'] = '" +selectedVariable+"'; \n");
                         jsf.outputJs(selectedYear,selectedVariable);
                         jsf.outputFile("title.js", sb.toString());
        			}
        				
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
//                Toolkit tk = Toolkit.getDefaultToolkit();
//                int xSize = ((int) tk.getScreenSize().getWidth());
//                int ySize = ((int) tk.getScreenSize().getHeight());
//                frame.setSize(xSize,ySize);
                frame.setSize(1000,800);
                
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

        frame.setSize(1000,800);
	    frame.setVisible(true);
	}

}
