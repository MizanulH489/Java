
import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Scanner;


// public class ExtraLab
public class ExtraLab {


    public static void main(String[] args) {

        // prompt User to enter a new file name
        System.out.print("Enter file name: ");
        File file = new File(new Scanner(System.in).next());


        if (!file.exists()) {
            System.out.println(file + " doesn't exist");
            System.exit(1);
        }
        // declare variables
        String buffer = "";
        int[] let_c = new int[26];

        //try catch block to get exceptions
        try (Scanner inp = new Scanner(file)) {

            // while function to use file input
            while (inp.hasNext()) {
                // while function to store and Print Upper case occurences
                buffer = inp.nextLine();
                for (char ch : buffer.toCharArray()) {
                    ch = Character.toUpperCase(ch);
                    if (isLetter(ch)) {
                        let_c[ch - 'A']++;
                    }
                }

            }


                File outputFile = new File("letterCount.txt");



            // catch filenotfound excception
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }



        for (int i = 0; i < let_c.length; i++) {
            System.out.println((char)(i + 'A') + " occurrence = " + let_c[i]);
        }

    }





    // ps boolean to return letter
    private static boolean isLetter(char ch) {

        return (ch >= 'A' && ch <= 'Z');
    }
}