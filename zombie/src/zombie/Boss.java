package zombie;

public class Boss extends Unit{
	private int shield;
	private final int FULL_POWER = 1;
	private int power;
	

	public Boss(int pos, int hp, int max, int shield) {
		super(pos, hp, max);
		this.shield = shield;
	}
	
	public int getShield() {
		return this.shield;
	}
	
	public void setShield(int shield) {
		this.shield = shield;
	}

	@Override
	void attack(Unit unit) {
		Hero hero = (Hero) unit;
		int rNum = getRan().nextInt(4) + 1;
		if(rNum == FULL_POWER) {
			System.out.println("보스의 필살기 발동 2배의 공격력");
			power = getRan().nextInt(getMax()) + 1;
			hero.setHp(hero.getHp() - power*2);
			System.out.printf("보스가 %d의 공격력으로 공격 : 현재 HERO hp : %d", power*2, hero.getHp());
		}
		else {
			System.out.println("보스의 일반 공격");
			power = getRan().nextInt(getMax()) + 1;
			hero.setHp(hero.getHp() - power);
			System.out.printf("보스가 %d의 공격력으로 공격 : 현재 HERO hp : %d", power, hero.getHp());
		}
		
	}

}
