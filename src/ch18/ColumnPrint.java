package ch18;

import java.util.ArrayList;

public class ColumnPrint {

	private final int LAST_NAME = 0;
	private final int FIRST_NAME = 1;
	private final int EMAIL = 2;
	private final int PHONE = 3;
	private final int ADDRESS = 4;
	private final int SECURITY = 5;
	private final int HAMBURDERING = 6;
	private final int WKWKWKDSOAUS = 7;
	private final int YUJINSONGI = 8;
	private final int DKSSUDGKTPDY = 9;

	private int index = 0;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private ArrayList<ColumnSize> countSpace;

	private ArrayList<Person> listPerson;

	public ColumnPrint() {
	};

	public ColumnPrint(ArrayList<ColumnSize> countSpace) {
		this.countSpace = countSpace;
	}

	public ArrayList<ColumnSize> getCountSpace() {
		return countSpace;
	}

	public void setCountSpace(ArrayList<ColumnSize> countSpace) {
		this.countSpace = countSpace;
	}

	public ArrayList<Person> getListPerson() {
		return listPerson;
	}

	public void setListPerson(ArrayList<Person> listPerson) {
		this.listPerson = listPerson;
	}

	// 공간확보와 그것을 출력하는 것.

	public ArrayList<ColumnSize> initCountSpace(String[] title) {

		countSpace = new ArrayList<ColumnSize>();

		int index = 0;
		for (String t : title) {
			ColumnSize columnSize = new ColumnSize(index++, t.length());
			countSpace.add(columnSize);
		}

		return countSpace;

	}

	public ArrayList<ColumnSize> countSpace2(String[] title, ArrayList<Person> listPerson) {
		initCountSpace(title);

		for (index = 0; index < listPerson.size(); index++) {

			String[] compare = temp(listPerson);
			for (int j = 0; j < compare.length; j++) {
				if (countSpace.get(j).getSize() < compare[j].length()) {
					countSpace.get(j).setSize(compare[j].length());
				}
			}

		}

		return countSpace;
	}

	public void printColumn(String[] compare) {

		for (int i = 0; i < compare.length; i++) {
			System.out.print("|");
			if (countSpace.get(i).getSize() > compare[i].length()) {
				String s = "";
				int space = countSpace.get(i).getSize() - compare[i].length();
 
				for (int j = 0; j < space; j++) {
					s += " ";
				}

				//System.out.printf("%-30s", compare[i]);
				System.out.print(compare[i] + s);
			} else {
				System.out.print(compare[i]);
			}
		}
		System.out.print("|");
		System.out.println();
	}

	public String[] temp(ArrayList<Person> listPerson) {

		String[] compare = new String[listPerson.size()];

		compare[LAST_NAME] = listPerson.get(index).getLast_name();
		compare[FIRST_NAME] = listPerson.get(index).getFirst_name();
		compare[EMAIL] = listPerson.get(index).getEmail();
		compare[PHONE] = listPerson.get(index).getPhone();
		compare[ADDRESS] = listPerson.get(index).getAddress();
		compare[SECURITY] = listPerson.get(index).getSecurity();
		compare[HAMBURDERING] = listPerson.get(index).getHamburgerIng();
		compare[WKWKWKDSOAUS] = listPerson.get(index).getWkwkwkdsoaus();
		compare[YUJINSONGI] = listPerson.get(index).getYujinsongi();
		compare[DKSSUDGKTPDY] = listPerson.get(index).getDkssudgktpdy();

		return compare;

	}

}
