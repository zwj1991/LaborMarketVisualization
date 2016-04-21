package lmv.ui;

import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class Map {

	
	     
	   public static void main(String[] args)
	   {  
		  
	   }
	   
	   public static void showMap(){
		   Display display = new Display();
			Shell shell = new Shell(display);
			shell.setLayout(new FillLayout());
			final Browser browser;
			try {
				browser = new Browser(shell, SWT.NONE);
			} catch (SWTError e) {
				System.out.println("Could not instantiate Browser: " + e.getMessage());
				display.dispose();
				return;
			}
			shell.open();
			String path = System.getProperty("user.dir");
			path = path.replaceAll("\\\\", "/");
			String url = "file:///"+path+"/test.html";
			browser.setUrl(url);
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) display.sleep();
			}
			display.dispose();
	   }
	
	
}