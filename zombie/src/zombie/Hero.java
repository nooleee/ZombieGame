package zombie;

public class Hero extends Unit{
	
	private int power;
	private int count;	

	public Hero(int pos, int hp, int max, int count) {
		super(pos, hp, max);
		this.count = count;
	}

	// 공격
	@Override
	public void attack(Unit unit) {
		if(unit instanceof Boss) 
			bossAttack(unit);
		else {
			Zombie zombie = (Zombie) unit;
			power = getRan().nextInt(getMax()) + 1;
			if(zombie.getHp() - power < 0) 
				zombie.setHp(0);
			 else 
				zombie.setHp(zombie.getHp() - power);
			System.out.printf("히어로가 %d의 공격력으로 공격 : 현재 zombie hp : %d\n", power, zombie.getHp());
		}
	}
	
	private void bossAttack(Unit unit) {
		Boss boss = (Boss) unit;
		power = getRan().nextInt(getMax()) + 1;
		if(boss.getShield() > 0) {
			int damage = boss.getShield() - power;
			if(damage >= 0) {
				boss.setShield(boss.getShield() - power);
			}
			else {
				boss.setShield(0);
				boss.setHp(boss.getHp() - damage);
			}
		}
		else {
			boss.setHp(boss.getHp() - power);
			if(boss.getHp() < 0)
				boss.setHp(0);
		}
		System.out.printf("히어로가 %d의 공격력으로 공격 : 현재 BOSS hp : %d 현재 BOSS shield : %d\n", power, boss.getHp(), boss.getShield());
		
	}
	
	// 체력회복
	public void recovery() {
		if(count > 0) {
			setHp(getHp() + 100);
			System.out.printf("[체력 회복] 현재 체력 : %d\n", getHp());
			count--;
		} else
			System.err.println("보유중인 포션이 없습니다.");
		
	}

}
