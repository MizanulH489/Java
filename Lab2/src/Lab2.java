import java.util.Scanner; //scanner

public class Lab2 {
    public static void main(String[] args) {

           // scanner to take in input
        Scanner input= new Scanner(System.in);

        // Prompt User to enter input
        System.out.println("enter a 3 * 3 matrix of double values:");
       // Create double for 3 x 3 matrix
        double[][] matrix = new double[3][3];
            // for loop to get matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble(); // input next double
            }


        }

         // System output string that tells suer wether it it markov or not
        String input_user = " ";
        // if function for if markov matrix is not entered with the igven inputs
        if (!isMarkovMatrix(matrix)) {
            input_user = " not";
        }

        // Print out response to user whether it is markov or not
        System.out.println("It is" + input_user + " a Markov matrix");
    }


         // Method to check for function
    public static boolean isMarkovMatrix(double[][] m) { // for matrkov matrix
        for (int i = 0; i < m.length; i++) {
            double col_sum = 0;
             // for loop to check for matrix
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] < 0) {
                    return false;
                }
                col_sum += m[j][i]; // give off sum
            }
            // if column sum equals to 1.0 returns false
            if (col_sum != 1.0) {
                return false;
            }
        }
         // return true
        return true;
    }

}

