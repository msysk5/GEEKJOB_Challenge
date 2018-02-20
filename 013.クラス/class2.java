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
public class class2 {
    
public static void main(String[] args){

 Human hito = new Human();
        hito.setHuman("渡邊靖男", 52);
 Clear c = new Clear();
        c.data();
}
}

class Clear extends Human {
    public void data() {
        this.name = null;
        this.age = 0;
        System.out.println(this.name);
        System.out.println(this.age);
    }
}