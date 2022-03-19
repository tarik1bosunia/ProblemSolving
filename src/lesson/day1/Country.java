package lesson.day1;

public class Country {//base class
    String countryName  = "Bangladesh";
    String continentName = "Asia";

    void func(){
        System.out.println("country class");
    }


}

class Bangladesh extends Country{// child class


    @Override
    void func() {
        System.out.println("class Bangladesh");
    }

    public static void main(String[] args) {
        Bangladesh b = new Bangladesh();

        b.func();
    }
}

class India extends Country{// child class


    public static void main(String[] args) {
        India b = new India();

        b.func();
    }
}


