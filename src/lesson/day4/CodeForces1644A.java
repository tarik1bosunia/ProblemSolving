package lesson.day4;

import java.util.Scanner;

public class CodeForces1644A {
       static Scanner scanner = new Scanner(System.in);
        String input;

       boolean check(char ch ,int index){
           for (int i = 0; i < index; i++) {
              if(input.charAt(i) == ch) {
                  return true;
              }
           }
           return false;
       }

       public void solve(){
           boolean isOpen = true;
           input = scanner.next();
           int len = input.length();

           for (int i = 0; i < len; i++) {
               // rRGgbB
               if(input.charAt(i) == 'R'){
                 if(check('r', i) == false){
                     isOpen = false;
                     break;
                 }

               }
               else if(input.charAt(i) == 'G'){

                   if(check('g', i) == false){
                       isOpen = false;
                       break;
                   }


               }
               else if(input.charAt(i) == 'B'){
                   if(check('b', i) == false){
                       isOpen = false;
                       break;
                   }
               }

           }
           if(isOpen == true){
               System.out.println("YES");
           }else {
               System.out.println("NO");
           }
       }

    public static void main(String[] args) {
        CodeForces1644A a = new CodeForces1644A();
        int t;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            a.solve();
        }
    }
}
