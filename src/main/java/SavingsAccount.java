/*
 * Author Name: Revathi
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

public class SavingsAccount {
    // Attributes
    long accountNumber;
    String accountName;
    double accountBalance;
    String accountStatus;
    // constructor
    public SavingsAccount(long accountNumber, String accountName, double accountBalance, String accountStatus) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
    }

    public SavingsAccount() {

    }

    public double DebitCash(double cash){
        return cash = this.accountBalance - cash;
    }
    public double CreditCash(double cash){
        return cash = this.accountBalance + cash;
    }
    public double RetrieveCash(double cash){
        return cash;
    }
}

