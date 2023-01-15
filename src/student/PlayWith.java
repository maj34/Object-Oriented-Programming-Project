package student;

import java.util.Scanner;

public class PlayWith {
	public void playGameWith(Character character) {
		Scanner scanner = new Scanner(System.in);
		Drink drink = new Drink();
		MiniGame minigame = new MiniGame();
		LadderGame laddergame = new LadderGame();

		System.out.println("무엇을 하면서 놀까요?");
		System.out.print("1. 술 마시기\t2.미니 게임하기\t3. 운동하기▶");
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
