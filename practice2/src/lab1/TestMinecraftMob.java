package lab1;

public class TestMinecraftMob {

	public static void main(String[] args) {
		MinecraftMob cow = new MinecraftMob(McMobType.COW, false);
		MinecraftMob zombie = new MinecraftMob(McMobType.ZOMBIE, 15, true);
		
		System.out.println(zombie.isHostile());
		
		System.out.println(MinecraftMob.allMobsInfo());
	}

}
