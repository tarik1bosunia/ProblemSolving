package lesson.day2.thisKeyword;

public class ThisKeyword {
}


/*

    1. this can be used to refer current class instance variable.
    2. this can be used to invoke current class method (implicitly)
    3. this() can be used to invoke current class constructor.
    2. this can be passed as an argument in the method call.
    this can be passed as argument in the constructor call.
    this can be used to return the current class instance from the method.

*/

class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;

        this.display();
    }
    void display(){
        System.out.println("roll : " + rollno +" Name: "+ name +" Fee: " + fee);
    }
}


class TestThis1{
    public static void main(String args[]){
        Student s1 = new Student(111,"ankit",5000f);
        Student s2 = new Student(112,"sumit",6000f);

    }
}



// this can be invoked current class constructor
class A{
    A(){
        this(10);

        System.out.println("hello a");
    }

    A(int x){
        System.out.println(x);
    }
}
class TestThis5{
    public static void main(String args[]){
        A a = new A();
    }
}


/*4) this: to pass as an argument in the method*/

class S2{

    void m(S2 obj){
        System.out.println("method is invoked");
    }


    void p(){
        m(this);
    }
    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();
    }
}



/*5) this: to pass as argument in the constructor call*/

class World{
  Bangladesh bangladesh;

  World(Bangladesh bd){
      this.bangladesh = bd;
      display();
  }
  void display(){
      System.out.println(bangladesh.capital);
  }

}

class Bangladesh{
   String capital = "Dhaka";
   Bangladesh(){
       World world = new World(this);
   }

    public static void main(String[] args) {
        Bangladesh bangladesh = new Bangladesh();
    }
}