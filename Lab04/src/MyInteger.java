import java.util.Scanner;
public class MyInteger {
    // Value
    int v;

    // Constructor
    MyInteger(int number)
    {
        v = number;
    }

    // getValue
    public int getValue() {
        return v;
    }

    // isEven
    public boolean isEven()
    {
        return isEven(v);
    }

    // isOdd
    public boolean isOdd()
    {
        return isOdd(v);
    }

    // isPrime
    public boolean isPrime()
    {
        return isPrime(v);
    }
    public static boolean isEven(int number)
    {
        return (number%2==0);
    }
    public static boolean isOdd(int number)
    {
        return !isEven(number);
    }
    public static boolean isPrime(int number)
    {
        for(int i=2; i<=number/2;i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger number)
    {
        return number.isEven();
    }
    public static boolean isOdd(MyInteger number)
    {
        return number.isOdd();
    }
    public static boolean isPrime(MyInteger number)
    {
        return number.isPrime();
    }
    // Return string
    public static int parseInt(String s)
    {
        return Integer.parseInt(s);
    }
        public static int parseInt(char[] s)
        {
            return parseInt(new String(s));
        }
    }

class MyIntegerT
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:  ");
        int a = scan.nextInt();

        MyInteger integer1 = new MyInteger(a);

        // Output
        System.out.println( a+" is it even? "+integer1.isEven());
        System.out.println( a+" is it odd ? "+integer1.isOdd());
        System.out.println( a+" is it prime? "+integer1.isPrime());
        System.out.println("13 is it prime? "+MyInteger.isPrime(13));

        // Char
        char[] c={'1','2','3','4'};
        System.out.println("Characters "+MyInteger.parseInt(c));
        String s="123456789";
        System.out.println("String is "+MyInteger.parseInt(s));
        System.out.println("17 is it odd? "+MyInteger.isOdd(17));
        System.out.println("10 is it even? "+MyInteger.isEven(10));
        System.out.println(a+" is it equal to 22 ?"+integer1.equals(22));

    }
}
