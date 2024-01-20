package typingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainView {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		ViewList viewList = new ViewList();

		final int completeCount = 10;
		int tryCounter = 0;

		String inputText = null;
		
		String viewText = viewList.getRandomValue();

		try {
			while (tryCounter < completeCount) {
				
				
				System.out.println(viewText + "：" + tryCounter);
				inputText = br.readLine();
				
				if (inputText.equals(viewText)) {
					tryCounter++;
					viewText = viewList.getRandomValue();
				}
			}
			System.out.println("クリア！");
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
