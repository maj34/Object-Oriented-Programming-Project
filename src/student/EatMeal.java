package student;

import java.util.Scanner;

public class EatMeal {

	public void EatMealWith(Character character) {
		Scanner in = new Scanner(System.in);
		System.out.println("� ������ �������?");
		System.out.print("1. �ѽ�\t2. �߽�\t3. �Ͻ�\t4. ���\t5. ���Ģ�");
		int eat = Integer.parseInt(in.nextLine());

		if (eat == 1)
			character.eatkfood();
		else if (eat == 2)
			character.eatcfood();
		else if (eat == 3)
			character.eatjfood();
		else if (eat == 4)
			character.eatffood();
		else
			character.eatelse();

	}
}
