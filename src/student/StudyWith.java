package student;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class StudyWith {

	public void study(Character character) {
		Random random = new Random();
		int iValue = random.nextInt(5); // 0 ~ 5 ������ ���� �߻�

		if (iValue == 0) {
			try {
				System.out.println("������Ʈ ���࿡ �����ϰ� �Ǽ̽��ϴ�. �ּ��� ���� �����ּ���!");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("������Ʈ ������");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("������Ʈ�� �Ϸ��Ͽ����ϴ�.!!");
				character.project();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (iValue == 2) {
			try {
				System.out.println("���� ��ź�Դϴ�....�̤�");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("���� ������");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("������ �Ϸ��Ͽ����ϴ�.!!");
				character.manyHomework();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (iValue == 4) {
			try {
				System.out.println("�������� �����Ͻʽÿ�. ������ �״µ� ���� ������ �˴ϴ�.!! ");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("������ ������");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("�������� �Ϸ��Ͽ����ϴ�.!! ����� ������� ����ġ�� �����ϴ�.");
				TimeUnit.MILLISECONDS.sleep(500);
				character.competition();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			try {
				System.out.println("������ ���ΰ��θ� �����մϴ�.");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("������");
				TimeUnit.MICROSECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("���θ� �Ϸ��Ͽ����ϴ�.!!");
				character.study();
			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

}
