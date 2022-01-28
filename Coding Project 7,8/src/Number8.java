import java.io.*;
import java.util.*;

public class Number8 {
    //list to hold read numbers
    private static List<Integer> numbersList = new ArrayList<>();
    //hash map to store the frequencies of the ratings
    private static HashMap<Integer,Integer> frequencyRating = new HashMap<>();

    /**
     * Method to read file using scanner
     */
    private static void readFile(){
        File numbersFile = new File("numbers.txt");
        try {
            Scanner scanner = new Scanner(numbersFile);
            while (scanner.hasNextInt()){
                numbersList.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to count the frequency as they are being stored
     */
    private static void calculateFrequency(){
        for (Integer n:numbersList){
            if (frequencyRating.containsKey(n)){
                frequencyRating.put(n,frequencyRating.get(n) + 1);
            }else{
                frequencyRating.put(n,1);
            }
        }
    }

    /**
     * Method to write the frequencies of the ratings in the output.txt file
     */
    private static void writeOutput(){
        File outputFile = new File("output.txt");
        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf("Rating\tFrequency\n");
            for (Map.Entry<Integer,Integer> entry:frequencyRating.entrySet()){
                printWriter.printf(entry.getKey() + "\t\t\t"+ entry.getValue()+"\n");
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //main method
    public static void main(String[] args) {
        readFile();
        calculateFrequency();
        writeOutput();
    }
}
