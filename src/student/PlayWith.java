package student;

import java.util.Scanner;

public class PlayWith {
	public void playGameWith(Character character) {
		Scanner scanner = new Scanner(System.in);
		Drink drink = new Drink();
		MiniGame minigame = new MiniGame();
		LadderGame laddergame = new LadderGame();

		System.out.println("������ �ϸ鼭 ����?");
		System.out.print("1. �� ���ñ�\t2.�̴� �����ϱ�\t3. ��ϱ⢺");
		int play = Integer.parseInt(scanner.nextLine());

		if (play == 1) {
			drink.DrinkGame(character);
		} else if (play == 2) {
			minigame.MiniGameWith(character);
		} else if (play == 3) {
			laddergame.LadderGameWith(character);
		}

	}
}
