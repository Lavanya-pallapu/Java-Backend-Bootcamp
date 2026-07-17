import java.util.Scanner;

public class Else_If
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter yor marks : ");
		int marks = sc.nextInt();
		
		if (marks < 0 || marks > 100)
		{
			System.out.print("Invalid marks");
		}
		else if (marks >= 95)
		{
			System.out.print("Grade A");
		}
		else if (marks >= 85)
		{
			System.out.print("Grade B");
		}
		else if (marks >= 75)
		{
			System.out.print("Grade C");
		}
		else if (marks >= 65)
		{
			System.out.print("Grade D");
		}
		else
		{
			System.out.print("Fail");
		}
		
		sc.close();
	}
}