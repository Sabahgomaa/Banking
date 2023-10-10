/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 *
 * @author star
 */
public class Withdraw  extends transaction{
    Account acc =new Account();
    double amount;
    @Override
    public double execute() {
       acc.balance=acc.balance-amount;
        return acc.balance;
    }
    
}
