package student;

import java.util.Scanner;

public class LevelupTest {
	static boolean levelup = false;

	public void LevelupTestWith(int level) {
		Scanner in = new Scanner(System.in);

		switch (level) {
		case 1:
			System.out.println("[1�г� ���޽����� �����մϴ�.]\n ���� ������ �����ּ���.");
			System.out.println();
			System.out.println("����) ���� ���� ��ü�������α׷��� ��� �������� ������ ���� ���� �Է��Ͻÿ�.");
			System.out.println("==> ���� : ");
			while (true) {
				String answer = in.next();
				if (answer.equalsIgnoreCase("������")) {
					levelup = true;
					System.out.println("2�г����� �����ϼ̽��ϴ�. ���ϵ帳�ϴ�!! ");
					break;
				} else {
					System.out.println("Ʋ���̽��ϴ�. 1�г����� ���޵˴ϴ�.");
					levelup = false;
					break;
				}

			}
			break;

		case 2:
			System.out.println("[2�г� ���޽����� �����մϴ�.]\n ���� ������ �����ּ���.");
			System.out.println();
			System.out.println("����) ������ �������� �����ּҸ� �Է��Ͻÿ�.");
			System.out.print("==> ���� : ");
			while (true) {
				String answer = in.next();
				if (answer.equalsIgnoreCase("multikim@kookmin.ac.kr")) {
					levelup = true;
					System.out.println("3�г����� �����ϼ̽��ϴ�. ���ϵ帳�ϴ�!! ");
					break;
				} else {
					System.out.println("Ʋ���̽��ϴ�. 2�г����� ���޵˴ϴ�.");
					levelup = false;
					break;
				}
			}
			break;

		case 3:
			System.out.println("[3�г� ���޽����� �����մϴ�.]\n ���� ������ �����ּ���.");
			System.out.println();
			System.out.println("����) 2021�� 1�б� ��ü�������α׷��� ���� ���� �ð��� �Է��Ͻÿ�. �ð� ���ڸ� �Է��Ͻÿ�.");
			System.out.print("==> ���� : ");
			while (true) {
				int answer = in.nextInt();
				if (answer == 12) {
					levelup = true;
					System.out.println("4�г����� �����ϼ̽��ϴ�. ���ϵ帳�ϴ�!! ");
					break;
				} else {
					System.out.println("Ʋ���̽��ϴ�. 3�г����� ���޵˴ϴ�.");
					levelup = false;
					break;
				}
			}
			break;

		case 4:
			System.out.println("[4�г� ���޽����� �����մϴ�.]\n ���� ������ �����ּ���.");
			System.out.println();
			System.out.println("����) �����Ұ��� �� �ּ���.");
			System.out.print("==> ���� : ");
			String answer = in.next();
			levelup = true;
			System.out.println("�����ϼ̽��ϴ�. �׵��� �����ϼ̽��ϴ�.");
			break;
		}
	}

}
