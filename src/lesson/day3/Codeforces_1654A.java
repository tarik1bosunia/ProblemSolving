package lesson.day3;

import java.util.*;

public class Codeforces_1654A {
    static Scanner scanner = new Scanner(System.in);


    void  solve(){
        int n;

        n = scanner.nextInt();
        ArrayList <Integer> v = new ArrayList<>();

        int input;
        for (int i = 0; i < n; i++) {
            input = scanner.nextInt();
            v.add(input);
        }

        int max1 = Collections.max(v);

        for (int i = 0; i < n; i++) {
           try {
               if(v.get(i) == max1){
                   v.remove(i);
               }
           }catch (Exception e){
               System.out.println("error" + i );
           }
        }
        int max2 = Collections.max(v);

        int ans = max1 + max2;

        System.out.println(ans);
    }

    public static void main(String[] args) {

        int test;
        Codeforces_1654A a = new Codeforces_1654A();

        test = scanner.nextInt();
        for (int i = 0; i < test; i++) {
            a.solve();
        }

    }
}
