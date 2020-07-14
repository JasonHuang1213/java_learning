public class ClientRegister {
    public static void main(String args[]) {
        CashClient client1 = new CashClient("Lisa", "101070-1111");
        AccountClient client2 = new AccountClient("Benny", "101070-1111");
        AccountClient client3 = new AccountClient("Barney", "040474-1571", "Someroad 3");
        Client client4 = new Client("Client", "111170-1111", "Road 4"); 
           
        client1.payCash(70);
        client2.deposit(100);
        client3.deposit(500);
        client2.withdraw(20);
        
        System.out.println(client2);
        System.out.println(client3);
    }
}