package typingApp_Answer_Rebuild;

public class Word {
	private String value;
	private int limit;
	
	public Word(String value,int limit) {
		this.value = value;
		this.limit = limit;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public int getLimit() {
		return this.limit;
	}

}
