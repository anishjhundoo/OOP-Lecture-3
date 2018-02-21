/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author corei5
 */
public class writer {
    public static void main(String[] args){
    
        account acc1 = new account("1","Buldan","Kishan",1,12000);
         account acc2 = new account("2","Partaub","Manish",2,13000);
          account acc3 = new account("3","Sookrah","Akash",3,12000);
            account acc4 = new account("4","Chuckun","Vidharh",1,18000);
        
            acc1.calculateInterest();
            acc2.calculateInterest();
            acc3.calculateInterest();
            acc4.calculateInterest();
            
            String file = "account.dat";
            try{
                FileOutputStream fos = new FileOutputStream(new File(file));
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                
               oos.writeObject(acc1);
               oos.writeObject(acc2);
               oos.writeObject(acc3);
               oos.writeObject(acc4);
                
               fos.close();
               oos.close();
               
               System.out.println("Writing Done !!!");
 
            
            } catch (FileNotFoundException ex) {
            Logger.getLogger(writer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
