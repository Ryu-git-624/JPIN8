package typingApp_Rebuild;

import java.util.ArrayList;
import java.util.List;

class Examination {
	//出題リスト
	private List<Question> list = new ArrayList<Question>();

	public Examination(int size) {
		Dictionary dic = new Dictionary();

		for (int i = 0; i < size; i++) {
			this.list.add(new Question(dic.getRandom()));
			System.out.println(this.list.get(i).getValue());
		}
		System.out.println("----------------------------------");
	}
	
	public List<Question> get() {
		return this.list;
	}

}
