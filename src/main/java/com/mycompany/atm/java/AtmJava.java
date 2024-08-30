/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atm.java;

import java.util.Scanner;

/**
 *
 * @author EliudKariz
 */
public class AtmJava {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        final String PASSWORD = "Eliud123";
        
        //read entered password..
        String enteredPassword = null;
        System.out.println("Hello Eliud! Welcome back to our services");
        
        //the do statements starts here..
        do{
            //Password section
            System.out.println("Enter Password:");
            enteredPassword = inputs.nextLine();
            // An if statement...
            if(!enteredPassword.equals(PASSWORD)){
                System.out.println("Invalid Password, please try again!!");
                
            }
        }while(!enteredPassword.equals(PASSWORD));
        System.out.println("Login Successfull");
        System.out.println("=========================");
        
        //scanner to read amount...
        Scanner myAmount = new Scanner(System.in);
        //the final amount..
        final int BALANCE = 50000;
        int Opt;
        System.out.println("1. Withdraw money.");
        System.out.println("2. Deposit Money.");
        Opt = myAmount.nextInt();
        while(Opt<1||Opt>2){
            System.out.print("Please enter a valid option!!:  ");
            System.out.print("");
            System.out.print("");
            Opt = myAmount.nextInt(); 
        }
        switch(Opt) {
            case 1:
                int enteredAmount;
                
                System.out.println("Enter Amount for Withdrawal:");
                System.out.print("============================");
                enteredAmount = myAmount.nextInt();
                if(enteredAmount<=BALANCE){
                    System.out.println("Withdrawal Successful" + enteredAmount);
                    System.out.println("========================");
                    int newBalance = BALANCE - enteredAmount;
                    System.out.println("Confirmed!! Your balance is:" + newBalance );
            
            
                }else{
                    System.out.println("Dear Eliud, You have Insufficient funds!!, please try a lower amount");
                    while(enteredAmount>BALANCE){
                        System.out.println("Try a Lower Amount");
                        System.out.println("");
                        enteredAmount = myAmount.nextInt();
                        int newBalance = BALANCE - enteredAmount;
                        System.out.println("Confirmed!! Your balance is:" + newBalance );
                    }
                   
                }
                break;
            case 2:
                int deposits;
                System.out.println("Enter amount to Deposit");
                System.out.print("============================");
                deposits = myAmount.nextInt();
                //the if statements ...
                if(deposits<=BALANCE||deposits>=BALANCE){
                    System.out.println("You have succesfully Deposited:" + deposits);
                    System.out.println("========================");
                    int newBalance = BALANCE + deposits;
                    System.out.println("Confirmed!! Your balance is:" + newBalance );
                    
            
                
                    
                    
                
                }    
                break;
            default :
                
                     System.out.print("Please , Enter a valid option");
                    
                      
                
                
                 
                
        }
        
              
        
    }
}
