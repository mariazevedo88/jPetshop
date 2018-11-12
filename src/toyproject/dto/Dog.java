package toyproject.dto;

public class Dog extends Animal{

	private String sound;
	private String race;
	
	public Dog(boolean isPet, String owner, String clazz) {
		super(isPet, owner, clazz);
	}
	
	public Dog(){}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}
	
}
