/*package co.com.accenture.certificacion.despegar.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class LoadDataExcel {
	String[] campo = new String[2];
	int position = 0;

	public String[] leerExcel() {

		try {

			String routeFileExcel = "src/test/resources/datadriven/data.xlsx";

			Sheet firstSheet;
			try (FileInputStream inputStream = new FileInputStream(new File(routeFileExcel))) {
				try (Workbook workbook = new XSSFWorkbook(inputStream)) {
					firstSheet = Workbook.getSheetAt(0);
				}
			}
			Iterator iterator = firstSheet.iterator();
			DataFormatter formatter = new DataFormatter();
			while (iterator.hasNext()) {
				Row nextRow = (Row) iterator.next();
				Iterator cellIterator = nextRow.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = (Cell) cellIterator.next();
					String contentCell = formatter.formatCellValue(cell);
					campo[position] = contentCell;
					position = position + 1;

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return campo;
	}
}
*/