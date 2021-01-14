package game;

import numberObjects.*;
import numberObjects.Number;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
	
	public static void main(String[] args) {
		GeneratePuzzle puzzle = new GeneratePuzzle();
		ArrayList<BaseNumber> result = puzzle.generate();
		System.out.println(result);
	}

}
