package lesson.day8;

interface NumberFormatter{
    String format(int n);
}

class DefaultFormatter implements NumberFormatter{

    @Override
    public String format(int n) {
        return String.valueOf(n);
    }
}












      // 1000000
     //   1,000,000
class DecimalSeparatorFormatter implements NumberFormatter{

         @Override
         public String format(int n) {
             String sign = "";
             String out = "";
             String str;
//             input 10003

//             output 10,003
             if(n < 0){
                 sign = "-";
                 n = -n;
             }
             str = String.valueOf(n);

             for (int i = str.length() - 1; i >= 0; i--)
             {

                          //  5,4,3,2,1,0
                 if (i % 3 == 0 && i != str.length() - 1)
                 {
                     out = "," + out;
                 }
                 out =  str.charAt(i)+ out;

             }
             return out;
         }
}


class AccountingFormatter implements NumberFormatter{

    @Override
    public String format(int n) {
        String str;
        if(n < 0){
            n = -n;
            str = String.format("(" + n + ")");

        }else {
            str = String.valueOf(n);
        }
        return str;
    }
}

class BaseFormatter implements NumberFormatter
{
    private static final int LOWER_BOUND = 2;
    private static final int UPPER_BOUND = 36;

    private static final String[] digits = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"

    };

    private int base;


    public BaseFormatter(int base) {
        this.base = base;
    }

    public String format(int n)
    {
        if (this.base < LOWER_BOUND || this.base > UPPER_BOUND) {
            System.out.println("Base ought to be between 2 - 36.");
            return null;
        }

        String out = "";
        int rem;

        String sign = (n < 0) ? "-" : "";
        if (n < 0) { n = -n; }

        while (n > 0)
        {

//            22
//            11| 0 => 0
//            5| 1 => 10
//            2| 1 => 110
//            1| 0 => 0110
//            0| 1 => 10110

            rem = n % base;
            out = digits[rem] + out;
            n = n / base;
        }

        return sign + out;
    }
}



public class PractiQ3Sol {
    public static void main(String[] args) {
//        DefaultFormatter df = new DefaultFormatter();
//        System.out.println(df.format(46327));
//        DecimalSeparatorFormatter dsf = new DecimalSeparatorFormatter();
//        System.out.println(dsf.format(   1234567));

//        AccountingFormatter af = new AccountingFormatter();
//        System.out.println(af.format(1234));

        BaseFormatter bf = new BaseFormatter(37);
        System.out.println(  bf.format(16));


    }
}

