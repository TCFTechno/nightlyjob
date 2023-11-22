package Excell_Read;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadColumn {

	public static ArrayList<String> getColumn0(String sheet, String col) throws Throwable {

		ArrayList<String> list = new ArrayList<String>();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resource\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int numberOfSheets = workbook.getNumberOfSheets();

		for (int i = 0; i < numberOfSheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase(sheet)) {
				XSSFSheet sheetAt = workbook.getSheetAt(i);

				Iterator<Row> rows = sheetAt.iterator();

				Row next = rows.next();

				Iterator<Cell> cellIterator = next.cellIterator();

				int k = 0;
				int column = 0;

				while (cellIterator.hasNext()) {
					Cell cellvalue = cellIterator.next();

					if (cellvalue.getStringCellValue().equalsIgnoreCase(col)) {

						column = k;
						// System.out.println(column);
					}
					k++;
				}

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getCellType() == CellType.STRING) {

						String stringCellValue = r.getCell(column).getStringCellValue();
						// System.out.println(stringCellValue);
						list.add(stringCellValue);
					} else if (r.getCell(column).getCellType() == CellType.BLANK) {
						RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
						list.add(" ");
						// System.out.println("blank"+richStringCellValue);

					} else if (r.getCell(column).getCellType() == CellType.NUMERIC) {
						{

							Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
							list.add(String.valueOf(numericCellValue));
							// System.out.println(numericCellValue);

						}
					}

				}
			}
		}
		return list;
	}

	public static ArrayList<String> getColumn1(String sheet, String col) throws Throwable {

		ArrayList<String> list = new ArrayList<String>();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resource\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int numberOfSheets = workbook.getNumberOfSheets();

		for (int i = 0; i < numberOfSheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase(sheet)) {
				XSSFSheet sheetAt = workbook.getSheetAt(i);

				Iterator<Row> rows = sheetAt.iterator();

				Row next = rows.next();

				Iterator<Cell> cellIterator = next.cellIterator();

				int k = 0;
				int column = 0;

				while (cellIterator.hasNext()) {
					Cell cellvalue = cellIterator.next();

					if (cellvalue.getStringCellValue().equalsIgnoreCase(col)) {

						column = k;
						// System.out.println(column);
					}
					k++;
				}

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getCellType() == CellType.STRING) {

						String stringCellValue = r.getCell(column).getStringCellValue();
						// System.out.println(stringCellValue);
						list.add(stringCellValue);
					} else if (r.getCell(column).getCellType() == CellType.BLANK) {
						RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
						list.add(" ");
						// System.out.println("blank"+richStringCellValue);

					} else if (r.getCell(column).getCellType() == CellType.NUMERIC) {

						Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
						list.add(String.valueOf(numericCellValue));
						// System.out.println(numericCellValue);

					}
				}

			}
		}
		return list;
	}
}