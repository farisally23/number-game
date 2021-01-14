package numberObjects;

//A number given to the user at start of level to complete puzzle
public class BaseNumber extends Number {
	
	public BaseNumber(int x) {
		super(x);
	}

	@Override
	public String getNumberType() {
		return "B";
	}

}
