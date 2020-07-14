class Client{
	protected String name;	// protected variables in superclass are accessible 
	protected String ID;	// to all subclasses
	protected String address;
	
	//Constructor with two parameters
	public Client(String name, String ID){
		this.name = name;
		this.ID = ID;
	}
	
	//Constructor with three parameters
	public Client(String name, String ID, String address){
		this.name = name;
		this.ID = ID;
		this.address = address;
	}
	
}

class CashClient extends Client{

	//Constructor
	public CashClient(String name, String ID){
		super(name,ID); // Call the superclass Constructor
	}
	
	
	public void payCash(int sum){
		System.out.println(name + "(" + ID + "):" + " Amount paid " + sum + " euros.");
	}
}

class AccountClient extends Client{
	private double balance;
	
	//Constructor 1
	public AccountClient(String name, String ID){
		super(name,ID); // Call the superclass Constructor
	}
	
	//Constructor 2
	public AccountClient(String name, String ID, String address){
		super(name,ID,address); // Call the superclass Constructor
	}
	
	public void deposit(double add){
		balance += add;
	}
	
	public void withdraw(double substract){
		balance -= substract;
	}
	
	// method overriding toString()
	public String toString(){
		return (name + "(" + ID + "): " + balance);
	}	

}
