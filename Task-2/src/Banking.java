
public class Banking {
	public String username;
	public int acc_no;

	public Banking(String name,int acc) {
		username=name;
		acc_no=acc;
	}
	
	int balance=5000;
	public int  bal() {
		balance=5000;
		return balance;
	}
	
	public int deposit(int a) {
		
		balance=balance+a;
		return balance;
	}
	
   public int withdraw(int a)
   {
	   balance=balance-a;
	   return balance;
   }
   
   public void display() {
	   System.out.println("-------------------------");
	   System.out.println("Account Holder Name: "+username);
	   System.out.println("Account NO: "+acc_no);
	   System.out.println("Balance: "+balance);
	   System.out.println("-------------------------");
   }
   
   
}
