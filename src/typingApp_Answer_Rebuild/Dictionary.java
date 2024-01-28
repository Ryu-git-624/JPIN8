package typingApp_Answer_Rebuild;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dictionary {

	//単語リスト
	private List<Word> words;;
	private int index = 0;

	public Dictionary() {
		this.words = Arrays.asList(
							 new Word("int",     1),
							 new Word("long",    2),
							 new Word("short",   3),
							 new Word("byte",    2),
							 new Word("boolean", 5),
							 new Word("float",   3),
							 new Word("double",  4),
							 new Word("char",    2)
							 );
	}

	public Word get() {
		Word word = this.words.get(index);
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