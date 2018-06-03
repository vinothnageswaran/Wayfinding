import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javafx.scene.control.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Table {

	private String inputFile;

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	/*
	 * public HashMap read(HashMap values) throws IOException { File inputWorkbook =
	 * new File(inputFile); Workbook w; try { w =
	 * Workbook.getWorkbook(inputWorkbook); // Get the first sheet Sheet sheet =
	 * w.getSheet(0); // Loop over first 10 column and lines
	 * 
	 * 
	 * for (int i = 0; i < sheet.getRows(); i++) { Cell cell = sheet.getCell(0, i);
	 * Cell cell1 = sheet.getCell(1,i);
	 * values.put(cell.getContents(),cell1.getContents());
	 * 
	 * }
	 * 
	 * 
	 * } catch (Exception e) { System.out.println(e); }
	 * 
	 * return values;
	 * 
	 * }
	 */
	String getValue1(String Key, String InputFile) throws IOException {

		// CORE test = new CORE();
		String Value = "";
		HashMap<String, String> values = new HashMap<>();
		// test.setInputFile("c:/temp/COREtest1.xls");
		// File inputWorkbook = new File("c:/temp/COREtest1.xls");

		File inputWorkbook = new File(InputFile);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			Sheet sheet = w.getSheet(0);
			// Loop over first 10 column and lines

			for (int i = 0; i < sheet.getRows(); i++) {
				Cell cell = sheet.getCell(0, i);
				Cell cell1 = sheet.getCell(1, i);

				values.put(cell.getContents(), cell1.getContents());

			}

		} catch (Exception e) {
			System.out.println(e);

		}
		Value = values.get(Key);

		// Value= values.containsKey(key);

		// Value= values.values();
		return Value;

	}

	/*
	 * public static void main(String[] args) throws IOException { CORE test = new
	 * CORE(); HashMap<String, String> values = new HashMap<>();
	 * test.setInputFile("c:/temp/COREtest1.xls"); HashMap<String, String> value =
	 * test.read(values); System.out.println(value.get("6")); }
	 */
}
