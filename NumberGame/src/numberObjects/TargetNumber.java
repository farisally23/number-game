package numberObjects;


//A goal number that the user must calculate to solve the level
public class TargetNumber extends Number {
	
	// Note: A TargetNumber can potentially have a solution besides this one!
	public Solution solution;
	
	public TargetNumber(int x) {
		super(x);
	}
	
	public void setSolution(Solution solution) {
		this.solution = solution;
	}
	
	public Solution getSolution() {
		return this.solution;
	}

	@Override
	public String getNumberType() {
		return "T";
	}
}
