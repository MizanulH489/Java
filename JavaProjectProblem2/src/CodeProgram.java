import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodeProgram {
    public static void main(String []args) throws IOException{
        FileReader fr = null;
        FileWriter fw = null;
        Scanner inp = new Scanner(System.in);
        SubstitutionCipher cipher1 = null;
        ShuffleCipher cipher2 = null;

        while(true){
            System.out.println("Welcome to the Cipher Program");
            System.out.println("Type 1 for Substitution Cipher.");
            System.out.println("Type 2 for Shuffle Cipher.");
            int cipher_choice = inp.nextInt();

            if (cipher_choice == 1){
                System.out.println("What is the key (shift amount) for your code?");
                int key = inp.nextInt();
                cipher1 = new SubstitutionCipher(key);
                System.out.printf("%s -shift amount = %d\n",cipher1.cipherType(), key);
            } else {
                System.out.println("What is the key (shuffle amount) for your code?");
                int key = inp.nextInt();
                cipher2 = new ShuffleCipher(key);
                System.out.printf("%s -shuffle amount = %d\n",cipher2.cipherType(), key);
            }

            System.out.println("Enter input file name");
            String inFile = inp.next();
            try{
                fr = new FileReader(inFile);
            }
            catch (FileNotFoundException fe){
                System.out.println("File not found");
                continue;
            }

            System.out.println("Enter output file name");
            String outFile = inp.next();

            fw = new FileWriter(outFile);

            StringBuilder inputText = new StringBuilder();
            int ch;
            while ((ch=fr.read())!=-1)
                inputText.append((char)ch);

            fr.close();
            String text = inputText.toString();

            System.out.println("Encode (E) or Decode (D)");
            char e_or_d = inp.next().charAt(0);

            String processedText = "";
            if(e_or_d == 'D'){
                if (cipher_choice == 1) processedText = cipher1.decode(text);
                else if (cipher_choice == 2) processedText = cipher2.decode(text);
                fw.write(processedText);
                fw.flush();
                fw.close();
                System.out.println("Decoded text saved in file " + outFile);
            }else if (e_or_d == 'E') {
                if (cipher_choice == 1) processedText = cipher1.encode(text);
                else if (cipher_choice == 2) processedText = cipher2.encode(text);
                fw.write(processedText);
                fw.flush();
                fw.close();
                System.out.println("Encoded text saved in file " +  outFile);

            }else {
                System.out.println("unrecognized choice");
                continue;
            }

            System.out.println("Do you want to do another message (Y)");
            char cont = inp.next().charAt(0);
            if (cont != 'Y') break;
        }
        inp.close();
    }
}

