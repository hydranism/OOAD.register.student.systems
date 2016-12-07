/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Editor by Mr.sirasit kongsangdao 
 */
package course;

/**
 *
 * @author LoveZ
 */
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Register {
    public static String ID_Student;
    public static String ID_Course;
    public static String Str;
    public static int num;
    
    public static void registerStd() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 //Scanner sc = new Scanner(System.in);
        try {
            BufferedWriter out = new  BufferedWriter(new FileWriter("Register.dat",true));
            
            System.out.print(" Input Student ID : ");
            ID_Student = br.readLine();
            
            System.out.print(" Input Course ID : ");
            ID_Course = br.readLine();
            
            out.write(ID_Student+" "+ID_Course+"\r\n");
            
            out.close();
            System.out.println("\n** File created successfully\n");
        }
        catch (IOException e) {
        } 
    }
}
