package typingApp_Answer_Rebuild;

class Question {
	//出題する単語
	private String value;
	private boolean clear;
	private int failCount;
	private final int retierCount;
	
	public Question(Word word) {
		this.value = word.getValue();
		this.clear = false;
		this.failCount = 0;
		this.retierCount = word.getLimit();
	}
	
	//「結果」を比較する処理
	public void answer(String inputValue) {
		this.clear = this.value.equals(inputValue);
		if(this.clear == false) {
			this.failCount++;
		}
	}
	
	public String getValue() {
		return this.value;
	}
	
	public boolean isClear(){
		return this.clear;
	}
	
	public boolean isLimit() {
		return this.failCount == this.retierCount;
	}
	
}
