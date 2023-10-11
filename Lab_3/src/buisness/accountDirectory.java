/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class accountDirectory {
    
    private ArrayList<account> accountList;
    
    public accountDirectory(){
        this.accountList = new ArrayList<account>();
    }

    public ArrayList<account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<account> accountList) {
        this.accountList = accountList;
    }
    
    public account addAccount(){
        account Account = new account();
        accountList.add(Account);
        return Account;
    }
    
    public void deleteAccount(account Account){
        accountList.remove(Account);
    }
    
    public account searchAccount(String accountNumber){
        for (account Account : accountList){
            if (Account.getAccountNumber().equals(accountNumber)){
                return Account;
            }
        }
        return null;
    }

    public boolean isAccountandRoutingNumberUnique(String accountNumber, String routingNumber) {
        for (account Account : accountList){
            if ((Account.getAccountNumber() == accountNumber) || (Account.getRoutingNumber() == routingNumber)){
                return false;
            }
        }
        return true;
    }
    
}
