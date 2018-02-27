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
public class class11 {
    public static void main(String[] args){
    try{
        File fp = new File("text.txt");
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);
        System.out.print(br.readLine());
        br.close();
    }catch(IOException e){
    e.printStackTrace();
    }
}
}
