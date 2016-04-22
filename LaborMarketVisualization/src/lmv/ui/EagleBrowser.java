package lmv.ui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
public class EagleBrowser extends JPanel {
private JPanel webBrowserPanel;

private JWebBrowser webBrowser;

private String url;

//	public EagleBrowser(String url) {
//		super(new BorderLayout());
//		this.url = url;
//		webBrowserPanel = new JPanel(new BorderLayout());
//		webBrowser = new JWebBrowser();
//		webBrowser.navigate(url);
//		webBrowser.setButtonBarVisible(false);
//		webBrowser.setMenuBarVisible(false);
//		webBrowser.setBarsVisible(false);
//		webBrowser.setStatusBarVisible(false);
//		webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
//		add(webBrowserPanel, BorderLayout.CENTER);
//	}
/*
public static void main(String[] args) {
	String path = System.getProperty("user.dir");
	path = path.replaceAll("\\\\", "/");
	final String url = "file:///"+path+"/test.html";
	//final String title = ;
	UIUtils.setPreferredLookAndFeel();
	NativeInterface.open();
	
	SwingUtilities.invokeLater(new Runnable() {
	public void run() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(new EagleBrowser(url), BorderLayout.CENTER);
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	frame.setLocationByPlatform(true);
	//frame.setUndecorated(true);
	frame.setVisible(true);
	}
	});
	NativeInterface.runEventPump();
	}
*/
public void loadBrowser(){

    String path = System.getProperty("user.dir");
	path = path.replaceAll("\\\\", "/");
	String url = "file:///"+path+"/test.html";
	webBrowserPanel = new JPanel(new BorderLayout());
	webBrowser = new JWebBrowser();
	webBrowser.navigate(url);
	webBrowser.setButtonBarVisible(false);
	webBrowser.setMenuBarVisible(false);
	webBrowser.setBarsVisible(false);
	webBrowser.setStatusBarVisible(false);
	webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
	add(webBrowserPanel, BorderLayout.CENTER);
	//final String title = ;
	UIUtils.setPreferredLookAndFeel();
	NativeInterface.open();
	
	SwingUtilities.invokeLater(new Runnable() {
	public void run() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(new EagleBrowser(), BorderLayout.CENTER);
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	frame.setLocationByPlatform(true);
	//frame.setUndecorated(true);
	frame.setVisible(true);
	}
	});
	NativeInterface.runEventPump();
	
}
}