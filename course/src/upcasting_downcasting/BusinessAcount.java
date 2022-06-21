package upcasting_downcasting;

public class BusinessAcount extends Account {

    private Double loanLimit;

    public BusinessAcount() {
        super();
    }

    public BusinessAcount(Integer number, String holde, Double balance, Double loanLimit) {
        super(number, holde, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if(amount <= loanLimit){
           balance += amount - 10.0;
        }

    }
}
