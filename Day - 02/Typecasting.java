public class Typecasting
{
	public static void main(String[] args)
		{
			//implicit casting
			
			int value = 1000;
			double number = value;
			System.out.println("Implicit casting : " + number);
			
			//explicit casting
			
			double big = 4.5566;
			int small = (int) big;
			System.out.println("Explicit Casting : " + small);
			
			//character to integer
			
			char ch = 'P';
			int ascii = (int) ch;
			System.out.print("ASCII value : " + ascii);
		}
}

