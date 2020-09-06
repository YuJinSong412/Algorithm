package ch19_3;

public class Cell {
	
	//데이터와 각 border라인을 그려주는 것이 필요
	//초기화할 때 칸이 만들어지도록.

	protected String data;

	protected String borderTop;

	protected String borderBottom;

	protected String borderLeft;

	protected String borderRight;

	protected int MAX_LENGTH = 8;

	public Cell() {
		this.borderTop = "+--------+";
		this.borderBottom = "+--------+";
		this.borderLeft = "|";
		this.borderRight = "|";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getBorderTop() {
		return borderTop;
	}

	public void setBorderTop(String borderTop) {
		this.borderTop = borderTop;
	}

	public String getBorderBottom() {
		return borderBottom;
	}

	public void setBorderBottom(String borderBottom) {
		this.borderBottom = borderBottom;
	}

	public String getBorderLeft() {
		return borderLeft;
	}

	public void setBorderLeft(String borderLeft) {
		this.borderLeft = borderLeft;
	}

	public String getBorderRight() {
		return borderRight;
	}

	public void setBorderRight(String borderRight) {
		this.borderRight = borderRight;
	}

	public int getMAX_LENGTH() {
		return MAX_LENGTH;
	}

	public void setMAX_LENGTH(int mAX_LENGTH) {
		MAX_LENGTH = mAX_LENGTH;
	}

}
