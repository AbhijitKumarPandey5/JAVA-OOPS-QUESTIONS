import java.util.Scanner;

class ATM{
	float  Balance;
	int PIN = 97083;
	
	public void checkPin() {
		System.out.println("Enter your Pin");
		Scanner sc = new Scanner(System.in);
		int enteredPin  = sc.nextInt();
		if(enteredPin  == PIN) {
			menu();
		}
			else {
				System.out.println("Enter a Valid Pin ");
				menu();
			}
		}
				
			 
		 
		 
	 
	 

	public void menu() {
		 System.out.println("Enter your Choice");
		 System.out.println("1. Check A/c Balance");
		 System.out.println("2. Withdraw Money ");
		 System.out.println("3. Deposite Money ");
		 System.out.println("4. Exict");
		 
		 Scanner sc = new Scanner (System.in);
		 int option = sc.nextInt();
		 
		 if(option==1) {
			 checkBalance();
		
	}
		 else if(option==2) {
			 withdraw();
		 }
		 else if(option==3) {
			 depositeMoney();
		 }
		 else if(option==4) {
			 return;
		 }
		 else {
			 System.out.println("Enter A Valid Choice");
		 }
	}
	public void checkBalance() {
		System.out.println("Balance " + Balance);
		menu();
	}
	public void withdraw() {
		System.out.println("Enter Amount to Withdraw");
		Scanner sc = new Scanner (System.in);
		float amount = sc.nextInt();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance-amount;
			System.out.println("Money withdraw seccesful");
		}
		menu();
		
	}
	public void depositeMoney() {
		System.out.println("Enter the amount ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextInt();
		Balance = Balance+amount;
		System.out.println("Money Deposite succsecfull");
		menu();
	}
	
}
public class ATM_Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM  obj = new ATM ();
		obj.checkPin();
		

	}

}
