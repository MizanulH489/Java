import java.util.*;
import java.util.Scanner;
import java.lang.Math;

// public class Airplanseatingassignment class name assigned from insturctor
public class AirplanSeatingAssignment
{
    static String array_a[][];

   // string variables for seating algorithm
    static String seat_cat;
    static String st;
    static String plane_seat; // plane seat

    // variables to print out column and rows
    static int row=0;
    static int col;
    static int count = 0;
    static int num=0;

    // Scanner to get input
    static Scanner s_input = new Scanner(System.in);
    static String[] s_stringt = new String[10];

    // static public void to print out seats as well as the labels
    static public void SC_Produce()
    {
        // Declare Variables
        int i;
        int j;
        array_a = new String[13][6]; // Assing values of 13,6 to array a as a new string object

        // Print out table head of ABCDEF
        System.out.println("\tThis program assigns seats for a commercial airplane.");
        System.out.println("\tThe current seat assignments is as follows.");
        System.out.println("\t  A B C D E F");
        // for loop to print out rows of letter
        for(i = 0;i<13;i++)
        {
            if(i<9)
                System.out.print("\nRow " + (i+1) +" ");
            else
                System.out.print("\nRow " + (i+1) +" ");
            for(j = 0;j<6;j++)
            {
                array_a[i][j] = "*"; // print out stars
            }
            // print out array results
            System.out.print(" " + array_a[i][0]+ " "+ array_a[i][1]+ " "+ array_a[i][2]+ " "+ array_a[i][3]+ " "+ array_a[i][4]+ " "+ array_a[i][5]+ " ");
        }
        // show to user which seats are avilable/occupied
        System.out.println("\n* -- availaible seat   \nX -- occupied seat");
    }

    // static void print
    static void printAssign()
    {
        int i,j;
        System.out.println("\t A B C D E F");
        for(i = 0;i<13;i++)
        {
            if(i<9)
                System.out.print("\nRow " + (i+1) +" ");
            else
                System.out.print("\nRow " + (i+1) +" ");
            System.out.print("" + array_a[i][0]+ " "+ array_a[i][1]+ " "+ array_a[i][2]+ " "+ array_a[i][3]+ " "+ array_a[i][4]+ " "+ array_a[i][5]+ " ");
        }

        System.out.println("\n* -- availaible seat \nX -- occupied seat");
    }
    // AssignSeats
    static void assignSeat()
    {
        System.out.println("To reserve a seat enter y/y(Yes), N/n(No):");
        st = s_input.next();
        while(st.equalsIgnoreCase("y"))
        {
            System.out.print("Enter ticket type:F/f(first class); (B/b)(business class);E/e(Economy classs): ");
            seat_cat = s_input.next();
            if(seat_cat.equalsIgnoreCase("F"))
            {
                System.out.print("Enter Row Number 1 - 2: ");
                if((row = s_input.nextInt())>2)
                {
                    System.out.println("Enter a Valid row Number");
                    System.exit(0);
                }
            }
            else
            if(seat_cat.equalsIgnoreCase("B"))
            {
                System.out.print("Enter Row Number 3 - 7: ");
                row =s_input.nextInt();
                if(row>7 || row<3)
                {
                    System.out.println("Enter a Valid row Number");
                    System.out.println("You  can't do this");
                }
            }
            else
            if(seat_cat.equalsIgnoreCase("E"))
            {
                System.out.print("Enter Row Number 8 - 13: ");
                row = s_input.nextInt();
                // if loop to prompt user
                if (row < 8 || row > 13) {
                    System.out.println("Enter a Valid row Number");
                    System.out.println("Enter Row Number 8-13:");
                    row = s_input.nextInt();
                }


          // if loop for if row is great than or largerr than
                if(row>13 || row<8)
                {
                    System.out.println("You  can't do this");
                    System.out.println("Enter a Valid row Number");
                    row = s_input.nextInt();

                }

            }
            else
            {
                System.out.println("Enter a Valid Class");
                System.exit(0);
            }

            if(row >13)
            {
                System.out.println("Enter a Valid row Number");
                System.out.println("You  can't do this");
            }

            System.out.println("Enter Seat Number (A-F)");
            plane_seat = s_input.next();

            // if planeseat to equal case for input string
            if(plane_seat.equalsIgnoreCase("A")) // set a to column 1
                col = 1;
            else
            if(plane_seat.equalsIgnoreCase("B"))
                col = 2;
            else
            if(plane_seat.equalsIgnoreCase("C"))
                col = 3;
            else
            if(plane_seat.equalsIgnoreCase("D"))
                col = 4;
            else
            if(plane_seat.equalsIgnoreCase("E"))
                col = 5;
            else
            if(plane_seat.equalsIgnoreCase("F"))
                col = 6;
            // promp user to input new valid seat
            else
                if (col < 'A' || col > 'F') {
                    System.out.println("Enter a Valid Seat Number");
                    plane_seat = s_input.next();
                }






            array_a[row-1][col-1] = "X";
             // Print it out
            printAssign();

            System.out.println("To reserve another seat enter y/y(Yes), N/n(No):");
            st = s_input.next();
        }

        System.out.println("The Seats reserved for you :");

        // for loop to print out seat
        for(int i = 0;i<13;i++)
        {
            for(int j=0;j<6;j++)
            {
                // if variable to have input of Seats
                if(array_a[i][j].equalsIgnoreCase("X"))
                {
                    count++;
                    if(j==0)
                        s_stringt[num] ="A" ;
                    else
                    if(j==1)
                        s_stringt[num] ="B" ;
                    else
                    if(j==2)
                        s_stringt[num] ="C" ;
                    else
                    if(j==3)
                        s_stringt[num] ="D" ;
                    else
                    if(j==4)
                        s_stringt[num] ="E" ;
                    else
                    if(j==5)
                        s_stringt[num] ="F" ;

                    num++;
                }
            }
        }
        // for loop to reduce number of seats
        for(int i=count-1;i>=0;i--)
        {
            System.out.print(""+ s_stringt[i]+" ");
        }

    }

    static void showMenu(){
        // Print Out Row Results and specify which belong to which
        System.out.println("Rows 1 and 2 are for first class Passengers");
        System.out.println("Rows 3 through 7 are for business class Passengers");
        System.out.println("Rows 8 through 13 are for first economy Passengers");

    }

    public static void main(String[] args) {
        // Print andn Create objects associated with each of these
        SC_Produce();
        showMenu();
        assignSeat();
    }
}