package com.wanhang.fitness.common.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class ExcelUtil{

	/**
	 * 导出excel
	 * @param response 
	 * @param list excel标题
	 * @param sheetName sheet名称
	 * @param fileName 文件名
	 * @param forEachList 放入的数据
	 */
	public static void exportExcel(HttpServletResponse response, List<String> list, String sheetName, String fileName, List<List<String>> forEachList){
		try {
			OutputStream os = response.getOutputStream();
			response.reset();
			String fName = java.net.URLEncoder.encode(fileName, "UTF-8");
			response.setHeader("Content-disposition", "attachment; filename="+fName+".xls");  
	        response.setContentType("application/msexcel");
			WritableWorkbook workbook = Workbook.createWorkbook(os);
			WritableSheet sheet = workbook.createSheet(sheetName ,0);
			for(int i = 0; i < list.size(); i++){
				sheet.addCell(new Label(i, 0, list.get(i)));
				for(int j = 0; j < forEachList.size(); j++){
					sheet.addCell(new Label(i, j + 1, forEachList.get(j).get(i)));
				}
			}
	        workbook.write();
	        workbook.close();
	        os.close();
	        
		} catch (IOException e) {
			e.printStackTrace();
		}catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	
}
