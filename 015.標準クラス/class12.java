/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaclass;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
/**
 *
 * @author guest1Day
 */
public class class12 {
    public static void main(String[] args){
    
    try{
        String word = "Aめ\r\n";
        
        Date start = new Date();
    SimpleDateFormat sdf1 =
            new SimpleDateFormat("処理を開始しました。　yyyy年MM月dd日 HH時mm分ss秒\r\n");
    
        File fp = new File("time.txt");
    
        FileWriter fw = new FileWriter(fp);
      
        fw.write(word);
        fw.write(sdf1.format(start));
         
        fw.close();
    
    }catch(IOException e){
    e.printStackTrace();
    }
    }
}
