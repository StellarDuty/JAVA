package chap2;

public class RunnableEx22 implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while(acc.getBalance() >0) {
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("����: "+money+" / balance: "+acc.getBalance());
		}

	}

}
