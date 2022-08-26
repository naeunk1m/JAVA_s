package threadex;

public class BankingClient {

	public static void main(String[] args) {
		Account account = new Account(5000);
		WithdrawThread iBanking = new WithdrawThread("���ͳݹ�ŷ", account, 1000);
		WithdrawThread mBanking = new WithdrawThread("����Ϲ�ŷ", account, 1000);
		DepositThread tBanking = new DepositThread("�ڷ���ŷ", account, 10000);
		
		iBanking.start();
		mBanking.start();
		tBanking.start();
	}

}

class Account {
	int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public synchronized int withdraw(int money) {
		String threadName = Thread.currentThread().getName();
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
			System.out.println(threadName+"��� �ܾ� : "+balance);
		} else {
			System.out.println(threadName+" : �ܾ� ���� wait()ȣ��");
			try {
				this.wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return balance;
	}
	public synchronized int deposit(int money) {
		String threadName = Thread.currentThread().getName();
		balance += money;
		this.notifyAll();
		System.out.println(threadName+" : �Ա�, �ܾ�"+balance);
		return balance;
	}
}
class DepositThread extends Thread {
	Account account;
	int money;
	
	DepositThread(String name, Account account, int money){
		super(name);
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		account.deposit(money);
	}
}

class WithdrawThread extends Thread{
	Account account;
	int money;
	boolean flag = true;
	
	public WithdrawThread(String name, Account account, int money) {
		super(name);
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		for(int i = 0; i<6||flag; i++) {
			int balance = account.withdraw(money);
			if(balance <= money) flag = false;
		}
	}
}