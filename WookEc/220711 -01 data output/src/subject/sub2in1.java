package subject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class sub2in1 {
   public static void main(String[] args) throws IOException {

      BufferedReader in = new BufferedReader(new FileReader("d:\\WookEc\\filetest\\secret.txt"));
        String s;
        char c;
        int key;
        int n=0x03;

        try {
       //    System.out.print("Put your word: ");
      //     s = scan.nextLine();

           while((s = in.readLine()) != null) {
         
              for(int i=0;i<s.length();i++)
              {  
                 c = s.toUpperCase().charAt(i);
                 if(c != (char)0x20 && c != (char)0x3F &&c != (char)0x21 && c != (char)0x2E && c != (char)0x2C)
                 {
                    key = (int)c+n;
                    System.out.print((char)key);
                 }
                 else
                 {
                    System.out.print(c);
                 }
              }
              }
           } finally {
              in.close();
           }
   }

}

