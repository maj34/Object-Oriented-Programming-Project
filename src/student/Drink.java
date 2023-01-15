package student;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Drink {

	public void DrinkGame(Character character) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		System.out.println("The Game of Death 시작~!\n");
		System.out.println(">> 게임의 룰 설명<< ");
		System.out.println(" 1. 먼저 참여할 인원을 입력하고 본인의 번호를 지정합니다.\n 2. 시작은 항상 0번부터 합니다.\n "
				+ "3. 본인이 지목되면 다음으로 지목할 번호를 입력합니다.\n 4.마지막에 지목된 사람이 본인이 아니면 게임에서 승리합니다.\n ");
		System.out.println("숫자(5 ~ 10)을 입력하시오.");
		int N = in.nextInt();
		System.out.println("자신이 위치할 번호(1 ~ 참여인원수)를 지정하시오.");
		int ME = in.nextInt();
		int bound = N, count = 1, index = 0;
		int[] people = new int[N + 1];

		// 첫 번째 지목 시작

		System.out.println("첫번째 0번인 사람부터 지목 시작합니다.");
		int first = random.nextInt(bound);
		try {
			if (first == ME) {
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("========================================");
				System.out.println("0번이 당신을 지목하였습니다. 다음으로 지목할 번호를 입력하세요.");
				int num = in.nextInt();
				System.out.println("========================================");

				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(ME + "번이 " + num + "번을 지목하였습니다.");
				people[index] = num;
			} else {
				System.out.println("첫번째 사람이 " + first + "번을 지목하셨습니다.");
				people[index] = first;
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		// 첫번째 지목 이후 while문으로 N만큼 반복
		while (true) {
			if (count == N) {
				System.out.println("마지막으로 지목되신 분은 " + people[index] + "번 입니다.");
				if (people[index] == ME) {
					System.out.println("당신은 죽음에 당첨되셨습니다. 술이들어간다 쭉~쭉~쭉쭉!! \n체력이 급격하게 떨어집니다.");
					character.loseDeathGame();
				} else {
					System.out.println("당신은 운 좋게도 게임에 승리하셨습니다. 경험치가 오릅니다.");
					character.winDeathGame();
				}
				break;
			}
			try {
				if (count == 1) {
					int next = random.nextInt(bound);
					TimeUnit.MILLISECONDS.sleep(500);
					System.out.println(people[index] + "번이 " + next + "번을 지목하셨습니다.");
					index++;
					people[index] = next;
					count++;
				} else {
					int next = random.nextInt(bound);
					if (next == ME & count != N) {
						TimeUnit.MILLISECONDS.sleep(500);
						System.out.println("========================================");
						System.out.println(people[index] + "번이 당신을 지목하였습니다. 다음으로 지목할 번호를 입력하세요.");
						int num = in.nextInt();
						System.out.println("========================================");

						TimeUnit.MILLISECONDS.sleep(500);
						System.out.println(ME + "번이 " + num + "번을 지목하였습니다.");
						count++;
						index++;
						people[index] = num;
					} else if (count != N) {
						TimeUnit.MILLISECONDS.sleep(500);
						System.out.println(people[index] + "번이 " + next + "번을 지목하셨습니다.");
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
