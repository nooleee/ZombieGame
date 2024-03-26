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
		if(unit instanceof Boss) {
			power = getRan().nextInt(getMax()) + 1;
			
		}
		else {
			
		}
	}
	
	// 체력회복
	public void recovery() {
		if(count > 0) {
			setHp(getHp() + 100);
			System.out.printf("[체력 회복] 현재 체력	 : %d", getHp());
			count--;
		} else
			System.err.println("보유중인 포션이 없습니다.");
		
	}

}
