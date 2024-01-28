package typingApp_Answer_Rebuild;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Examination implements Iterator<Question>,Iterable<Question> {
	//出題リスト
	private List<Question> list = new ArrayList<Question>();
	private int index  = 0;
	private Question current = null;
	

	public Examination(int size) {
		Dictionary dic = new Dictionary();
		dic.shuffle();

		for (int i = 0; i < size; i++) {
			
			this.list.add(new Question(dic.get()));
		}
	}

	@Override
	public boolean hasNext() {
		if(this.current != null
				&& this.current.isLimit() == true) {
			return false;
		}
		if(this.current != null
				&& this.current.isClear() == false) {
			return true;
		}
		return this.index < this.list.size() -1;
	}
	

	@Override
	public Question next() {
		if(this.current == null)
		{
			this.current = this.list.get(0);
		}
		if(this.current.isClear()) {
			this.index ++;
			this.current = this.list.get(index);
			
		}
		return this.current;
	}

	@Override
	public Iterator<Question> iterator() {
		return this;
	}

}
