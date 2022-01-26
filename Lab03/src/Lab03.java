import java.util.Scanner; // java scanner

// Lab 03
public class Lab03 {
    public static void main(String[] args)
    {
        // Scanner Input
        Scanner input = new Scanner(System.in);

       // Declare Variables
        String inputNum;
        //tokens
        String tokena[];
        String tokenb[];

        String area_C;
        String firstThree;
        String lastFour;
        String allSeven;
        String fullNumber;
        String phonenum;

       // CHeck to see if input is corect
        if (phonenum.matches("[(]\d{3}[)]" + "\s\d{3}-\d{4}") == false)
        {
            System.out.println("Invalid input, try again");
            phonenum = input.nextLine();

        }
       //Print Out result
        System.out.print("\nPlease enter phone number (ddd) ddd-dddd: ");
       // put input on nextline
        inputNum = input.nextLine();

    // print result
        System.out.println();

       // SPlit Method
        tokena = inputNum.split(" ");

     //get area code
        area_C = tokena[0].substring(1, 4);

       // split function
        tokenb = tokena[1].split("-");

        // Input of 3 digits
        firstThree = tokenb[0];
        // Token digits
        lastFour = tokenb[1];


        // Digit  to print out tokens for phone number
        allSeven = firstThree + lastFour;

        // Ahow full number
        fullNumber = area_C + " " + allSeven;


           // Print Area and COde
        System.out.println("\nThe Area code: " + area_C);

        System.out.println("\nThe Phone number: " + allSeven);
        System.out.println("\n The Full Phone number: " + fullNumber);






    }
}