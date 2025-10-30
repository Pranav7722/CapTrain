package new1;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelWriteDemo {
    public static void main(String[] args) {
       
        XSSFWorkbook workbook = new XSSFWorkbook();
  
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        String[][] data = {
            {"Name", "Age", "City"},
            {"Alice", "30", "New York"},
            {"Bob", "25", "Los Angeles"},
            {"Charlie", "35", "Chicago"}
        };

        for (int i = 0; i < data.length; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < data[i].length; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(data[i][j]);
            }
        }
        try (FileOutputStream fos = new FileOutputStream(".\\src\\test\\java\\Book2.xlsx")) {
            workbook.write(fos);
            System.out.println("Excel file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}