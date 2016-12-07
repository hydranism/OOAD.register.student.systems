/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Editor by Mr.sirasit kongsangdao 
 */
package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LoveZ
 */
public class View_Reg {
    public static String ID_Std;
    public static String ID_Course;
    public static int num;
    //public static String Array[];
    
    public static void Read_Reg_By_StdID(){
        try {
            BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\n    ID Student : ");
            ID_Std = str.readLine();

            BufferedReader std = new BufferedReader (new FileReader("Student.dat"));
            String Std;
            while ((Std = std.readLine()) != null) {
                //Array = Std.split(" ");
                if (ID_Std.equals((Std.split(" "))[0])){
                    System.out.println("\n    ชื่อนิสิต : " + Std);
                }
            }
            
            System.out.println("\n    *******************************");
            System.out.println("    ******  รายวิชาที่ลงทะเบียน  ******");
            System.out.println("    *******************************\n");
            
            BufferedReader reg = new BufferedReader (new FileReader("Register.dat"));
            String Reg;
            
            num = 0;
            
            while ((Reg = reg.readLine()) != null) {
                //Array = Reg.split(" ");
                if (ID_Std.equals((Reg.split(" "))[0])){
                    
                    BufferedReader course = new BufferedReader (new FileReader("Course_Reg.dat"));
                    String Course;
                    
                    ID_Course = ((Reg.split(" "))[1]);
                    
                    while ((Course = course.readLine()) != null) {
                        if (ID_Course.equals((Course.split(" "))[0])){
                            num++;
                            System.out.println("    " + num + ". " + Course);
                        }
                    }
                    course.close();
                }
            }
            System.out.print("\n    ******  จำนวนที่ลงทะเบียนทั้งหมด : " + num + "  ******\n");
            reg.close();
        }
        catch (IOException e) {
        }
    }
    
    public static void Read_Reg_By_CourseID(){
        try {
            BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\n     ID Course : ");
            ID_Course = str.readLine();

            BufferedReader course = new BufferedReader (new FileReader("Course_Reg.dat"));
            String Course;
            while ((Course = course.readLine()) != null) {
                //Array = Std.split(" ");
                if (ID_Course.equals((Course.split(" "))[0])){
                    System.out.println("\n     วิชา : " + Course);
                }
            }
            course.close();
            
            System.out.println("\n     *******************************");
            System.out.println("     *****  รายชื่อนิสิตที่ลงทะเบียน  *****");
            System.out.println("     *******************************\n");
            
            BufferedReader reg = new BufferedReader (new FileReader("Register.dat"));
            String Reg;
            
            num = 0;
            
            while ((Reg = reg.readLine()) != null) {
                //Array = Reg.split(" ");
                if (ID_Course.equals((Reg.split(" "))[1])){
                    
                    BufferedReader std = new BufferedReader (new FileReader("Student.dat"));
                    String Std;
                    
                    ID_Std = ((Reg.split(" "))[0]);
                    
                    while ((Std = std.readLine()) != null) {
                        if (ID_Std.equals((Std.split(" "))[0])){
                            num++;
                            System.out.println("     " + num + ". " + Std);
                        }
                    }
                    std.close();
                }
            }
            System.out.print("\n     ******  จำนวนนิสิตที่ลงทะเบียนทั้งหมด : " + num + "  ******\n");
            reg.close();
        }
        catch (IOException e) {
        }
    }
}
