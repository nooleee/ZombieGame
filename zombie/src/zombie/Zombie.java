package zombie;

public class Zombie extends Unit{

	public Zombie(int pos, int hp, int max) {
		super(pos, hp, max);
		this.MAX_HP = hp;
	}
	
	private int power;
	private final int MAX_HP;
	
	
	@Override
	public void attack(Unit unit) {
		Hero hero = (Hero) unit;
		power = getRan().nextInt(getMax()) + 1;
		hero.setHp(hero.getHp() - power);
		if(hero.getHp() <= 0) {
			hero.setHp(0);
		}
		setHp(getHp() + power/2);
		if(getHp() > MAX_HP) {
			setHp(MAX_HP);
		}
		System.out.printf("좀비가 %d의 공격력으로 공격 : 현재 HERO hp : %d 좀비 체력 회복 : %d\n", power, hero.getHp(), getHp());
	}



}
