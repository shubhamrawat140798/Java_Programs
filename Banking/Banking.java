class Account{
	int account_no;
	String name;
	double amount;
	void insertRecord(int r, String s, double t){
		account_no = r;
		name = s;
		amount = t;	
	}
	void display(){
		System.out.println(" Account No. : "+account_no);
		System.out.println(" Name : "+name);
		System.out.println(" Amount : "+amount);
	}
	void deposit(int a){
		amount = amount + a;
	}
	void withdraw(int b){
		amount = amount - b;
	}
	public static void main(String args[]){
		Account c1 = new Account();
		Account c2 = new Account();
		c1.insertRecord(1001,"Lucky Singh",20000);
		c1.display();
		c1.deposit(1000);
		c1.withdraw(500);
		c1.display();
		c2.insertRecord(1002,"Rajveer Singh",120000);
		c2.display();
		c2.deposit(15000);
		c2.withdraw(50000);
		c2.display();

	}
}
