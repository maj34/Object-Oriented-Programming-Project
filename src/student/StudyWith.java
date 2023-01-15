package student;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class StudyWith {

	public void study(Character character) {
		Random random = new Random();
		int iValue = random.nextInt(5); // 0 ~ 5 사이의 난수 발생

		if (iValue == 0) {
			try {
				System.out.println("프로젝트 수행에 참여하게 되셨습니다. 최선을 다해 임해주세요!");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("프로젝트 진행중");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("프로젝트를 완료하였습니다.!!");
				character.project();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (iValue == 2) {
			try {
				System.out.println("과제 폭탄입니다....ㅜㅜ");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("과제 진행중");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("과제를 완료하였습니다.!!");
				character.manyHomework();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (iValue == 4) {
			try {
				System.out.println("공모전에 참여하십시오. 경험을 쌓는데 많은 도움이 됩니다.!! ");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("공모전 진행중");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("공모전을 완료하였습니다.!! 결과와 관계없이 경험치가 오릅니다.");
				TimeUnit.MILLISECONDS.sleep(500);
				character.competition();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			try {
				System.out.println("본인의 개인공부를 시작합니다.");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("공부중");
				TimeUnit.MICROSECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println(" .");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("공부를 완료하였습니다.!!");
				character.study();
			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

}
