package zombie;

public class Zombie extends Unit{

	public Zombie(int pos, int hp, int max) {
		super(pos, hp, max);
	}
	
	private int power;
	
	
	@Override
	public void attack(Unit unit) {
		Hero hero = (Hero) unit;
		power = getRan().nextInt(getMax()) + 1;
		hero.setHp(hero.getHp() - power);
		if(hero.getHp() <= 0) {
			hero.setHp(0);
		}
		setHp(getHp() + power/2);
		System.out.printf("좀비가 %d의 공격력으로 공격 : 현재 HERO hp : %d 좀비 체려 회복 : %d\n", power, hero.getHp(), getHp());
	}



}
