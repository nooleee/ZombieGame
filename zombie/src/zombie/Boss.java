package zombie;

public class Boss extends Zombie{
//	public Boss(int pos, int hp, int max) {
//		super(pos, hp, max);
//		// TODO Auto-generated constructor stub
//	}

	private int shield;
	

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

}
