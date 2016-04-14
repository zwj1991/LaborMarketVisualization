package lmv.backend;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenShot {
	
	public static void main(String[] args) {
		ScreenShot ss = new ScreenShot();
		ss.screenShotAsFile(0, 0, 500, 500, "D:\\", "123", "jpg");
	}

	public BufferedImage getScreenShot(int x, int y, int width, int height) {
		   BufferedImage bfImage = null;
		         try {
		             Robot robot = new Robot();
		             bfImage = robot.createScreenCapture(new Rectangle(x, y, width, height));
		         } catch (AWTException e) {
		             e.printStackTrace();
		         }
		         return bfImage;
	}
	
	public void screenShotAsFile(int x, int y, int width, int height, String savePath, String fileName, String format) {
		         try {
		             Robot robot = new Robot();
		             BufferedImage bfImage = robot.createScreenCapture(new Rectangle(x, y, width, height));
		             File path = new File(savePath);
		             File file = new File(path, fileName+ "." + format);
		             if(!file.exists())
		            	 file.createNewFile();
		             ImageIO.write(bfImage, format, file);
		         } catch (AWTException e) {
		             e.printStackTrace();    
		         } catch (IOException e) {
		             e.printStackTrace();
		         }
	}
}
