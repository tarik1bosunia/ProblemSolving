package lesson.day3;

import static java.lang.Float.NaN;

public class MathClass {
}


class JavaMathExample1
{
    public static void main(String[] args)
    {
        double x = 28;
        double y = 4;

        // return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        //returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        // return the logarithm of given value
        System.out.println("Logarithm of 10 is: " + Math.log(Math.E));// e basis log
        System.out.println("Logarithm of y is: " + Math.log(y));

        // return the logarithm of given value when base is 10
        System.out.println("log10 of 100 is: " + Math.log10(100));
        System.out.println("log10 of y is: " + Math.log10(y));

        // return the log of x + 1
        System.out.println("log1p of x is: " +Math.log1p(x));

        // return a power of 2
        System.out.println("exp of a is: " +Math.exp(x));

        // return (a power of 2)-1
        System.out.println("expm1 of a is: " +Math.expm1(x));
    }
}

class RoundExample1
{
    public static void main(String[] args)
    {
        double x = -79.4;
        // find the closest int for the double// assonno man
        System.out.println(Math.round(x));
    }
}

class SignumExample1
{
    public static void main(String[] args)
    {
        double a = NaN;
        System.out.println(Math.signum(a));
    }
}

class CeilExample1
{
    public static void main(String[] args)
    {
        double x =  83.4;
        // Input positive value, Output ceil value of x
        System.out.println(Math.ceil(x));
    }
}

class FloorExample1
{
    public static void main(String[] args)
    {
        double x = - 94.69;
        // Input positive value, Output floor value of x
        System.out.println(Math.floor(x));
    }
}

class FloorDivExample1
{
    public static void main(String[] args)
    {
        int x = 25;
        int y= 0;
        // 25/3 value is 8.33 so floor(8.33) = 8
        System.out.println(Math.floorDiv(x, y));
    }
}

class RandomExample1
{
    public static void main(String[] args)
    {
        // generate random number
        double a = Math.random();
        double b = Math.random();
        // Output is different every time this code is executed
        System.out.println(a);
        System.out.println(b);
    }
}

class RandomExample2
{
    public static void main(String[] args)
    {
        // Generate random number between 0 to 20    0.. 1 *10
        double a = Math.random() * 1;
        double b = Math.random() * 1;
        // Output is different every time this code is executed
        System.out.println(a);
        System.out.println(b);
    }
}


class RandomExample3
{
    public static void main(String[] args)
    {
        // Generate random number between 5 to 30
        double a = 5 + (Math.random() * (30-5));
        double b = 5 +  (Math.random() * (30-5));
        // Output is different every time this code is executed
        System.out.println(a);
        System.out.println(b);
    }
}

class RintExample1
{
    public static void main(String[] args)
    {
        double x = - 81.68;
        // Input positive value, Output round the x
        System.out.println(Math.rint(x));
    }
}

class HypotExample1
{
    public static void main(String[] args)
    {
        double a = 8;
        double b = 6;
        // Return the value of sqrt(a power of 2 + b power of 2)
        System.out.println(Math.hypot(a, b));
    }
}

class HypotExample3
{
    public static void main(String[] args)
    {
        double a = Double.POSITIVE_INFINITY;
        double b = 73;
        // when 1 or more argument is Infinity, output Infinity
        System.out.println(Math.hypot(a, b));
    }
}
class HypotExample4
{
    public static void main(String[] args)
    {
        double a = 0.0/0;
        double b = 67;
        // when 1 or more argument is NaN, output NaN
        System.out.println(Math.hypot(a, b));
    }
}
class GetExponentExample1
{
    public static void main(String[] args)
    {
        double a = 9;
        // Input double value, Output exponent of it
        System.out.println(Math.getExponent(a));
    }
}
class IEEEremainderExample1
{
    public static void main(String[] args)
    {
        double a = 8.6;
        double b = 4.2;
        System.out.println(Math.IEEEremainder(a, b));
    }
}

class IEEEremainderExample3
{
    public static void main(String[] args)
    {
        double a = 1.0/0;
        double b = 5;
        // First argument is infinity, Output NaN
        System.out.println(Math.IEEEremainder(a, b));
    }
}

class AddExactExample1
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 737;
        // Input two positive value, Output addition of a and b
        System.out.println(Math.addExact(a, b));
    }
}