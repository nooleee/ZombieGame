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
			fullPowerAttack(hero);
		}
		else {
			nomalAttack(hero);
		}
	}
	
	private void fullPowerAttack(Unit hero) {
		System.out.println("보스의 필살기 발동 2배의 공격력");
		power = getRan().nextInt(getMax()) + 1;
		hero.setHp(hero.getHp() - power*2);
		if(hero.getHp() <= 0) {
			hero.setHp(0);
		}
		System.out.printf("보스가 %d의 공격력으로 공격 : 현재 HERO hp : %d\n", power*2, hero.getHp());
	}
	
	private void nomalAttack(Unit hero) {
		System.out.println("보스의 일반 공격");
		power = getRan().nextInt(getMax()) + 1;
		hero.setHp(hero.getHp() - power);
		if(hero.getHp() <= 0) {
			hero.setHp(0);
		}
		System.out.printf("보스가 %d의 공격력으로 공격 : 현재 HERO hp : %d\n", power, hero.getHp());
	}

}
