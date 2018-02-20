/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaclass;

/**
 *
 * @author guest1Day
 */
public class class1 {
    public static void main(String[] args) {
        
        Human hito = new Human();
        hito.setHuman("渡邊靖男", 52);
      
    } 
}
 
 class Human {
    
    public String name;
    public int age;

   
    public void setHuman(String n, int a) {
        
        this.name = n;
        this.age = a;
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
}




