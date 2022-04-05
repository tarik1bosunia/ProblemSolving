package lesson.day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Q4 {
    String str = "";
    Formatter formatter;
    void readWrite(){
        File input = new File("src/lesson/day8/files/input.txt");


        try {
            Scanner sc = new Scanner(input);
            Formatter formatter = new Formatter("src/lesson/day8/files/output.txt");
            int i = 1;
           while (sc.hasNextLine()){
               str = sc.nextLine();
               formatter.format("/*%d*/%s\n",i,str);
               i++;
           }
           formatter.close();
           sc.close();
            System.out.println("writing successful");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        q4.readWrite();

    }
}
