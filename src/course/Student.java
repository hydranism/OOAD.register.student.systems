/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Editor by Mr.sirasit kongsangdao 
 */
package course;
import java.io.*;
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author LoveZ
 */
public class Student {
    public static String IDStd;
    public static String FName;
    public static String LName;
    public static String Faculty;
    public static String Major;
    public static int Grade;
    public static String Address;
    public static String PhoneNumber;
    public static String Str;
    public static void insert(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 //Scanner sc = new Scanner(System.in);
        try {
            BufferedWriter out = new  BufferedWriter(new FileWriter("Student.dat",true));
            for(int i=1; i<=1; i++)
             {  System.out.print("   ID Student : ");
                //IdCourse = sc.next();
                IDStd = br.readLine();
                
                System.out.print("   First Name : ");
		FName = br.readLine();
                
                System.out.print("   Last Name : ");
                LName = br.readLine();
                
                System.out.print("   Faculty : ");
                Faculty = br.readLine();
                
                System.out.print("   Major : ");
                Major = br.readLine();
                
                System.out.print("   Grade : ");
                Str = br.readLine();
                Grade = Integer.parseInt(Str);
                
                System.out.print("   Address : ");
                Address = br.readLine();
                
                System.out.print("   Phone Number : ");
                PhoneNumber = br.readLine();
                
                out.write(IDStd+" "+FName+" "+LName+" "+Faculty+" "+Major+" "+Grade+" "+Address+" "+PhoneNumber+"\n");
             }
            out.close();
            System.out.println("\n** File created successfully\n");
         }
        catch (IOException e) {
      }
    }
}
