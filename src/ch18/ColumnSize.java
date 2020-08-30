package ch18;

import java.util.ArrayList;

public class ColumnSize {

	private int index;
	private int size;
	
	ArrayList<ColumnSize> countSpace;
	
	
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

	public ColumnSize() {}
	
	public ColumnSize(int index, int size) {
		super();
		this.index = index;
		this.size = size;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	/*
	 * 하는 일 : 빈공간을 제외한 출력할 수 있도록..하는 갯수 확인하기 ...
	 */
	
	public ArrayList<ColumnSize> printTitle(String[] title, ArrayList<Person> listPerson ) {
		
		countSpace = new ArrayList<ColumnSize>();
		
		for(String t : title) {
			ColumnSize columnSize = new ColumnSize(index++, t.length());
			countSpace.add(columnSize);
		}
		
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
	
	public void printText() {
//		for (int i = 0; i < text.length; i++) {
//			System.out.print("|");
//			if (countSpace.get(i).getSize() > text[i].length()) {
//				String s = "";
//				int space = countSpace.get(i).getSize() - text[i].length();
//
//				for (int j = 0; j < space; j++) {
//					s += " ";
//				}
//
//				System.out.print(text[i] + s);
//			} else {
//				System.out.print(text[i]);
//			}
//		}
//		System.out.print("|");
//		System.out.println();
//		
	}
}
