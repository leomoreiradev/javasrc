package upcasting_downcasting;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAcount bacc = new BusinessAcount(1002, "Maria",0.0,  500.0);

        //upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Ana",0.0, 0.01);

        //downcasting
        //fazendo o casting manual
        BusinessAcount acc4 = (BusinessAcount) acc2;
        acc4.loan(100.0);

        //BusinessAcount acc5 = (BusinessAcount) acc3;

        if(acc3 instanceof BusinessAcount){
            BusinessAcount acc5 = (BusinessAcount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("update");
        }


    }
}
