/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.controllers;

/**
 *
 * @author BotZ
 */
public class CurrentAccount {
    
    private String name;
    private String id;
    private String pin;
    private float balance;
    
    public CurrentAccount(String id, String name, String pin, String balance){
        
        this.name = name;
        this.pin = pin;
        this.id = id;
        this.balance = Float.parseFloat(balance);
        
    }
    
    public String getID()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getPin()
    {
        return this.pin;
    }
    
    public float getBalance()
    {
        return this.balance;
    }
    
    public void getDetails()
    {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.pin);
        System.out.println(this.balance);
        
    }
    
}
