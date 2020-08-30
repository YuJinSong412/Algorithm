package ch18;

import java.util.ArrayList;

public class ColumnSize {

	private int index;
	private int size;
	
	ArrayList<ColumnSize> countSpace;
	

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
	

}
