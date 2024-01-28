package typingApp_Answer_Rebuild;

import java.util.Scanner;

public class MainView {

	private static final int COUNT = 8;

	public static void main(String[] args) {

		Examination exa = new Examination(COUNT);
		Scanner scan = new Scanner(System.in);
		
		for (Question ques : exa) {	
			System.out.print(ques.getValue() + ">");
			String inputText = scan.next();
			ques.answer(inputText);
		}
	}

}
