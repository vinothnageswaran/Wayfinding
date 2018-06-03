
//import org.apache.commons.lang.StringEscapeUtils;


import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.sikuli.script.App;
import org.sikuli.script.Button;
import org.sikuli.script.Env;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.sikuli.basics.ImageLocator;
import org.sikuli.basics.Settings;
//import org.testng.annotations.Test;
//import org.sikuli.basics.Settings;

public class Test{

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FindFailed, InterruptedException, UnsupportedFlavorException,IOException {


	ImageLocator.setBundlePath("C:/temp/Images");
	
	String InputFile ="W://HIN//D&D//Projects//Release//J- Testing//11. PCH BOH Agility Test Planning//Integration//01 Interface Docs//03 RTLS//RFID//Wayfinding name//L4.xls";

				
	Screen s=new Screen();
	

	  Settings.OcrTextSearch=true;
      Settings.OcrTextRead=true;
	
	

	s.find("CORE.png"); //identify pause button

	s.doubleClick("CORE.png");
	
	s.wait((double) 3.0);
	
System.out.println("CORE button clicked");

 s.type("Uname.png" , " testuser1");
 s.type("Pword.png","Password123");
 
 s.click("Login.png");
 
 s.click("Yes.png");
 
 //s.waitAll();
 
 s.wait((double) 3.0);
 
 s.click("Configuration.png");
 
 s.click("Organisation.png");
 
 s.click("Wayfinding.png");
 
 s.type("Location.png" , "L4");
 
 s.click("GO.png");
 

s.type( Key.TAB ); 
 s.type( Key.TAB ); 
 s.type( Key.TAB ); 
 s.type( Key.TAB ); 
 s.type( Key.TAB ); 
 s.type( Key.TAB ); 
 s.type( Key.TAB ); 
s.type( Key.TAB ); 


	



// s.click("1.png");
 
 s.click("2.png");
       
  s.click("3.png");
         
 s.click("4.png");
        
  s.click("5.png");
       
 s.click("6.png");
         
s.click("7.png");
         
  s.click("8.png");
   
}



	
	}

 
	


