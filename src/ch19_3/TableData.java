package ch19_3;

public class TableData extends Cell {

	// data 내용이 들어가 있음
	private String content;
	
	public TableData(String content) {
		this.content = content;
	}
	

	@Override
	public String getData() {
		return content;
	}

	@Override
	public void setData(String data) {
		data = content;
	}

}
