package practice6;

public interface HungerLevel {
	int HIGH_LEVEL = 2;
	int AVG_LEVEL = 1;
	int LOW_LEVEL = 0;
	void setHungerLevel(int hungerLevel);
	int getHungerLevel();
}
