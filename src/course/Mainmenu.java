/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Editor by Mr.sirasit kongsangdao 
 */package course;


 /*import java.io.*;*/
import static course.Mainmenu.choice;
import java.util.*;
//===========================================
class Arrays {
    
    Course course = new Course();
    Read read = new Read();

    
    
    public static Scanner keyboard = new Scanner(System.in);
    public int N;
    public static float datas[] = new float[20];
    static int choice;

    public Arrays(int x) {      // Constructor à¹„à¸¡à¹ˆà¸¡à¸µ  à¹„à¸¡à¹ˆà¹ƒà¸Šà¹‰ à¸à¹‡à¹„à¸”à¹‰
        N = x;
    }

    public void Insert() {
        
        Course.write();
        //System.out.println("\nInput number of Datas <20 : ");
       // N = keyboard.nextInt();
        //for (int i=0; i<N; i++)
        //   {datas[i] = keyboard.nextFloat();  }
        // . . . 
    }
    
    public void InsertStd() {
        Student.insert();
    }

    public void DeleteData() {
        System.out.println("\n*** Delete Data\n");
        // . . . 
    }

    public void DisplayData() {
        Read.readcourse();
        
        //System.out.println("\n*** Display Data\n");
        // . . . 
    }
    
    public void DisplayStd() {
        Read.readstudent();
        
        //System.out.println("\n*** Display Data\n");
        // . . . 
    }
    
    public void SearchData() {
        System.out.println("\n*** Search Data\n");
        // . . . 
    }
    
    public void RegisterStd() {
        Register.registerStd();
    }
    
    public void View_List_Course() {
        System.out.println("     เลือกรายการ");
        System.out.print("       1. ค้นหาโดยรหัสนิสิต");
        System.out.println("     2. ค้นหาโดยรหัสวิชา");
        System.out.print("\n     ใส่หมายเลข -> : ");
        
        do {
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    View_Reg.Read_Reg_By_StdID();
                    break;
                case 2:
                    View_Reg.Read_Reg_By_CourseID();
                    break;
            }
            if(choice != 99)
            {
              break;
            }
        } while(choice != 99);
        
    }
};
//============================================
class MenuShow {

    public static Scanner keyboard = new Scanner(System.in);
    static int choice;

    public int PrintMenu() {
        System.out.println("\n**** ระบบลงทะเบียน ****\n");
        
        System.out.println("    ***** 1. สร้างรายวิชา");
        System.out.println("    ***** 2. แสดงรายวิชา");
        System.out.println("    ***** 3. ใส่รายชื่อนิสิต");
        System.out.println("    ***** 4. แสดงรายชื่อนิสิต");
        System.out.println("    ***** 5. ลงทะเบียนรายวิชา");
        System.out.println("    ***** 6. ถอนรายวิชา");
        System.out.println("    ***** 7. ดูรายชื่อลงทะเบียน");
        System.out.print("\n----> ใส่ตัวเลขเพื่อเรียกใช้เมนู : ");
        choice = keyboard.nextInt();
        return (choice);
    }
};
//=============================================
class Mainmenu {
    
    
    public static Scanner keyboard = new Scanner(System.in);
    static int choice;
    static MenuShow Menu = new MenuShow();
    static Arrays ObArray = new Arrays(0);

    public static void main(String[] args) {
        do {
            choice = Menu.PrintMenu();
            switch (choice) {
                case 1:
                    ObArray.Insert();
                    break;
                case 2:
                    ObArray.DisplayData();
                    break;
                case 3:
                   ObArray.InsertStd();
                    break;
                case 4:
                   ObArray.DisplayStd();
                    break;
                case 5:
                   ObArray.RegisterStd();
                    break;
                case 6:
                   UpdateClass.Update();
                    break;
                case 7:
                   ObArray.View_List_Course(); 
                break;
            }
            if(choice != 99)
            {
              System.out.print("\nกด Enter เพื่อกลับสู่เมนู");
              String RR = keyboard.nextLine();
            }
        } while (choice != 99);
    }
}