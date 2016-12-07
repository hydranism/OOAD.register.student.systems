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

public class Course {
     public static String IdCourse,Str;
     public static String NameCourse;
     public static int Credit;
     public static String Date;
     public static String Room;
     public static String Time;
     public static void write()  {
         
         
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 //Scanner sc = new Scanner(System.in);
        try {
            BufferedWriter out = new  BufferedWriter(new FileWriter("Course_Reg.dat",true));
            for(int i=1; i<=1; i++)
             {  System.out.print("   Input Id Course : ");
                //IdCourse = sc.next();
                IdCourse = br.readLine();
                
                System.out.print("   Input Name Course : ");
		NameCourse = br.readLine();
                //NameCourse = sc.next();
                
                System.out.print("   Input Credit : ");
                Str = br.readLine();
                Credit = Integer.parseInt(Str);
                
                System.out.print("   Input Date : ");
                Date = br.readLine();
                
                System.out.print("   Input Room : ");
                Room = br.readLine();
                
                System.out.print("   Input Time : ");
                Time = br.readLine();
                
                out.write(IdCourse+" "+NameCourse+" "+Credit+" "+Date+" "+Room+" "+Time+"\n");
             }
            out.close();
            System.out.println("\n** File created successfully\n");
         }
        catch (IOException e) {
      }
    }
}