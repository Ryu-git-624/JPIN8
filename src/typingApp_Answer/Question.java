package typingApp_Answer;

class Question {
	//出題する単語
	private String value;
	private boolean clear;
	private int failCount;
	private final int retierCount;
	
	public Question(String value) {
		this.value = value;
		this.clear = false;
		this.failCount = 0;
		this.retierCount = 1;
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

}
