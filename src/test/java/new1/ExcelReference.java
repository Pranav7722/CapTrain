package new1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReference {
	
		File f;
		FileInputStream fis;
		XSSFWorkbook wb;
		XSSFSheet sh;
		
		public ExcelReference(String filepath){
			
		try {
			f = new File(filepath);
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
//			sh=wb.getSheetAt(0);
//			String value=sh.getRow(0).getCell(1).getStringCellValue();
//			System.out.println(value);
			
//			System.out.println(sh.getLastRowNum());
//			System.out.println(sh.getRow(0).getLastCellNum());
//			
//			for(int r=0;r<=sh.getLastRowNum();r++) {
//				for(int c=0;c<sh.getRow(0).getLastCellNum();c++) {
//					System.out.print(sh.getRow(r).getCell(c).getStringCellValue()+" ");
//				}
//				System.out.println();
//			}
			
		} catch (IOException e)
		{			
			e.printStackTrace();
		}

	}
		
		public String getCellData(int sheet,int row,int col) {
			
				sh=wb.getSheetAt(sheet);
				String value=sh.getRow(row).getCell(col).getStringCellValue();
				return value;
		}
		
		public int getRowCount(int sheet) {
			sh=wb.getSheetAt(sheet);
			return sh.getLastRowNum();
		}
		
		public int getColumnCount(int sheet) {
			sh=wb.getSheetAt(sheet);
			return sh.getRow(0).getLastCellNum();
		}
}
