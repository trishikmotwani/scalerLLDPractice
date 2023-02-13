package addersubtractorusingsynchronizedmethod;

public class Count {
	private int value = 0;

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public synchronized void updateValueWithOffset(int offset) {
		this.value = value + offset;
	}
	
}
