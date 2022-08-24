/*
 * Author Name: Revathi
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

public class SavingsAccountImpl {
    public static void main(String[] args) {


    // object declaration and initialization
    SavingsAccount savingsAccount = new SavingsAccount(56789789 , "Revathi", 2000.0,"Active");

    // calling methods
        System.out.println(savingsAccount.DebitCash(1700.0));
        System.out.println(savingsAccount.CreditCash(355.0));
        System.out.println(savingsAccount.RetrieveCash(563.0));

    }
}
