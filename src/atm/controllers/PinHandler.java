/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.controllers;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


/**
 *
 * @author BotZ
 */
public class PinHandler {
    
    CurrentAccount account;

    public CurrentAccount checkPin(String userPin)
    {
        
        String filePath = "res/accounts.csv";
        String line;
        String csvSplitBy = ",";
        
        //ArrayList<ArrayList<String>> accounts = new ArrayList<ArrayList<String>>();
      
        
        //int row, col;
        
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            while((line = reader.readLine()) != null)
            {
                String[] values = line.split(csvSplitBy);

                if(values[2].equals(userPin))
                {
                    this.account = new CurrentAccount(values[0], values[1], values[2], values[3]); 
                    
                }
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        
        return this.account;
      
    }
    
    



}
