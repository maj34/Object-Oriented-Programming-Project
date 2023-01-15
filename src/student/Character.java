package student;

import java.util.concurrent.TimeUnit;

public abstract class Character {

	// ��� ���� ����
	protected int exp;
	protected int energy;
	protected int level;

	// �߻� �޼ҵ�
	public abstract void eatkfood(); // �ѽĸԱ�

	public abstract void eatcfood(); // �߽ĸԱ�

	public abstract void eatjfood(); // �ϽĸԱ�

	public abstract void eatffood(); // ��ĸԱ�

	public abstract void eatelse(); // ���ĸԱ�

	public abstract void sleep(); // ���ڱ�

	public abstract boolean loseDeathGame(); // ������ ���� ��

	public abstract boolean winDeathGame(); // ������ �̰��� ��

	public abstract boolean selectHurt();

	public abstract boolean selectRefresh();

	public abstract boolean selectBulkup();

	public abstract boolean project(); // ������Ʈ ��÷

	public abstract boolean manyHomework(); // ������ź

	public abstract boolean competition(); // ������ ������

	public abstract boolean study(); // �����ϱ�

	public abstract void levelUp(); // ����

	public abstract boolean winminigame();

	public abstract boolean loseminigame();

	// ������ üũ
	public boolean checkEnergy() {
		if (energy > 0) {
			return true;
		} else {
			return false;
		}
	}

	// ���� ĳ������ ���¸� ���
	public void printInfo() {
		try {
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.println("===============================");
			System.out.println("���� ĳ������ ������ ����մϴ�.");
			System.out.println("����ġ : " + exp);
			System.out.println("������ : " + energy);
			System.out.println("�г� : " + level);
			System.out.println("===============================");
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
