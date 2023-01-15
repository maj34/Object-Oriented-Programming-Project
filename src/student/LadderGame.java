package student;

import static student.Sadari.FINAL_LINE;
import static student.Sadari.HEIGHT;
import static student.Sadari.SHAPE_ARR;
import static student.Sadari.STANDARD_LINE;

import java.util.Scanner;

public class LadderGame {
	private static Scanner sc = new Scanner(System.in);
	static String[] user_s = new String[3];
	static String[] result_s = new String[3];

	public static void LadderGameWith(Character character) {
		int playNum = 0;
		System.out.println("\n>>계단 오르기 게임의 룰<< ");
		System.out.println(" 1. 3가지의 계단중 하나를 고릅니다.\n 2. 선택한 계단에 따라 [근성장,다침,개운함] 3가지 결과중 하나가 랜덤으로 결정됩니다.\n");

		while (true) {

			try {
				playNum = 3;
				System.out.println("A      B      C      다음 계단 중 하나를 고르시오.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			String[][] sadariField = new String[HEIGHT][playNum * FINAL_LINE];
			String[] user = new String[playNum];
			String[] result = new String[playNum];

			setField(sadariField, playNum);

			setInput(user, "플레이어");
			setResult(result);
			setBridge(sadariField, playNum);
			result(sadariField, playNum, user, result);
			for (int i = 0; i < 3; i++) {
				if (user_s[i].equals("플레이어")) {
					if (result_s[i].equals("다침"))
						character.selectHurt();
					else if (result_s[i].equals("개운함"))
						character.selectRefresh();
					else if (result_s[i].equals("근성장"))
						character.selectBulkup();

				}
			}
			break;
		}

		/// 나온 결과 가지고 if 문으로 추가하기

	}//////////// 메인 메서드

	private static void setField(String[][] arr, int num) {
		for (int q = 0; q < HEIGHT; q++) {
			for (int w = 0; w < FINAL_LINE * num; w++) {
				if (w % 4 == STANDARD_LINE - 1) {
					arr[q][w] = SHAPE_ARR[0];
					System.out.print(SHAPE_ARR[0]);
				} else {
					arr[q][w] = "  ";
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("다침    근성장   개운함     계단타기의 결과");
	}// 사다리를 설정하는 메서드

	private static void setInput(String[] userArr, String msg) {
		String select;
		System.out.println("선택할 계단을 입력하세요: ");
		select = sc.next();

		if (select.equals("A")) {
			System.out.println("당신이 선택한 계단은: " + select);
			userArr[0] = "플레이어";
			userArr[1] = "B";
			userArr[2] = "C";

		} else if (select.equals("B")) {
			System.out.println("당신이 선택한 계단은: " + select);
			userArr[0] = "A";
			userArr[1] = "플레이어";
			userArr[2] = "C";

		} else if (select.equals("C")) {
			System.out.println("당신이 선택한 계단은: " + select);
			userArr[0] = "A";
			userArr[1] = "B";
			userArr[2] = "플레이어";
		}
	}

	private static void setResult(String[] userArr) {
		userArr[0] = "다침";
		userArr[1] = "근성장";
		userArr[2] = "개운함";
	}
	// 결과값을 저장하는 메소드를 하나 만들어야 함

	private static void setBridge(String[][] arr, int num) {
		int lineNumber = arr[0].length / FINAL_LINE;
		int[] checkLine = new int[lineNumber];
		for (int q = 1; q < arr.length - 1; q++) {
			for (int w = 0; w < lineNumber - 1; w++) {
				if ((int) (Math.random() * 2) == 0)
					checkLine[w] += checkLine[w] < 3 ? setBridgeDetail(arr, q, w * FINAL_LINE) : 0;
			}
			if (q == arr.length - 2)
				for (int w = 0; w < lineNumber - 1; w++) {
					if (checkLine[w] == 0) {
						q = 1;
						break;
					}
				}
		}
	} // 안고쳐도 되고 - 사다리에 연결다리 설정

	private static int setBridgeDetail(String[][] sadari, int q, int w) {
		if (sadari[q][w].equals(SHAPE_ARR[0]) && sadari[q][w + FINAL_LINE].equals(SHAPE_ARR[0])) {
			sadari[q][w] = SHAPE_ARR[3];
			for (int e = 1; e < FINAL_LINE + 1; e++) {
				if (e < FINAL_LINE) {
					sadari[q][w + e] = SHAPE_ARR[1];
				} else {
					sadari[q][w + e] = SHAPE_ARR[2];
				}
			}
			return 1;
		}
		return 0;
	} // 안고쳐도 되고 - 사다리에 연결다리 디테일 설정

	private static void result(String[][] arr, int sadariNum, String[] user, String[] result) {
		realTimeScreenDraw(arr, "");
		String tmp = "";
		int num = 0;
		for (int q = 0; q < arr[0].length; q += FINAL_LINE) {
			int x = 0, y = q;
			for (int w = 0; w < arr.length; w++) {
				if (arr[x][y].equals(SHAPE_ARR[3]))
					y += FINAL_LINE;
				else if (arr[x][y].equals(SHAPE_ARR[2]))
					y -= FINAL_LINE;

				// "♥"이동 로직
				tmp = arr[x][y];
				arr[x][y] = "♥";
				realTimeScreenDraw(arr, user[q / FINAL_LINE]);
				waitTime(250);
				arr[x][y] = tmp;
				x++;
			}
			System.out.println(user[q / FINAL_LINE] + "의 결과는 " + result[y / FINAL_LINE]);
			user_s[num] = user[q / FINAL_LINE];
			result_s[num] = result[y / FINAL_LINE];
			user[q / FINAL_LINE] += "의 결과 -> " + result[y / FINAL_LINE];
			waitTime(1500);

			num++;

		}
		blank();
		System.out.println("────── 결과창 ──────");
		for (String temp : user) {
			System.out.printf("%s %n", temp);
		}

	} /// 얘를 좀 고쳐야 할 것.

	private static void realTimeScreenDraw(String[][] arr, String user) {
		blank();
		System.out.println("현재 유저 -> " + user);

		for (int q = 0; q < arr.length; q++) {
			for (int w = 0; w < arr[q].length; w++) {
				System.out.print(arr[q][w]);
			}
			System.out.println();
		}
	} // 실시간으로

	private static void waitTime(int waitNum) {
		try {
			Thread.sleep(waitNum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} // 안바꿔도 되고

	private static void blank() {
		System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
	}
}// 바꾸면 안되고

class Sadari {
	public static final String[] SHAPE_ARR = { "│", "──", "┤", "├" };
	public static final int STANDARD_LINE = 1;
	public static final int BRIDGE_LINE = 3;
	public static final int FINAL_LINE = STANDARD_LINE + BRIDGE_LINE;
	public static final int HEIGHT = 8;
}// 바꾸면 안되고