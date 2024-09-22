package lab1;

import java.util.Vector;

public class MinecraftMob {

	private static Vector<MinecraftMob> mobList = new Vector<>(); // static non-final
	private static final int MAX_HP = 20; // static final

	private final McMobType mobType; // final non-static
	private boolean isHostile;
	private int hp = MAX_HP;

	{ // initialization block
		MinecraftMob.mobList.add(this);
	}

	public MinecraftMob(McMobType mobType) {
		this.mobType = mobType;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp >= 0 && hp <= MAX_HP) {
			this.hp = hp;
		} else {
			throw new IllegalArgumentException("HP can only be between 0 and 20");
		}
	}

	public MinecraftMob(McMobType mobType, int hp) {
		this(mobType);
		this.setHp(hp);
	}

	public MinecraftMob(McMobType mobType, boolean isHostile) {
		this(mobType);
		this.isHostile = isHostile;
	}

	public MinecraftMob(McMobType mobType, int hp, boolean isHostile) { // overloading
		this(mobType, hp);
		this.isHostile = isHostile;
	}

	public McMobType getMobType() {
		return this.mobType;
	}

	public boolean isHostile() { // read-only field
		return this.isHostile;
	}

	public String toString() {
		String strRepr = "A ";
		if (this.isHostile()) {
			strRepr += "hostile ";
		} else {
			strRepr += "non-hostile ";
		}
		strRepr += String.format("%s with HP of %d", this.mobType, this.hp);
		return strRepr;
	}

	public static String allMobsInfo() { // static method
		String strRepr = "";
		for (int i = 0; i < MinecraftMob.mobList.size(); i++) {
			strRepr += (MinecraftMob.mobList.get(i).toString() + "\n");
		}
		;
		return strRepr;
	}

}
