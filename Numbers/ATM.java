import java.util.Scanner;

public class ATM{
    public static void main(String args[]){
        int balance=100000, withdraw, deposit;
        Scanner nc=new Scanner(System.in);
        
        while(true){
            System.out.println("Automatic Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the operation you want to perform: ");
            
            int choice=nc.nextInt();
            switch(choice){
                case 1: System.out.print("Enter money to withdraw: ");
                        withdraw=nc.nextInt();
                        if(balance>=withdraw){
                            balance=balance-withdraw;
                            System.out.println("Please collect your money");
                        }
                        else{
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;
                case 2: System.out.print("Enter money to deposit: ");
                        deposit=nc.nextInt();
                        balance=balance+deposit;
                        System.out.println("Your money has been  sucessfully deposited");
                        System.out.println("");
                        break;
                case 3: System.out.println("Balance: "+balance);
                        System.out.println("");
                        break;
                case 4: System.exit(0);
            }
        }
    }
}