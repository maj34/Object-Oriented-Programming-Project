package student;

import java.util.Scanner;

public class SubMenu {
	public void playGame(Character character) {
		Scanner scanner = new Scanner(System.in);
		PlayWith ply = new PlayWith();
		StudyWith stw = new StudyWith();
		EatMeal etm = new EatMeal();

		while (true) {
			if (character.level > 4) {
				break;
			}
			System.out.println("무엇을 할까요?");
			System.out.print("1. 밥 먹이기\t2. 잠 재우기\t3. 놀아주기\t4. 공부하기\t5. 종료▶");
			int menu = Integer.parseInt(scanner.nextLine());

			if (menu == 1) {
				etm.EatMealWith(character);
				if (!character.checkEnergy()) {
					System.out.println("에너지가 부족해서 캐릭터가 사망했습니다!");
					break;
				}
			} else if (menu == 2) {
				character.sleep();
			} else if (menu == 3) {
				ply.playGameWith(character);
				if (!character.checkEnergy()) {
					System.out.println("에너지가 부족해서 캐릭터가 사망했습니다!");
					break;
				}
				character.levelUp();
			} else if (menu == 4) {
				stw.study(character);
				if (!character.checkEnergy()) {
					System.out.println("에너지가 부족해서 캐릭터가 사망했습니다!");
					break;
				}
				character.levelUp();
			} else if (menu == 5) {
				System.out.println("게임을 종료합니다.!! ");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다!");
				continue;
			}
			if (character.level <= 4)
				character.printInfo();
		}
	}
}
