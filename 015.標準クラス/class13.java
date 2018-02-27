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
public class class13 {
    public static void main(String[] args){
     try{
        String word = "Aめ\r\n";
               word = word.replace("A" , "あ"); 
        Date end = new Date();
    SimpleDateFormat sdf2 =
            new SimpleDateFormat("処理を終了しました。　yyyy年MM月dd日 HH時mm分ss秒\r\n");
        File fp = new File("time.txt");
        FileWriter fw = new FileWriter(fp, true);
        fw.write(word);
        fw.write(sdf2.format(end));
        fw.close();
    
    }catch(IOException e){
    e.printStackTrace();
    }
    
}
}

