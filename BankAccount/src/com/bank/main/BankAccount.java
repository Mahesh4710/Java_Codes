package com.bank.main;

import java.util.Scanner;

public class BankAccount {
    String acNumber;
    long acBalance;
    String accountHolderName;
    
    BankAccount(String acNum,String acName,long acBal){
    	this.acNumber=acNum;
    	this.acBalance=acBal;
    	this.accountHolderName=acName;
    }

    long deposit() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount to deposit:");
        long depositAmount = in.nextLong();
        return acBalance + depositAmount;
    }

    long withdraw() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        long withdrawAmount = in.nextLong();
        return acBalance - withdrawAmount;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder name:");
        String accountHolderName = sc.nextLine();
        System.out.println("Enter account number:");
        String acNumber = sc.nextLine();
        System.out.println("Enter account balance:");
        long acBalance = sc.nextLong();
        BankAccount mychoice = new BankAccount(acNumber,accountHolderName,acBalance);
        
        

        System.out.println("What do you want?\n1. Deposit\n2. Withdraw");
        int choice = sc.nextInt();

        switch(choice) {
        case 1:
            acBalance = mychoice.deposit();
            System.out.println("After deposit, account balance of " + accountHolderName + " is: " + acBalance);
            break;
        case 2:
            acBalance = mychoice.withdraw();
            System.out.println("After withdraw, account balance of " + accountHolderName + " is: " + acBalance);
            break;

            default:
                System.out.println("Enter valid choice!");
                break;
        }

    }
}
