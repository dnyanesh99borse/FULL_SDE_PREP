//---------ENCAPSULATION-----------

class BankAccount{
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}

public class Encapsulation{
    public static void main(String[] args){
        BankAccount acc = new BankAccount();

        acc.deposit(5000);
        acc.withdraw(1000);

        System.out.println(acc.getBalance());
    }
}