package ch19_3;

import java.util.ArrayList;

public class Table {

	// tr을 가지고 있음.
	private ArrayList<TableRow> tableRows;

	public Table() {
		tableRows = new ArrayList<TableRow>();
	}

	public ArrayList<TableRow> getTableRows() {
		return tableRows;
	}

	public void setTableRows(ArrayList<TableRow> tableRows) {
		this.tableRows = tableRows;
	}

	public void setData(String[] title, String[][] content) {

		for (int i = 0; i < title.length; i++) {
			TableHeader tableHeader = new TableHeader(title[i]);
			TableRow tableRow = new TableRow();
			tableRow.addTableHeader(tableHeader);
			getTableRows().add(tableRow);
		}

		for (int i = 0; i < content.length; i++) {
			TableRow tableRow = new TableRow();
			for (int j = 0; j < content[i].length; j++) {
				TableData tableData = new TableData(content[i][j]);
				tableRow.addTableData(tableData);
			}
			getTableRows().add(tableRow);

		}

		System.out.println(tableRows.size());

	}

	public void printTable() {
		
		int rowIndex = 0;
		
//		for(TableRow tr : tableRows) {
//			tr.printTableRow(rowIndex++);
//		}
		for(int i=0;i<tableRows.size();i++) {
			System.out.println(tableRows.get(i).getTableData());
		}

	}

}
