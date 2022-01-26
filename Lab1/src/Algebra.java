

import java.util.Scanner;

public class Algebra {
    public static void main(String[] args) { // psvm
        // Declare variables from given header public static int solveQuadratic(double[] eqn, double[] roots)
        double[] eqn = new double[3]; // create new doubleholding three spots
        double[] roots = new double[3];
        double[] coefficient = new double[3];


        //  Scanner function to allow user to inpute
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c: "); // Prompt User to enter input a,b,c
        for (int i = 0; i < 3; i++) {
            coefficient[i] = input.nextDouble();
        }
    solveQuadratic(coefficient,roots);

    }
// public state int
    public static int solveQuadratic(double[] eqn, double[] roots) {

// Eqn input function to calculate discriminant\
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        // discriminant
        double disc = (b * b) - 4 * a * c;




     // if function
        // function to do math
        if (disc>0){
            roots[0]=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
            roots[1]=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
            // print output
            System.out.println("The equation has two roots: "+roots[0] + "and" +roots[1]) ;
        }
        // else if function
        else if (disc == 0){
            roots[1]=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
            System.out.println("The equation with one root"+ roots[0]);

        }
        // else function if there is no roots resulting in none
        else {
            roots[0]=0;
            System.out.println("The equation has no roots");
        }
        return 1;
    }
}