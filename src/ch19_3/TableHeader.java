package ch19_3;

public class TableHeader extends Cell{
	
	//제목의 data 가 들어있음
	private String header;

	public TableHeader() {
		
	}
	public TableHeader(String header) {
		this.header = header;
	}
	
	@Override
	public String getData() {
		return header;
	}

	@Override
	public void setData(String data) {
		data = header;
	}
	
	

}
