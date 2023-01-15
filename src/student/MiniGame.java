package student;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
	public void MiniGameWith(Character character) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);

		int rock = 1, sissor = 2, paper = 3;
		System.out.println("[가위 바위 보 게임을 시작합니다.]\n");
		System.out.println("무엇을 내시겠습니까 (바위 = 1 / 가위 = 2 / 보 = 3 )>> ");
		while (true) {
			int ME = in.nextInt();
			int COM = random.nextInt(3);

			if (ME == COM)
				System.out.println("비겼습니다. 게임을 다시 진행합니다.");
			else if (ME == 1) {
				if (COM == 2) {
					System.out.println("[플레이어]:바위 / [컴퓨터]:가위 \n 이겼습니다.!!");
					character.winminigame();
					break;
				} else if (COM == 3) {
					System.out.println("[플레이어]:바위 / [컴퓨터]:보 \n 졌습니다.ㅜㅜ 다음기회를 노려주세요!!");
					character.loseminigame();
					break;
				}
			} else if (ME == 2) {
				if (COM == 1) {
					System.out.println("[플레이어]:가위 / [컴퓨터]:바위 \n 졌습니다.ㅜㅜ 다음기회를 노려주세요!!");
					character.loseminigame();
					break;
				} else if (COM == 3) {
					System.out.println("[플레이어]:가위 / [컴퓨터]:보 \n 이겼습니다.!!");
					character.winminigame();
					break;
				}
			} else if (ME == 3) {
				if (COM == 1) {
					System.out.println("[플레이어]:보 / [컴퓨터]:주먹 \n 이겼습니다.!!");
					character.winminigame();
					break;
				} else if (COM == 2) {
					System.out.println("[플레이어]:보 / [컴퓨터]:가위 \n 졌습니다.ㅜㅜ 다음기회를 노려주세요!!");
					character.loseminigame();
					break;
				}
			}
		}

	}
}