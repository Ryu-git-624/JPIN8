package typingApp_Answer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dictionary {

	//単語リスト
	private List<String> words;
	private int index = 0;

	public Dictionary() {
		this.words = Arrays.asList("int", "long", "short", "byte", "boolean", "float", "double", "char");
	}

	//辞書の中から順番に単語を提供する
	public String get() {
		String word = this.words.get(index);
		index++;
		return word;
	}

	public void shuffle() {
		Random r = new Random();
		for (int i = 0; i < r.nextInt(100); i++) {
			Collections.shuffle(words);
		}


	}
}