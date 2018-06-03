
//import org.apache.commons.lang.StringEscapeUtils;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.sikuli.basics.ImageLocator;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.KeyModifier;

import com.sun.scenario.Settings;
//import org.testng.annotations.Test;
//import org.sikuli.basics.Settings;

public class Driver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
			throws FindFailed, InterruptedException, UnsupportedFlavorException, IOException {

		ImageLocator.setBundlePath("C:/temp/Images");

		String InputFile = "W://HIN//D&D//Projects//Release//J- Testing//11. PCH BOH Agility Test Planning//Integration//01 Interface Docs//03 RTLS//RFID//Source.xls";

		Screen s = new Screen();

		Settings.OcrTextSearch = true;
		Settings.OcrTextRead = true;

		s.find("CORE.png"); // identify pause button

		s.doubleClick("CORE.png");

		s.wait((double) 3.0);

		System.out.println("CORE button clicked");

		s.type("Uname.png", "windowsadmin3");
		s.type("Pword.png", "Work1t");

		s.click("Login.png");

		// s.click("Yes.png");

		// s.waitAll();

		s.wait((double) 3.0);

		s.click("Configuration.png");

		s.click("Organisation123.png");

		s.click("Wayfinding.png");

		s.type("Location.png", "L9");

		s.click("GO.png");

		s.type(Key.TAB);
		s.type(Key.TAB);
		s.type(Key.TAB);
		s.type(Key.TAB);
		s.type(Key.TAB);
		s.type(Key.TAB);
		// s.type( Key.TAB );
		// s.type( Key.TAB );

		Table tes = new Table();

		/*
		 * for (int j=2; j<716; j++)
		 * 
		 * {
		 * 
		 */

		for (int i = 0; i < 14; i++)

		{
			s.type("a", KeyModifier.CTRL);

			s.type("c", KeyModifier.CTRL);

			String Keey = App.getClipboard();

			System.out.println("Key " + Keey);

			String Value = tes.getValue1(Keey, InputFile);

			System.out.println("Value" + Value);
			s.type(Key.ENTER);
			s.type(Key.TAB);

			s.type("a", KeyModifier.CTRL);

			s.type(Value);
			s.type(Key.ENTER);
			s.type(Key.TAB);

		}

		s.click("Save.png");

	}

}

/*
 * 
 * s.type(Integer.toString(j));
 * 
 * System.out.println("j" + j);
 * 
 * 
 * s.type( Key.ENTER ); s.type( Key.TAB );
 * 
 * 
 * 
 * for (int k=0; k<69; k++)
 * 
 * { s.type(Key.TAB, KeyModifier.SHIFT); s.wait((double) 1.0);
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 * }
 * 
 * }
 * 
 */