package view;

import java.util.Scanner;

public class InputView {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static String inputExpression() {
		System.out.println("계산식을 입력하세요: ");
		return SCANNER.nextLine();
	}
}
