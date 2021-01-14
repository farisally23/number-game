package numberObjects;

import java.util.ArrayList;

public class Puzzle {
	
	ArrayList<BaseNumber> baseNumbers;
	ArrayList<TargetNumber> targetNumbers;
	ArrayList<Operator> operators;
	
	public ArrayList<BaseNumber> getBaseNumbers() {
		return baseNumbers;
	}
	public void setBaseNumbers(ArrayList<BaseNumber> baseNumbers) {
		this.baseNumbers = baseNumbers;
	}
	public ArrayList<TargetNumber> getTargetNumbers() {
		return targetNumbers;
	}
	public void setTargetNumbers(ArrayList<TargetNumber> targetNumbers) {
		this.targetNumbers = targetNumbers;
	}
	public ArrayList<Operator> getOperators() {
		return operators;
	}
	public void setOperators(ArrayList<Operator> operators) {
		this.operators = operators;
	}
	
	

}
