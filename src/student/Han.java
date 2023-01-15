package student;

public class Han extends Character {

	public Han() {
		exp = 0;
		energy = 50;
		level = 1;
		System.out.println("한씨 캐릭터가 생성되었습니다.");
		printInfo();
	}

	public void eatkfood() {
		energy += 10;
	}

	public void eatcfood() {
		energy += 5;
	}

	public void eatjfood() {
		energy += 10;
	}

	public void eatffood() {
		energy += 5;
	}

	public void eatelse() {
		energy += 5;
	}

	public void sleep() {
		energy += 30;
	}

	public boolean loseDeathGame() {
		energy -= 30;
		exp += 10;
		return checkEnergy();
	}

	public boolean winDeathGame() {
		energy -= 10;
		exp += 15;
		return checkEnergy();
	}

	public boolean selectHurt() {
		energy -= 30;
		exp += 15;
		return checkEnergy();
	}

	public boolean selectRefresh() {
		energy += 15;
		exp += 15;
		return checkEnergy();
	}

	public boolean selectBulkup() {
		energy += 25;
		exp += 15;
		return checkEnergy();
	}

	public boolean project() {
		energy -= 20;
		exp += 20;
		return checkEnergy();
	}

	public boolean manyHomework() {
		energy -= 15;
		exp += 15;
		return checkEnergy();
	}

	public boolean competition() {
		energy -= 25;
		exp += 30;
		return checkEnergy();
	}

	public boolean study() {
		energy -= 15;
		exp += 10;
		return checkEnergy();
	}

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