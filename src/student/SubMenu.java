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
			System.out.println("������ �ұ��?");
			System.out.print("1. �� ���̱�\t2. �� ����\t3. ����ֱ�\t4. �����ϱ�\t5. ���ᢺ");
			int menu = Integer.parseInt(scanner.nextLine());

			if (menu == 1) {
				etm.EatMealWith(character);
				if (!character.checkEnergy()) {
					System.out.println("�������� �����ؼ� ĳ���Ͱ� ����߽��ϴ�!");
					break;
				}
			} else if (menu == 2) {
				character.sleep();
			} else if (menu == 3) {
				ply.playGameWith(character);
				if (!character.checkEnergy()) {
					System.out.println("�������� �����ؼ� ĳ���Ͱ� ����߽��ϴ�!");
					break;
				}
				character.levelUp();
			} else if (menu == 4) {
				stw.study(character);
				if (!character.checkEnergy()) {
					System.out.println("�������� �����ؼ� ĳ���Ͱ� ����߽��ϴ�!");
					break;
				}
				character.levelUp();
			} else if (menu == 5) {
				System.out.println("������ �����մϴ�.!! ");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�!");
				continue;
			}
			if (character.level <= 4)
				character.printInfo();
		}
	}
}
