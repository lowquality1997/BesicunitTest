

public class BankAccountTest {

	public void testDeposit() {
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(acc.getBalance(),50);
	}


	public void testWithdraw() {
	
			BankAccount acc = new BankAccount(75);
			acc.withdraw(50);
			assertEquals(acc.getBalance(),25);
		
	}

	private void assertEquals(int balance, int i) {
		// TODO Auto-generated method stub
		
	}}
