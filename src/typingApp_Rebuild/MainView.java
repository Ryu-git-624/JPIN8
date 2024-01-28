package typingApp_Rebuild;

import java.util.Scanner;

public class MainView {

	private static final int count = 10;

	public static void main(String[] args) {

		Examination exa = new Examination(count);

		try (Scanner scanner = new Scanner(System.in)) {
			for (Question ques : exa.get()) {

				while (true) {

					System.out.println(ques.getValue());

					String inputText = scanner.nextLine();

					if (ques.isMatch(inputText)) {
						break;
					}
				}
			}
		}finally {
			System.out.println("クリア！");
		}
	}

}
