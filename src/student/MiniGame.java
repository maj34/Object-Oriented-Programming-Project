package student;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
	public void MiniGameWith(Character character) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);

		int rock = 1, sissor = 2, paper = 3;
		System.out.println("[���� ���� �� ������ �����մϴ�.]\n");
		System.out.println("������ ���ðڽ��ϱ� (���� = 1 / ���� = 2 / �� = 3 )>> ");
		while (true) {
			int ME = in.nextInt();
			int COM = random.nextInt(3);

			if (ME == COM)
				System.out.println("�����ϴ�. ������ �ٽ� �����մϴ�.");
			else if (ME == 1) {
				if (COM == 2) {
					System.out.println("[�÷��̾�]:���� / [��ǻ��]:���� \n �̰���ϴ�.!!");
					character.winminigame();
					break;
				} else if (COM == 3) {
					System.out.println("[�÷��̾�]:���� / [��ǻ��]:�� \n �����ϴ�.�̤� ������ȸ�� ����ּ���!!");
					character.loseminigame();
					break;
				}
			} else if (ME == 2) {
				if (COM == 1) {
					System.out.println("[�÷��̾�]:���� / [��ǻ��]:���� \n �����ϴ�.�̤� ������ȸ�� ����ּ���!!");
					character.loseminigame();
					break;
				} else if (COM == 3) {
					System.out.println("[�÷��̾�]:���� / [��ǻ��]:�� \n �̰���ϴ�.!!");
					character.winminigame();
					break;
				}
			} else if (ME == 3) {
				if (COM == 1) {
					System.out.println("[�÷��̾�]:�� / [��ǻ��]:�ָ� \n �̰���ϴ�.!!");
					character.winminigame();
					break;
				} else if (COM == 2) {
					System.out.println("[�÷��̾�]:�� / [��ǻ��]:���� \n �����ϴ�.�̤� ������ȸ�� ����ּ���!!");
					character.loseminigame();
					break;
				}
			}
		}

	}
}