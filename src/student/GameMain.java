package student;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		Character character = null;
		SubMenu sm = new SubMenu();

		Scanner scanner = new Scanner(System.in);
		System.out.println("���ϴ� ĳ���͸� �����ϼ���!\n");
		System.out.println(">> [����] ĳ���� ���� <<");
		System.out.println("������ �ʹ�� ������ �����մϴ�. ���ڿ� ���ݸ��� ������ �λ��� ��!!");
		System.out.println("������ ��� �ټ��� ���� ������ ���� �� ���ڸ� ���� �� �þ����ϴ�. �ֱ������� ���� �� ����ּ���!!");
		System.out.println("������ ��� �б� �����ϴ� ���� ��Ʈ���� �޾� ������ ������ �����ϴ� ���� �����մϴ�. ��й��� �ʰ� �����ϰ� ���ּ���!!\n");
		System.out.println(">> [����] ĳ���� ���� <<");
		System.out.println("������ ���θ� ���� �������� �ʽ��ϴ�.  ������ ���δ� ����� �̸� �� �ֽ��ϴ�. \n������ ��°��� �����ϰ�, ���� ���մϴ�.");
		System.out.println("������ �ܹ��ſ� ���ڸ� �����ϰ� ���ڸ� �����մϴ�.\n");
		System.out.println(">> [�Ѿ�] ĳ���� ���� <<");
		System.out.println("�Ѿ��� ���� �ſ� ���մϴ�. ���� ���� ���� �����ϼ���!!\n���δ� ������~^^");
		System.out.println("�ѽİ� �Ͻ��� �ſ� �����ϴ� �л��Դϴ�. �����ϴ� ������ ������ �ټ� up!!\n");
		System.out.print("ĳ���͸� �����ϼ���. => 1. ���� 2. ���� 3. �Ѿ� ��");

		int c = Integer.parseInt(scanner.nextLine());
		if (c == 1) {
			character = new Ma();
			sm.playGame(character);
		} else if (c == 2) {
			character = new Yoon();
			sm.playGame(character);
		} else if (c == 3) {
			character = new Han();
			sm.playGame(character);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�!");
		}
	}// main()
} // class
