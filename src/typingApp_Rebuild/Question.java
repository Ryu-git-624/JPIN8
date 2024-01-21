package typingApp_Rebuild;

class Question {
	//出題する単語
	private String value;
	
	public Question(String value) {
		this.value = value;
	}
	
	//「結果」を返す処理
	public boolean isMatch(String inputValue) {
		
		if(!inputValue.equals(this.getValue())) return false;
		
		return true;
	}
	
	public String getValue() {
		return value;
	}

}
