package student;

public class Yoon extends Character {

	public Yoon() {
		exp = 20;
		energy = 30;
		level = 1;
		System.out.println("윤씨 캐릭터가 생성되었습니다.");
		printInfo();
	}

	public void eatkfood() {
		energy += 5;
	}

	public void eatcfood() {
		energy += 5;
	}

	public void eatjfood() {
		energy += 5;
	}

	public void eatffood() {
		energy += 10;
	} // 양식 좋아!!

	public void eatelse() {
		energy += 10;
	} // 간식 좋아!!

	public void sleep() {
		energy += 30;
	}

	public boolean loseDeathGame() {
		energy -= 10;
		exp += 10;
		return checkEnergy();
	}

	public boolean winDeathGame() {
		energy -= 5;
		exp += 15;
		return checkEnergy();
	}

	public boolean selectHurt() {
		energy -= 10;
		exp += 15;
		return checkEnergy();
	}

	public boolean selectBulkup() {
		energy += 15;
		exp += 15;
		return checkEnergy();
	}

	public boolean selectRefresh() {
		energy += 10;
		exp += 15;
		return checkEnergy();
	}

	public boolean project() {
		energy -= 25;
		exp += 30;
		return checkEnergy();
	} // 프로젝트는 힘들어요.

	public boolean manyHomework() {
		energy -= 25;
		exp += 20;
		return checkEnergy();
	} // 숙제도 힘들어요.

	public boolean competition() {
		energy -= 35;
		exp += 30;
		return checkEnergy();
	} // 공모전도 힘들어요.

	public boolean study() {
		energy -= 20;
		exp += 10;
		return checkEnergy();
	} // 그냥 공부도 힘들어요.

	public boolean winminigame() {
		energy += 10;
		exp += 10;
		return checkEnergy();
	}

	public boolean loseminigame() {
		energy -= 10;
		exp += 10;
		return checkEnergy();
	}

	public void levelUp() {
		if (exp >= 40) {
			LevelupTest test = new LevelupTest();
			test.LevelupTestWith(level);
			if (test.levelup == true) {
				level++;
				exp = 0;
			} else {
				exp -= 30;
			}
		}
	}

}