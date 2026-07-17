import java.util.Scanner;

public class ScannerDemo {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter your Roll number : ");
        int age = sc.nextInt();
        
        System.out.print("Enter your Branch : ");
        String branch = sc.nextLine();
        sc.nextLine();
        
        System.out.print("Enter your Age : ");
        int rollnumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your College : ");
        String college = sc.nextLine();


        System.out.print("Enter your CGPA : ");
        float cgpa = sc.nextFloat();

        System.out.println(".... Student Details ....");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Branch : " + branch);
        System.out.println("College : " + college);
        System.out.println("RollNumber : " + rollnumber);
        System.out.println("CGPA : " + cgpa);
        

        sc.close();

    }
}
