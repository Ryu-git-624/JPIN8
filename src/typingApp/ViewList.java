package typingApp;

import java.util.Random;

class ViewList {

	String[] values = { "int", "double", "float", "char", "boolean", "long" };

	String getRandomValue() {
		int num = new Random().nextInt(values.length);
		return values[num];

	}
}