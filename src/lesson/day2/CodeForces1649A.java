package lesson.day2;

import java.util.Scanner;
import java.util.Vector;


public class CodeForces1649A {
    Scanner scanner = new Scanner(System.in);

    void solve(){
        int n;

        Vector<Integer> v = new Vector<Integer>();

        n = scanner.nextInt();

        // taking locations input
        int input;
        for (int i = 0; i < n; i++) {
            input = scanner.nextInt();
            v.add(input);
        }

        // finding first location which contain 0
        int first0Location = 0, last0Location = 0;
        for (int i = 0; i < n; i++) {
           if(v.get(i) == 0){
               first0Location = i;
               break;
           }
        }

        // finding last location which contain 0
        for (int i = n-1; i >=0; i--) {
            if(v.get(i) == 0){
                last0Location = i;
                break;
            }
        }

        int coins;

        if(first0Location == 0 && last0Location == 0){
            coins = 0;
        }else {
            coins = last0Location - first0Location + 2;
        }

        System.out.println(coins);

    }


    public static void main(String[] args) {
        int test;

        CodeForces1649A a = new CodeForces1649A();
        test = a.scanner.nextInt();

        for (int i = 1; i <= test ; i++) {
            a.solve();
        }
    }
}
