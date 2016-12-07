/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Editor by Mr.sirasit kongsangdao 
 */
package course;

import java.io.*;
public class Read {
    public static void readcourse()  {
        
      try {
            BufferedReader in = new BufferedReader (new FileReader("Course_Reg.dat"));
            String str;
            System.out.println("\nรายการที่ลงทะเบียน\n");
            //System.out.println(" รหัสวิชา   ชื่อวิชา   หน่วยกิจ    วันเรียน      ห้องเรียน     เวลาเรียน");
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
            //System.out.println(str);
         }
       catch (IOException e) {
         }
    }
    
    public static void readstudent()  {
        
      try {
            BufferedReader in = new BufferedReader (new FileReader("Student.dat"));
            String str;
            System.out.println("\nรายชื่อนิสิต\n");
            //System.out.println(" รหัส   ชื่อ   นามสกุล   ชั้นปี    ที่อยู่    เบอร์โทร");
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
            //System.out.println(str);
         }
       catch (IOException e) {
         }
    }
}