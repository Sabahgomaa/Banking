/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 *
 * @author star
 */
public class BalanceInquiry extends transaction{
    Account acc =new Account();
    String currencyType;

    @Override
    public double execute() {
         System.out.println(acc.balance+" "+currencyType);
        return 0;
    }
}
