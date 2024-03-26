package zombie;

import java.util.Random;

abstract public class Unit {
	private int hp;
	private int pos;
	private int max;
	private Random ran = new Random();
	
	public Unit(int pos, int hp, int max) {
		this.hp = hp;
		this.pos = pos;
		this.max = max;
	}
	
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	public int getPos() {
		return this.pos;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getMax() {
		return this.max;
	}
	
	public Random getRan() {
		return this.ran;
	}
	
	abstract void attack(Unit unit);

}
