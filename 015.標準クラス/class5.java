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
import java.util.Date;
import java.text.SimpleDateFormat;

public class class5 {
    public static void main(String[] args){
    
    Date day = new Date(1478221200000L);
    System.out.println(day.getTime());
    
    SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.print(sdf.format(day));
    } 
}
