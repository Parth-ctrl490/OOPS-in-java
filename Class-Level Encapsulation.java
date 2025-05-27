//. Class-Level Encapsulation i.e.Encapsulation at the class level: 
encapsulates the entire logic into a class.
class BankAccount{
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;

    }
    public double getBalance(){
        return balance;
    }
}
//main statement in yoyo3
