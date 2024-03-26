package zombie;

import java.util.Scanner;

public class Game {
	private Scanner scan = new Scanner(System.in);
	private boolean isRun;
	private int pos;
	private Hero hero;
	private Zombie zombie;
	private Boss boss;

	private Game() {
		isRun = true;
		hero = new Hero(1, 200, 20, 2);
		zombie = new Zombie(5, 100, 10);
		boss = new Boss(9, 300, 20, 100);
		pos = hero.getPos();
	}
	
	private static Game instance = new Game();
	
	public static Game getInstance() {
		return instance;
	}
	
	private void printPos() {
		System.out.printf("현재 위치 : %d\n", pos);
	}
	
	private int inputNumber(String messege) {
		int number = -1;
		System.out.println(messege + " : ");
		
		try {
			String input = scan.next();
			number = Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("숫자만 입력가능합니다.");
		}
		
		return number;
	}
	
	private void fightZombie() {
		
	}
	
	private void runGame(int select) {
		if(select < 1 || select > 2)
			return;
		
		if(select == 1) {
			this.pos++;
			
			if(pos == zombie.getPos()) {
				System.out.println("좀비를 만났습니다. 공격모드로 바뀝니다.");
				fightZombie();
			}
			
			if(pos == boss.getPos()) {
				System.out.println("보스를 만났습니다. 공격모드로 바뀝니다.");
				while(true) {
					
				}
			}
		}
		else if(select == 2)
			isRun = false;
	}
	

	
	public void run() {
		while(isRun) {
			printPos();
			int select = inputNumber("1)앞으로 이동하기 2)종료하기");
			runGame(select);
		}
	}

}
