package student;

import java.util.Scanner;

public class EatMeal {

	public void EatMealWith(Character character) {
		Scanner in = new Scanner(System.in);
		System.out.println("어떤 음식을 먹을까요?");
		System.out.print("1. 한식\t2. 중식\t3. 일식\t4. 양식\t5. 간식▶");
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
