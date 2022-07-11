package GenericLibrary;

import java.util.Random;

/**
 * This class contains java specific generic methods
 * @author Chaitra M
 *
 */
public class JavaLibrary {
	
	
	/**
	 * This method will generate the random number
	 * @return
	 */
	public int getRandomNumber()
	{
		Random ran = new Random();
		int random = ran.nextInt(200);
		return random;
	}

	
	
}
