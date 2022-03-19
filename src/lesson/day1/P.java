package lesson.day1;

abstract public class P {

    abstract void func();
}


abstract class Q extends P{


}

class R extends P{


    @Override
    void func() {
        System.out.println("R class");
    }
}
