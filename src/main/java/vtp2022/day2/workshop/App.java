package vtp2022.day2.workshop;

import vtp2022.day2.workshop.account.BankAccount;
import vtp2022.day2.workshop.account.FixedDepositAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My ATM Machine - POSSBank" );
        BankAccount bkAcc= new BankAccount("Kenneth Bank Acoount");
        bkAcc.deposit("1000");
        System.out.println("My new account balance >" + bkAcc.getBalance());
        //bkAcc.deposit("9999999999999999999999999999999999999999999");
        //System.out.println("My new account balance >" + bkAcc.getBalance());
        System.out.println("Withdraw 20 -> My new account balance >" 
            + bkAcc.withdraw("20"));
        System.out.println("Withdraw 500 -> My new account balance >" 
            + bkAcc.withdraw("500"));

        FixedDepositAccount fdAcc = 
                new FixedDepositAccount("My FD acc", 10000);

        System.out.println("1. Fixed Deposit Acc balance > " + fdAcc.getBalance());
        fdAcc.setDurationAndInterest(4, 12);
        System.out.println("2. Fixed Deposit Acc balance > " + fdAcc.getBalance());
        fdAcc.setDurationAndInterest(5, 6);
        
        
        

    }
}
