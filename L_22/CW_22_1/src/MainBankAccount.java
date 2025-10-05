import java.util.Arrays;

public class MainBankAccount {
    public static void main(String[] args) {

        BankAccount[] accounts={
                new BankAccount("DE12341234", new Person("Jack",123),1000),
                new BankAccount("DE23452345", new Person("Bob",234),550),
                new BankAccount("DE34563456", new Person("John",345),800)
        };
        System.out.println(Arrays.toString(accounts));
        print(accounts);

        System.out.println("===================");
        accounts[0].deposit(1000);
        System.out.println(accounts[0].bankAccountInfo());
        System.out.println(accounts[0].getBalance());

        accounts[0].withdraw(5000);
        System.out.println(accounts[0].bankAccountInfo());

    }

    private static void print(BankAccount[] accounts) {
        for (int i=0; i< accounts.length; i++){
            System.out.println((i+1)+". "+ accounts[i].bankAccountInfo());
        }
    }
}