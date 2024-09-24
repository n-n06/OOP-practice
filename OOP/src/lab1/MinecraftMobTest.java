package lab1;

public class MinecraftMobTest {

	public static void main(String[] args) {
		MinecraftMob cow = new MinecraftMob(McMobType.COW, false);
		MinecraftMob zombie = new MinecraftMob(McMobType.ZOMBIE, 15, true);

		System.out.println(zombie);

		System.out.println(MinecraftMob.allMobsInfo());
	}

}
