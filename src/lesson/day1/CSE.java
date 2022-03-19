package lesson.day1;

public class  CSE{
    String studentName;

    static String session;
    void func1(){

    }

}


class A{
    public static void main(String[] args) {


        CSE rabitry = new CSE();
        rabitry.studentName = "Rabitry";

        CSE.session = "2019-20";



        CSE esha = new CSE();

        System.out.println("name: " + esha.studentName);
        System.out.println("session: " + CSE.session);

        System.out.println("name: " + rabitry.studentName);
        System.out.println("session: " + CSE.session);



    }
}

class B{


   static void func(int n){
        if(n < 1){
            return;
        }
        n--;

        int x = 10;

    }

    public static void main(String[] args) {
        B.func(10);

        B b1 = new B();
        B b2 = new B();
    }
}

// class is a blue print of all objects
// object is a real time entity
