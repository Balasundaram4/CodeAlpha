import java.util.Scanner;

public class Bank_details {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter name: ");
		String a=scanner.nextLine();
		
		System.out.print("Enter Account Number: ");
		int b=scanner.nextInt();
		scanner.nextLine();
		Banking obj=new Banking(a,b);
		obj.display();
		System.out.println("*** To Withdraw  (0+enter), To Deposit (1+enter) ***");
		
		int c= scanner.nextInt();
		if(c==1)
		{
			System.out.print("Enter deposit amount: ");
			int d=scanner.nextInt();
			obj.deposit(d);
			obj.display();	
		}
		
		else if(c==0)
		{
			System.out.print("Enter withdrawal amount: ");
			int w=scanner.nextInt();
		    obj.withdraw(w);
		    obj.display();
		}
		else
		{
			System.out.println("Invalid input, try Again");
		}
		scanner.close();
	}

}
