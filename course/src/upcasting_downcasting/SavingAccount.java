package upcasting_downcasting;

public class SavingAccount  extends Account{
    private Double interestRate;

    public SavingAccount() {
        super();
    }

    public SavingAccount(Integer number, String holde, Double balance, Double interestRate) {
        super(number, holde, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}
