package lesson.day5;

import java.util.Scanner;

public class CodeForces1620A {
    static Scanner scanner = new Scanner(System.in);

    void solve(){
        String str;
        str = scanner.next();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'N'){
                count ++;
                if(count > 1){
                    break;
                }
            }
        }
        String ans = count == 1 ? "NO" : "YES";
        System.out.println(ans);

    }

    public static void main(String[] args) {
        CodeForces1620A a = new CodeForces1620A();
        int test;
        test = scanner.nextInt();

        for (int i = 0; i < test; i++) {
            a.solve();
        }

    }
}
