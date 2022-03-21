package lesson.day1;

public class problem {
}


/*
    make a abstract class Vehicle which have a run() method

    make a class Car which inherit Vehicle...




*/

abstract class Vehicle{
    abstract void  run();
}


class Car extends Vehicle{

    @Override
    void run() {
        System.out.println(" this is run method from car");
    }
    int func(){

        return 100;
    }
}