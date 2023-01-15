package student;

import java.util.concurrent.TimeUnit;

public abstract class Character {

	// 멤버 변수 선언
	protected int exp;
	protected int energy;
	protected int level;

	// 추상 메소드
	public abstract void eatkfood(); // 한식먹기

	public abstract void eatcfood(); // 중식먹기

	public abstract void eatjfood(); // 일식먹기

	public abstract void eatffood(); // 양식먹기

	public abstract void eatelse(); // 간식먹기

	public abstract void sleep(); // 잠자기

	public abstract boolean loseDeathGame(); // 술게임 졌을 때

	public abstract boolean winDeathGame(); // 술게임 이겼을 때

	public abstract boolean selectHurt();

	public abstract boolean selectRefresh();

	public abstract boolean selectBulkup();

	public abstract boolean project(); // 프로젝트 당첨

	public abstract boolean manyHomework(); // 과제폭탄

	public abstract boolean competition(); // 공모전 나가기

	public abstract boolean study(); // 공부하기

	public abstract void levelUp(); // 진급

	public abstract boolean winminigame();

	public abstract boolean loseminigame();

	// 에너지 체크
	public boolean checkEnergy() {
		if (energy > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 현재 캐릭터의 상태를 출력
	public void printInfo() {
		try {
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.println("===============================");
			System.out.println("현재 캐릭터의 정보를 출력합니다.");
			System.out.println("경험치 : " + exp);
			System.out.println("에너지 : " + energy);
			System.out.println("학년 : " + level);
			System.out.println("===============================");
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
