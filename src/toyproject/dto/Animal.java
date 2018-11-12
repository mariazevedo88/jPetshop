package toyproject.dto;

public class Animal {

	private boolean isPet;
	private String owner;
	private String clazz;
	
	/**
	 * @param isPet
	 * @param owner
	 * @param clazz
	 */
	public Animal(boolean isPet, String owner, String clazz) {
		super();
		this.isPet = isPet;
		this.owner = owner;
		this.clazz = clazz;
	}
	
	public Animal(){}
	
	/**
	 * @return the isPet
	 */
	public boolean isPet() {
		return isPet;
	}
	/**
	 * @param isPet the isPet to set
	 */
	public void setPet(boolean isPet) {
		this.isPet = isPet;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @return the clazz
	 */
	public String getClazz() {
		return clazz;
	}
	/**
	 * @param clazz the clazz to set
	 */
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	
	@Override
	public String toString() {
		return getOwner() + " - " + getClazz() + " - " + isPet();
	}
}
