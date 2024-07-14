/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_230424;

/**
 *
 * @author Afdila Sandi
 */
public class Student extends Person {
    public Student(){
        super();
        super.name="Alex";
        super.address="Padang";
        System.out.println("Person Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student:getName");
        return name;
    }
}
