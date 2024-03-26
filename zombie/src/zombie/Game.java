package zombie;

import java.util.Scanner;

public class Game {
	private Scanner scan = new Scanner(System.in);
	private boolean isRun;
	private int pos;

	private Game() {
		pos = 1;
		isRun = true;
	}
	
	private static Game instance = new Game();
	
	public static Game getInstance() {
		return instance;
	}
	
	private void printPos() {
		System.out.printf("현재 위치 : %d\n", pos);
	}
	

	
	public void run() {
		while(isRun) {
			printPos();
//			int select = inputNumber("1)앞으로 이동하기 2)종료하기");
//			runGame(select);
		}
	}

}
