/*
 * Editor by Mr.sirasit kongsangdao 
*/
package course;

import java.io.*;
public class UpdateClass {
    public static String ID_Std;
    public static String ID_Course;
    
    public static void Update()  {
      try {
            BufferedReader str1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\n    ID Student : ");
            ID_Std = str1.readLine();
            
            BufferedReader str2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("    ID Course : ");
            ID_Course = str2.readLine();
            
            BufferedReader in = new BufferedReader (new FileReader("Register.dat"));
			BufferedWriter out = new BufferedWriter(new FileWriter("NewFile.dat"));
            String str;
            while ((str = in.readLine()) != null) {
                String[] arr = str.split(" ");
                
                if (arr[0].equals(ID_Std)&&arr[1].equals(ID_Course)) continue;
                    out.write(arr[0]+" "+arr[1]+"\n");
            }
            out.close();    
            in.close();
            System.out.println("\nOk. Update\n");
            //- - - - - - - - - - - - - - - - - - - - - - - - - - - -
            File file = new File("Register.dat");
            if (!file.delete()) System.out.println("Remove file is failed\n");
            //- - - - - - - - - - - - - - - - - - - - - - - - - - - -            
            File oldName = new File("NewFile.dat");
            File newName = new File("Register.dat");
            if(oldName.renameTo(newName)) {
                System.out.println("OK. Renamed\n");
            } else {
		System.out.println("Renamed file is failed\n");
            }       
        }
       catch (IOException e) {
       }
    }
}