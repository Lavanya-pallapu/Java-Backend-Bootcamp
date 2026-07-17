import java.util.Scanner;

public class Nested_if
{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter percentage : ");
		double percentage = sc.nextDouble();
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		if (percentage >= 60)
		{
			System.out.println("Yes");
		
	    	if (age >= 18)
			{
				System.out.println("Admission Approved");
			}
			
		    else {
			   System.out.print("Admission Rejected");
		     }
		}
		else {
			System.out.println("Admission Rejected");
		}
		sc.close();
	}
}