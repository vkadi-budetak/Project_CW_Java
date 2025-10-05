public class BankAccount {
    private String iban;
    private Person owner;
    private double balance;

    public BankAccount(String iban, Person owner, double balance) {
        if (iban.length()==10 && iban.startsWith("DE"))
            this.iban = iban;
        else
            System.out.println("IBAN not valid: "+iban);
        this.owner = owner;
        this.balance = balance;
    }

    public String bankAccountInfo(){
        return iban + " " + balance + "$ " + owner.personInfo();
    }

    public void deposit(double amount){
        if (amount>0)
            balance+=amount;
    }

    public void withdraw(double amount){
        if (amount>0 && amount<=balance)
            balance-=amount;
        else
            System.out.println("Error, withdraw not valid!!!  "+amount);
    }

    public double getBalance(){
        return balance;
    }

}
