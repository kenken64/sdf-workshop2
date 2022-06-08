package vtp2022.day2.workshop;

import vtp2022.day2.BankAccount;

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
        bkAcc.withdraw("20");
        System.out.println("My new account balance >" + bkAcc.getBalance());
        bkAcc.withdraw("500");
        System.out.println("My new account balance >" + bkAcc.getBalance());
    }
}
