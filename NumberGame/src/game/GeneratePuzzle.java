package game;

import numberObjects.*;
import numberObjects.Number;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratePuzzle {
	
	Number number;
	
	public ArrayList<BaseNumber> generate() {
		// Randomly select n BaseNumbers from a-b
		int n = 3;
		int a = 1;
		int b = 9;
		ArrayList<BaseNumber> baseNumbers = new ArrayList<BaseNumber>();
		
		while (baseNumbers.size() < n) {
			BaseNumber randomNum = new BaseNumber(ThreadLocalRandom.current().nextInt(a, b + 1));
			baseNumbers.add(randomNum);
		}
		
		
		// Randomly use operators on BaseNumbers
		return baseNumbers;
			
	}
	
	public ArrayList<TargetNumber> generateTargetNumbers(ArrayList<BaseNumber> baseNumbers) {
		ArrayList<TargetNumber> targets = new ArrayList<TargetNumber>();
		
		//Test
		return targets;
	}

}
