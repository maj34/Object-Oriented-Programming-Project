package student;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Drink {

	public void DrinkGame(Character character) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		System.out.println("The Game of Death ����~!\n");
		System.out.println(">> ������ �� ����<< ");
		System.out.println(" 1. ���� ������ �ο��� �Է��ϰ� ������ ��ȣ�� �����մϴ�.\n 2. ������ �׻� 0������ �մϴ�.\n "
				+ "3. ������ ����Ǹ� �������� ������ ��ȣ�� �Է��մϴ�.\n 4.�������� ����� ����� ������ �ƴϸ� ���ӿ��� �¸��մϴ�.\n ");
		System.out.println("����(5 ~ 10)�� �Է��Ͻÿ�.");
		int N = in.nextInt();
		System.out.println("�ڽ��� ��ġ�� ��ȣ(1 ~ �����ο���)�� �����Ͻÿ�.");
		int ME = in.nextInt();
		int bound = N, count = 1, index = 0;
		int[] people = new int[N + 1];

		// ù ��° ���� ����

		System.out.println("ù��° 0���� ������� ���� �����մϴ�.");
		int first = random.nextInt(bound);
		try {
			if (first == ME) {
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("========================================");
				System.out.println("0���� ����� �����Ͽ����ϴ�. �������� ������ ��ȣ�� �Է��ϼ���.");
				int num = in.nextInt();
				System.out.println("========================================");

				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(ME + "���� " + num + "���� �����Ͽ����ϴ�.");
				people[index] = num;
			} else {
				System.out.println("ù��° ����� " + first + "���� �����ϼ̽��ϴ�.");
				people[index] = first;
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		// ù��° ���� ���� while������ N��ŭ �ݺ�
		while (true) {
			if (count == N) {
				System.out.println("���������� ����ǽ� ���� " + people[index] + "�� �Դϴ�.");
				if (people[index] == ME) {
					System.out.println("����� ������ ��÷�Ǽ̽��ϴ�. ���̵��� ��~��~����!! \nü���� �ް��ϰ� �������ϴ�.");
					character.loseDeathGame();
				} else {
					System.out.println("����� �� ���Ե� ���ӿ� �¸��ϼ̽��ϴ�. ����ġ�� �����ϴ�.");
					character.winDeathGame();
				}
				break;
			}
			try {
				if (count == 1) {
					int next = random.nextInt(bound);
					TimeUnit.MILLISECONDS.sleep(500);
					System.out.println(people[index] + "���� " + next + "���� �����ϼ̽��ϴ�.");
					index++;
					people[index] = next;
					count++;
				} else {
					int next = random.nextInt(bound);
					if (next == ME & count != N) {
						TimeUnit.MILLISECONDS.sleep(500);
						System.out.println("========================================");
						System.out.println(people[index] + "���� ����� �����Ͽ����ϴ�. �������� ������ ��ȣ�� �Է��ϼ���.");
						int num = in.nextInt();
						System.out.println("========================================");

						TimeUnit.MILLISECONDS.sleep(500);
						System.out.println(ME + "���� " + num + "���� �����Ͽ����ϴ�.");
						count++;
						index++;
						people[index] = num;
					} else if (count != N) {
						TimeUnit.MILLISECONDS.sleep(500);
						System.out.println(people[index] + "���� " + next + "���� �����ϼ̽��ϴ�.");
						count++;
						index++;
						people[index] = next;
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
