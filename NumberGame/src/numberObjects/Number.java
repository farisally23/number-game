package numberObjects;

public abstract class Number {
	
	public int value;
	
	public Number(int x) {
		value = x;
	}
	
	public abstract String getNumberType();
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String toString() {
		return String.valueOf(this.value);
	}

}
