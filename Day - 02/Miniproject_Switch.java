import java.util.Scanner;

public class Miniproject_Switch
{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n----Menu----");
		
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		
		
		System.out.println("Enter First number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		switch (choice)
		{
		case 1 :
			{
				System.out.println("Addition : " + (num1 + num2));
				break;
			}
		case 2 :
			{
				System.out.println("Subtraction : " + (num1 - num2));
				break;
			}
		case 3 :
			{
				System.out.println("Multiplication : " + (num1 * num2));
				break;
			}
		case 4 :
			{
				System.out.println("Division : " + (num1 / num2));
				break;
			}
		case 5 :
			{
				System.out.println("Modulus : " + (num1 % num2));
				break;
			}
		default :
			{
				System.out.print("Invalid choice");
			}
		
		}
		
		sc.close();
	}
}