/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec3;

import java.io.Serializable;

/**
 *
 * @author corei5
 */
public class account implements Serializable {
    private String accNum;
    private String name;
    private String othername;
    private int accType;
    private float balance;

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public int getAccType() {
        return accType;
    }

    public void setAccType(int accType) {
        this.accType = accType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public account(String accNum, String name, String othername, int accType, float balance) {
        this.accNum = accNum;
        this.name = name;
        this.othername = othername;
        this.accType = accType;
        this.balance = balance;
    }
    
    public void calculateInterest(){
        if(this.accType == 1){
           this.balance = (float) (this.balance *1.04);
        }
        if(this.accType == 2){
           this.balance = (float) (this.balance *1.05);
        }
        if(this.accType == 3){
           this.balance = (float) (this.balance *1.01);
        }
    
    
    }
}
