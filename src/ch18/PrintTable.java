package ch18;

import java.util.ArrayList;

public class PrintTable {

	private String[] title;

	private ArrayList<Person> listPerson;

	private ArrayList<ColumnSize> countSpace;

	public String[] getTitle() {
		return title;
	}

	public void setTitle(String[] title) {
		this.title = title;
	}

	public ArrayList<Person> getList() {
		return listPerson;
	}

	public void setList(ArrayList<Person> list) {
		this.listPerson = list;
	}

	public ArrayList<ColumnSize> getCountSpace() {
		return countSpace;
	}

	public void setCountSpace(ArrayList<ColumnSize> countSpace) {
		this.countSpace = countSpace;
	}

	/* 라인 그리는 메소드 */
	public void makeLine() {

		ColumnPrint c = new ColumnPrint();

		countSpace = c.countSpace2(title, listPerson);

		for (int k = 0; k < countSpace.size(); k++) {
			System.out.print("+");
			for (int l = 0; l < countSpace.get(k).getSize(); l++) {

				System.out.print("-");

			}
		}
		System.out.print("+");
		System.out.println();

	}

	public void header() {

		makeLine();

		ColumnPrint c = new ColumnPrint(countSpace);
		c.printColumn(title);

		makeLine();

	}

	public void content() {

		for (int index = 0; index < listPerson.size(); index++) {
			ColumnPrint c = new ColumnPrint(countSpace);
			c.setIndex(index);
			String[] compare = c.temp(listPerson);

			c.printColumn(compare);
		}

		makeLine();

	}

}
