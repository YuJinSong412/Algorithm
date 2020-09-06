package ch19_3;

import java.util.ArrayList;

public class TableRow {

	// th와 td가 있음 (cell을 상속받는 애들)
	//private ArrayList<TableHeader> tableHeader;

	private ArrayList<TableData> tableData;

	public TableRow() {
		//this.tableHeader = new ArrayList<TableHeader>();
		this.tableData = new ArrayList<TableData>();

	}

//	public ArrayList<TableHeader> getTableHeader() {
//		return tableHeader;
//	}
//
//	public void setTableHeader(ArrayList<TableHeader> tableHeader) {
//		this.tableHeader = tableHeader;
//	}

	public ArrayList<TableData> getTableData() {
		return tableData;
	}

	public void setTableData(ArrayList<TableData> tableData) {
		this.tableData = tableData;
	}


	public void addTableHeader(TableData tableHeader) {
		getTableData().add(tableHeader);
	}

	public void addTableData(TableData tableData) {
		getTableData().add(tableData);
	
	}

//	public void setData(String[] title, String[][] content) {
//		for (int i = 0; i < title.length; i++) {
//			TableHeader tableHeader2 = new TableHeader(title[i]);
//			getTableHeader().add(tableHeader2);
//		}
//
//		for (int i = 0; i < content.length; i++) {
//			for (int j = 0; j < content[i].length; j++) {
//				TableData tableData = new TableData(content[i][j]);
//				getTableData().add(tableData);
//			}
//
//		}
//	}
	
	public void printTableRow(int rowIndex) {
		//System.out.println("안");
		
		if(rowIndex == 0) {
			System.out.println(tableData.get(0));
		}
		String data = "";
		
		Cell cell = new Cell();
		String headerPrint = rowIndex == 0 ? cell.getBorderTop() +"\n" : "";
		
		
		//for(int i = 0; i<)
		//System.out.println(headerPrint);
	}
	

}
