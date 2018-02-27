/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaclass;

import java.io.*;
/**
 *
 * @author guest1Day
 */
public class class10 {
    public static void main(String[] args){
    
    try{
        
        File fp = new File("text.txt");
    
        FileWriter fw = new FileWriter(fp);
    
        fw.write("猪八重佑太です");
    
        fw.close();
    
    }catch(IOException e){
    e.printStackTrace();
    }
    }
    
}
