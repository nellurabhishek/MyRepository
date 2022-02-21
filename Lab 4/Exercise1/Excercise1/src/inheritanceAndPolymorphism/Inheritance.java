package inheritanceAndPolymorphism;

public class Inheritance {
	
	public static void main(String [] args)
	{
		Person p1 = new Person("Smith ", 21);
		Person p2 = new Person("Kathy ", 26);
		
		Account acc1 = new Account(1111, 2000, p1);
		Account acc2 = new Account(2222, 3000, p2);
		
		acc1.deposit(2000);
		System.out.println("Smith's account balance is Rs "+acc1.getBalance());
		
		acc2.withdraw(2000);
		System.out.println("Kethy's account balance is Rs "+acc2.getBalance());
		
		CurrentAccount c = new CurrentAccount();
		SavingAccount s = new SavingAccount();
		
		c.deposit(2000);
		s.deposit(2000);
		
		doWithdrawal(c);
		doWithdrawal(s);
		
	}

	private static void doWithdrawal(Account acc) 
	{
		boolean result = acc.withdraw(1000.00);
		if(result)
		{
			System.out.println("Withdraw Successful");
			
		}
		else
		{
			System.out.println("Withdraw Failed");
		}
	}


}
