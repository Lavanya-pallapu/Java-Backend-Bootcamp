import java.util.Scanner;

public class ATM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int originalpin = 1515;
		double balance = 50000.00;
		
		System.out.println("===== SBI ATM ====");
		
		
		System.out.print("Enter pin : ");
		int enteredpin = sc.nextInt();
		
		if(enteredpin == originalpin)
		{
			System.out.println("\nLogin Successfull");
			
			System.out.println("\n---ATM Menu---");
			System.out.println("1.Check Balance");
			System.out.println("2.Withdraw cash");
			System.out.println("3.Deposit cash");
			
			System.out.println("\n Enter your choice : ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("Available Balance : " + balance);
			}
			
			if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

           if (balance >= amount) {
               balance = balance - amount;
               System.out.println("Please collect your cash");
               System.out.println("Remaining Balance: " + balance);
    }
}
			if (choice == 3) {
				System.out.println("Enter deposit amount :");
				double amount = sc.nextDouble();
				
				balance = balance + amount;
				
				System.out.println("Amount Deposited Successfully.");
				System.out.println("Remaining Balance : " + balance);
				
			}
					
		}
			
			System.out.println("\nThanks for using SBI ATM.");
			
			sc.close();
		
	}
}