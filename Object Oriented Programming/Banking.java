class Account{
    int acc_no;
    String name;
    float amount;
    
    void insert(int a, String n, float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+" Rs. has been deposited in the account");
    }
    
    void withdraw(float amt){
        if(amount<amt)
            System.out.println("\n Insufficient Balance");
        else{
            amount=amount-amt;
            System.out.println(amt+" Rs. has been withdrawn from the account");
        }
    }
    
    void checkBalance(){
        System.out.println("\n Balance is: "+amount);
    }

    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}

public class Banking{
    public static void main(String args[]){
        Account a1= new Account();
        a1.insert(12564643, "Madhav", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(400000);
        a1.checkBalance();
        a1.withdraw(20000);
        a1.checkBalance();
    }
}