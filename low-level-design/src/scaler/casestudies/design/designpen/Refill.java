package scaler.casestudies.designpen;

public class Refill {

	private Nib nib;
	private Ink ink;
	private RefillType type;
	
	/**
	 * @return the nib
	 */
	public Nib getNib() {
		return nib;
	}
	/**
	 * @param nib the nib to set
	 */
	public void setNib(Nib nib) {
		this.nib = nib;
	}
	/**
	 * @return the ink
	 */
	public Ink getInk() {
		return ink;
	}
	/**
	 * @param ink the ink to set
	 */
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	/**
	 * @return the type
	 */
	public RefillType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(RefillType type) {
		this.type = type;
	}
}
