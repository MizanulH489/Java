
import java.util.Scanner; //scanner

// class circle extends
class Circle extends ClassPoint
{
    // rpivate variable double
    private double radius;
   // public circle constructor that is default
    public Circle()
    {
        super(0.0, 0.0);
        this.radius = 0;
    }
    public Circle(double xValue, double yValue, double r ) // public circle object
    {
        // super values from Point.java
        super(xValue, yValue);
        this.radius = r; // radius pointing to r
    }

    // toString Method to convert to string
    public String toString()
    {
        return super.toString() + String.format(", %.2f", radius); // return string result of radius
    }
    // public double area to get area
    public double area()
    {
        return Math.PI * radius * radius; // return math result for area
    }

    // public double area to get circumfrence
    public double circumference()
    {
        return 2 * Math.PI * radius;
    }
}

// classs cylinder extends circkle
class Cyclinder extends Circle
{
    // Declare Variables
    // double height
    private double height;
    // public cylinder constructor
    public Cyclinder()
    {
        super(); // super constructor
        this.height = 0; // height returns 0
    }

    // Creat Cylinder constrictor for cylinder object
    public Cyclinder(double xValue, double yValue, double r, double h)
    {
        super(xValue, yValue, r);
        this.height = h;
    }


    // to string method
    public String toString()
    {
        return super.toString() + String.format(",%.2f", height);
    }
    // Area of circle
    public double area()
    {
        return circumference() * height + 2* super.area();
    }
}


class TestProgram {
    public static void main(String[] args)
    {
        // Declare Variables
        Cyclinder c_obj;

       // Declarea Reference Variable
        Object c = new Cyclinder(0.0, 0.0, 2.0, 6.0);
        c_obj=(Cyclinder)c;

        //Print out result
        System.out.println(c_obj);

        System.out.println("\nCylinder1 Area: reference by Object variable: " + c_obj.area());
        // Point
        Object c2 = new Cyclinder(5.00, 5.00, 3.00, 9.00);
        c_obj=(Cyclinder)c2;
        System.out.println(c_obj);

        // Print our result
        System.out.println("\nCylinder2 Area: reference by Point variable: " + c_obj.area());

       // Print out result for circle
        Circle c3 = new Cyclinder(10.00, 10.00, 4.00, 12.00);
        c_obj = (Cyclinder)c3;
        System.out.println(c_obj);

        // Print ouput
        System.out.println("\nCylinder3 Area: reference by circle variable:");
    }
}


