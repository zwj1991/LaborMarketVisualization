package lmv.ui;

import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

import lmv.backend.MouseScreenShot;
import lmv.backend.ScreenShot;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Event;
public class Map {

		private static org.eclipse.swt.graphics.Rectangle r;
	     
//	   public static Rectangle getR() {
//			return r;
//		}

	public static void main(String[] args)
	   {  
//		  showMap();
	   }
	   
	   public static void showMap(){
		   
		   Display display = new Display();
			final Shell shell = new Shell(display);
			shell.setLayout(new RowLayout());
			shell.setSize(1000, 600);
//			r = shell.getBounds();
		Button printscreen = new Button(shell, SWT.PUSH);
			printscreen.setText("Capture Screen");
//			GridData gridData = new GridData(GridData.END, GridData.CENTER, false, false);
//			gridData.horizontalSpan = 3;
//			printscreen.setLayoutData(gridData);
			printscreen.setSize(100, 100);
			printscreen.addListener(SWT.Selection, new Listener() {
			      	public void handleEvent(org.eclipse.swt.widgets.Event arg0) {
					// TODO Auto-generated method stub
					//System.out.println("Clicked on Print Screen from Shell..");
			      		
				    //MouseScreenShot screenShot = new MouseScreenShot();
					//screenShot.captureScreen();
					r = shell.getBounds();
					save();
					MessageBox mb = new MessageBox(shell);
		            mb.setText("Message from SWT");
		            mb.setMessage("Screen Captured");
		            mb.open();
					
					
				}
			    });

			
			

			final Browser browser;
			try {
				browser = new Browser(shell, SWT.NONE);
				browser.setSize(1000,800);
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
	   
	   public static void save(){
		   ScreenShot ss = new ScreenShot();
		   String path = System.getProperty("user.dir");
		   path = path.replaceAll("\\\\","/") + "/";
		   ss.screenShotAsFile(r.x, r.y, r.width, r.height, path, new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), "jpg");
	   }
	
	
}