import java.io.*;

public class Number7{
    /**
     * Method showing that the subclass exceptions should appear first
     * FileNotFoundException extends the IOException class
     */
    public void displayFileNameWrongOrder(){
        try {
            File file = new File("cow.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            System.out.println(file.getName());
        } catch (IOException e){
            System.out.println("File not found exception");
        } catch (FileNotFoundException e) {
            System.out.println("No such file found");
        }
    }

    /**
     * Method showing correct order to catch exceptions
     */
    public void displayFileNameCorrectOrder(){
        try {
            File file = new File("cow.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            System.out.println(file.getName());
        } catch (FileNotFoundException e) {
            System.out.println("No such file found");
        } catch (IOException e){
            System.out.println("File not found exception");
        }
    }

    public static void main(String[] args) {
        Number7 number7 = new Number7();
//        number7.displayFileNameWrongOrder();
        number7.displayFileNameCorrectOrder();
    }
}
