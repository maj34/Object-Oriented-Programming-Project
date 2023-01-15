package student;

import java.util.Scanner;

public class LevelupTest {
	static boolean levelup = false;

	public void LevelupTestWith(int level) {
		Scanner in = new Scanner(System.in);

		switch (level) {
		case 1:
			System.out.println("[1학년 진급시험을 시작합니다.]\n 다음 질문에 답해주세요.");
			System.out.println();
			System.out.println("질문) 현재 배우는 객체지향프로그램의 담당 교수님의 성함을 띄어쓰기 없이 입력하시오.");
			System.out.println("==> 정답 : ");
			while (true) {
				String answer = in.next();
				if (answer.equalsIgnoreCase("김형균")) {
					levelup = true;
					System.out.println("2학년으로 진급하셨습니다. 축하드립니다!! ");
					break;
				} else {
					System.out.println("틀리셨습니다. 1학년으로 유급됩니다.");
					levelup = false;
					break;
				}

			}
			break;

		case 2:
			System.out.println("[2학년 진급시험을 시작합니다.]\n 다음 질문에 답해주세요.");
			System.out.println();
			System.out.println("질문) 김형균 교수님의 메일주소를 입력하시오.");
			System.out.print("==> 정답 : ");
			while (true) {
				String answer = in.next();
				if (answer.equalsIgnoreCase("multikim@kookmin.ac.kr")) {
					levelup = true;
					System.out.println("3학년으로 진급하셨습니다. 축하드립니다!! ");
					break;
				} else {
					System.out.println("틀리셨습니다. 2학년으로 유급됩니다.");
					levelup = false;
					break;
				}
			}
			break;

		case 3:
			System.out.println("[3학년 진급시험을 시작합니다.]\n 다음 질문에 답해주세요.");
			System.out.println();
			System.out.println("질문) 2021년 1학기 객체지향프로그래밍 수업 시작 시간을 입력하시오. 시간 숫자만 입력하시오.");
			System.out.print("==> 정답 : ");
			while (true) {
				int answer = in.nextInt();
				if (answer == 12) {
					levelup = true;
					System.out.println("4학년으로 진급하셨습니다. 축하드립니다!! ");
					break;
				} else {
					System.out.println("틀리셨습니다. 3학년으로 유급됩니다.");
					levelup = false;
					break;
				}
			}
			break;

		case 4:
			System.out.println("[4학년 진급시험을 시작합니다.]\n 다음 질문에 답해주세요.");
			System.out.println();
			System.out.println("질문) 졸업소감을 써 주세요.");
			System.out.print("==> 정답 : ");
			String answer = in.next();
			levelup = true;
			System.out.println("졸업하셨습니다. 그동안 수고하셨습니다.");
			break;
		}
	}

}
