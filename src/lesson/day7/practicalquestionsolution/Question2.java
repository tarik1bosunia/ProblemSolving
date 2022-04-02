package lesson.day7.practicalquestionsolution;

import java.util.Scanner;

class  ComboLock{
    private int currentLocation;
    private int max;
    private  int secret1, secret2, secret3;
    private int key[] = new int[3];

    ComboLock(int secret1, int secret2, int secret3){
        currentLocation = 0;
        max = 40;

        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;

    }
    public void reset() {
        this.currentLocation = 0;
    }
    public void turnLeft(int ticks) {
        this.currentLocation = this.currentLocation - ticks;

        if(this.currentLocation < 0){
            this.currentLocation = this.currentLocation + max;
        }
        System.out.println("current location: " + this.currentLocation);
    }
    public void turnRight(int ticks) {
        this.currentLocation = this.currentLocation + ticks;
        if (this.currentLocation >= 40){
            this.currentLocation = this.currentLocation - max;
        }
        System.out.println("current location: " + this.currentLocation);
    }
    public boolean open() {
        int ticks;
        Scanner sc = new Scanner(System.in);
        ticks = sc.nextInt();
        turnRight(ticks);
        key[0] = this.currentLocation;

        ticks = sc.nextInt();
        turnLeft(ticks);
        key[1] = this.currentLocation;

        ticks = sc.nextInt();
        turnRight(ticks);
        key[2] = this.currentLocation;

        if (key[0] == secret1 && key[1] == secret2 && key[2] == secret3){
            return true;
        }

        this.reset();
        return  false;

    }



}

public class Question2 {
    public static void main(String[] args) {
        ComboLock comboLock = new ComboLock(10,35,5);
        boolean isOpen = false;
       while (isOpen == false){
           if(comboLock.open()){
               isOpen = true;
               System.out.println("Lock opened successfully.");
           }else{
               System.out.println("wrong password.. please try again");
           }
       }

    }
}
