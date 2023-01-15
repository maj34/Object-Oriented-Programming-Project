package student;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		Character character = null;
		SubMenu sm = new SubMenu();

		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 캐릭터를 선택하세요!\n");
		System.out.println(">> [마씨] 캐릭터 정보 <<");
		System.out.println("마씨는 초밥과 젤리를 좋아합니다. 과자와 초콜릿은 마씨의 인생의 낙!!");
		System.out.println("마씨는 평소 텐션이 아주 높지만 잠을 잘 못자면 몸이 축 늘어집니다. 주기적으로 잠을 잘 재워주세요!!");
		System.out.println("마씨는 평소 학교 과제하는 것은 스트레스 받아 하지만 스스로 공부하는 것은 좋아합니다. 억압받지 않고 공부하게 해주세요!!\n");
		System.out.println(">> [윤씨] 캐릭터 정보 <<");
		System.out.println("윤씨는 공부를 별로 좋아하지 않습니다.  과도한 공부는 사망에 이를 수 있습니다. \n윤씨는 노는것을 좋아하고, 술에 강합니다.");
		System.out.println("윤씨는 햄버거와 피자를 좋아하고 과자를 좋아합니다.\n");
		System.out.println(">> [한씨] 캐릭터 정보 <<");
		System.out.println("한씨는 술에 매우 약합니다. 술을 먹을 때는 신중하세요!!\n공부는 적당히~^^");
		System.out.println("한식과 일식을 매우 좋아하는 학생입니다. 좋아하는 음식을 먹으면 텐션 up!!\n");
		System.out.print("캐릭터를 선택하세요. => 1. 마씨 2. 윤씨 3. 한씨 ▶");

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
			System.out.println("잘못 입력하셨습니다!");
		}
	}// main()
} // class
