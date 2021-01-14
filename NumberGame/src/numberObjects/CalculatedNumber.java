package numberObjects;

//An intermediary number formed from 2 BaseNumbers to assist in calculating TargetNumber
public class CalculatedNumber extends Number {
	
	Number number1;
	Number number2;
	Operator operator;
	
	public CalculatedNumber(int x) {
		super(x);
	}
	
	@Override
	public String getNumberType() {
		return "C";
	}
	
	

}
