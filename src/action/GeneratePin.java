package action;

public class GeneratePin {
	
	public static String generatePin()
	{
		String msg;
		
		int randomNo = (int)(Math.random()* 9000) + 1000;
		msg = String.valueOf(randomNo);
		return msg;
	}

}
