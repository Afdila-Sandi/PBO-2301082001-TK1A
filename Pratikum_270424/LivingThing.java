/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_270424;

/**
 *
 * @author Afdila Sandi
 */
public abstract class LivingThing {
 
    
    public void breath() {
        System.out.println("Living Thing breathing...");
    }
    
    public void eat() {
        System.out.println("Living Thing eating...");
    }
    
    public abstract void walk();
}
