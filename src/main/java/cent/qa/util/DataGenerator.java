package cent.qa.util;

import cent.qa.base.TestBase;
import java.util.Random;

public class DataGenerator extends TestBase {
	
	public static int generateRandomNumber(int range) {
		
		Random rand = new Random();
		// Obtain a number between [0 - 49].
		int n = rand.nextInt(range);
		return n	;
	}

}
