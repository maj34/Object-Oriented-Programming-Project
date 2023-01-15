package student;

public class Ma extends Character {
	public Ma() {
		exp = 0;
		energy = 50;
		level = 1;
		System.out.println("마씨 캐릭터가 생성되었습니다.");
		printInfo();
	}

	public void eatkfood() {
		energy += 5;
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
		energy += 10;
	}

	public void sleep() {
		energy += 30;
	}

	public boolean loseDeathGame() {
		energy -= 20;
		exp += 10;
		return checkEnergy();
	}

	public boolean winDeathGame() {
		energy -= 5;
		exp += 15;
		return checkEnergy();
	}

	public boolean selectHurt() {
		energy -= 20;
		exp += 5;
		return checkEnergy();
	}

	public boolean selectRefresh() {
		energy += 25;
		exp += 5;
		return checkEnergy();
	}

	public boolean selectBulkup() {
		energy += 35;
		exp += 5;
		return checkEnergy();
	}

	public boolean project() {
		energy -= 20;
		exp += 55;
		return checkEnergy();
	}

	public boolean manyHomework() {
		energy -= 15;
		exp += 50;
		return checkEnergy();
	}

	public boolean competition() {
		energy -= 25;
		exp += 55;
		return checkEnergy();
	}

	public boolean study() {
		energy -= 5;
		exp += 50;
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
