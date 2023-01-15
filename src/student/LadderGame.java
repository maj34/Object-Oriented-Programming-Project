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
		System.out.println("\n>>��� ������ ������ ��<< ");
		System.out.println(" 1. 3������ ����� �ϳ��� ���ϴ�.\n 2. ������ ��ܿ� ���� [�ټ���,��ħ,������] 3���� ����� �ϳ��� �������� �����˴ϴ�.\n");

		while (true) {

			try {
				playNum = 3;
				System.out.println("A      B      C      ���� ��� �� �ϳ��� ���ÿ�.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			String[][] sadariField = new String[HEIGHT][playNum * FINAL_LINE];
			String[] user = new String[playNum];
			String[] result = new String[playNum];

			setField(sadariField, playNum);

			setInput(user, "�÷��̾�");
			setResult(result);
			setBridge(sadariField, playNum);
			result(sadariField, playNum, user, result);
			for (int i = 0; i < 3; i++) {
				if (user_s[i].equals("�÷��̾�")) {
					if (result_s[i].equals("��ħ"))
						character.selectHurt();
					else if (result_s[i].equals("������"))
						character.selectRefresh();
					else if (result_s[i].equals("�ټ���"))
						character.selectBulkup();

				}
			}
			break;
		}

		/// ���� ��� ������ if ������ �߰��ϱ�

	}//////////// ���� �޼���

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
		System.out.println("��ħ    �ټ���   ������     ���Ÿ���� ���");
	}// ��ٸ��� �����ϴ� �޼���

	private static void setInput(String[] userArr, String msg) {
		String select;
		System.out.println("������ ����� �Է��ϼ���: ");
		select = sc.next();

		if (select.equals("A")) {
			System.out.println("����� ������ �����: " + select);
			userArr[0] = "�÷��̾�";
			userArr[1] = "B";
			userArr[2] = "C";

		} else if (select.equals("B")) {
			System.out.println("����� ������ �����: " + select);
			userArr[0] = "A";
			userArr[1] = "�÷��̾�";
			userArr[2] = "C";

		} else if (select.equals("C")) {
			System.out.println("����� ������ �����: " + select);
			userArr[0] = "A";
			userArr[1] = "B";
			userArr[2] = "�÷��̾�";
		}
	}

	private static void setResult(String[] userArr) {
		userArr[0] = "��ħ";
		userArr[1] = "�ټ���";
		userArr[2] = "������";
	}
	// ������� �����ϴ� �޼ҵ带 �ϳ� ������ ��

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
	} // �Ȱ��ĵ� �ǰ� - ��ٸ��� ����ٸ� ����

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
	} // �Ȱ��ĵ� �ǰ� - ��ٸ��� ����ٸ� ������ ����

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

				// "��"�̵� ����
				tmp = arr[x][y];
				arr[x][y] = "��";
				realTimeScreenDraw(arr, user[q / FINAL_LINE]);
				waitTime(250);
				arr[x][y] = tmp;
				x++;
			}
			System.out.println(user[q / FINAL_LINE] + "�� ����� " + result[y / FINAL_LINE]);
			user_s[num] = user[q / FINAL_LINE];
			result_s[num] = result[y / FINAL_LINE];
			user[q / FINAL_LINE] += "�� ��� -> " + result[y / FINAL_LINE];
			waitTime(1500);

			num++;

		}
		blank();
		System.out.println("������������ ���â ������������");
		for (String temp : user) {
			System.out.printf("%s %n", temp);
		}

	} /// �긦 �� ���ľ� �� ��.

	private static void realTimeScreenDraw(String[][] arr, String user) {
		blank();
		System.out.println("���� ���� -> " + user);

		for (int q = 0; q < arr.length; q++) {
			for (int w = 0; w < arr[q].length; w++) {
				System.out.print(arr[q][w]);
			}
			System.out.println();
		}
	} // �ǽð�����

	private static void waitTime(int waitNum) {
		try {
			Thread.sleep(waitNum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} // �ȹٲ㵵 �ǰ�

	private static void blank() {
		System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
	}
}// �ٲٸ� �ȵǰ�

class Sadari {
	public static final String[] SHAPE_ARR = { "��", "����", "��", "��" };
	public static final int STANDARD_LINE = 1;
	public static final int BRIDGE_LINE = 3;
	public static final int FINAL_LINE = STANDARD_LINE + BRIDGE_LINE;
	public static final int HEIGHT = 8;
}// �ٲٸ� �ȵǰ�