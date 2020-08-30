package ch18;

import java.util.ArrayList;

public class PrintTable {

	private String[] title;

	private ArrayList<Person> listPerson;

	private ArrayList<ColumnSize> countSpace;

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

	/*라인 그리는 메소드 */
	public void makeLine() {

		countSpace = new ArrayList<ColumnSize>();

		int index = 0;

		for (String t : title) {
			ColumnSize columnSize = new ColumnSize(index++, t.length());
			countSpace.add(columnSize);
		}
		
		Compare compare412 = new Compare(countSpace,listPerson);
		
		compare412.he();

		//he();

		for (int k = 0; k < countSpace.size(); k++) {
			System.out.print("+");
			for (int l = 0; l < countSpace.get(k).getSize(); l++) {

				System.out.print("-");

			}
		}
		System.out.print("+");
		System.out.println();
		


	}
	
	public ArrayList<ColumnSize> he() {
		for (int i = 0; i < listPerson.size(); i++) {
			int[] compare = new int[listPerson.size()];

			compare[LAST_NAME] = listPerson.get(i).getLast_name().length();
			compare[FIRST_NAME] = listPerson.get(i).getFirst_name().length();
			compare[EMAIL] = listPerson.get(i).getEmail().length();
			compare[PHONE] = listPerson.get(i).getPhone().length();
			compare[ADDRESS] = listPerson.get(i).getAddress().length();
			compare[SECURITY] = listPerson.get(i).getSecurity().length();
			compare[HAMBURDERING] = listPerson.get(i).getHamburgerIng().length();
			compare[WKWKWKDSOAUS] = listPerson.get(i).getWkwkwkdsoaus().length();
			compare[YUJINSONGI] = listPerson.get(i).getYujinsongi().length();
			compare[DKSSUDGKTPDY] = listPerson.get(i).getDkssudgktpdy().length();

			for (int j = 0; j < compare.length; j++) {
				if (countSpace.get(j).getSize() < compare[j]) {
					countSpace.get(j).setSize(compare[j]);
				}
			}

		}
		return countSpace;
	}


	public void header() {
		
		makeLine();
		compare2(title);
		//compare.compare2(title);
		makeLine();

	}

	public void content(ArrayList<Person> listPerson2) {

		for (int i = 0; i < listPerson.size(); i++) {
			String[] compare = new String[listPerson.size()];

			compare[LAST_NAME] = listPerson.get(i).getLast_name();
			compare[FIRST_NAME] = listPerson.get(i).getFirst_name();
			compare[EMAIL] = listPerson.get(i).getEmail();
			compare[PHONE] = listPerson.get(i).getPhone();
			compare[ADDRESS] = listPerson.get(i).getAddress();
			compare[SECURITY] = listPerson.get(i).getSecurity();
			compare[HAMBURDERING] = listPerson.get(i).getHamburgerIng();
			compare[WKWKWKDSOAUS] = listPerson.get(i).getWkwkwkdsoaus();
			compare[YUJINSONGI] = listPerson.get(i).getYujinsongi();
			compare[DKSSUDGKTPDY] = listPerson.get(i).getDkssudgktpdy();

			compare2(compare);
		}

		makeLine();

	}
	
	public void compare2(String[] compare) {
		for (int i = 0; i < compare.length; i++) {
			System.out.print("|");
			if (countSpace.get(i).getSize() > compare[i].length()) {
				String s = "";
				int space = countSpace.get(i).getSize() - compare[i].length();

				for (int j = 0; j < space; j++) {
					s += " ";
				}

				System.out.print(compare[i] + s);
			} else {
				System.out.print(compare[i]);
			}
		}
		System.out.print("|");
		System.out.println();
	}

}
