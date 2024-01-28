package typingApp_Rebuild;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainView {

	private static final int count = 10;

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		Examination exa = new Examination(count);
		String inputText = null;

		try {
			int tryCounter = 0;
			while(tryCounter < count) {
				String questionValue = exa.get().get(tryCounter).getValue();
				
				System.out.println(questionValue);
				
				Question ques = new Question(questionValue);
				inputText = br.readLine();
				
				if(ques.isMatch(inputText)) {
					tryCounter++;
				}
				
			}

			br.close();
			System.out.println("クリア！");
		} catch (IOException e) {

		}

	}

}
