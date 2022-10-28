import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Karan Navin Javali
 */
public class Main {
    public static void main(String[] args) throws IOException {
        urinals obj = new urinals();
        Scanner inputSc = new Scanner(System.in);

        // Choose input option
        System.out.println("Choose the input method (Enter 1 or 2)");

        System.out.println("1. Inputs from file (name the file urinal.dat)");
        System.out.println("2. Inputs from keyboard (one string input will be accepted)");

        int input = inputSc.nextInt();
        switch (input) {

            case 1:
                // input taken from urinal.dat file and printed to rule.txt/rule(i).txt where i is file number(1,2,..) if previous numbers exist
                String path = new File("src/main/java/urinal.dat").getAbsolutePath();
                File file = new File(path);
                Scanner sc = new Scanner(file);

                ArrayList<Integer> outputs = new ArrayList<Integer>();
                while(sc.hasNextLine()){
                    outputs.add(obj.numberOfUrinals(sc.nextLine()));
                }

                // create txt file
                File createdFile = obj.getFile();
                // write output to txt file
                obj.writeToFile(createdFile,outputs);

                break;

            case 2:
                // Enter input and print output
                System.out.println("Please enter the input string");
                inputSc.nextLine();
                String str = inputSc.nextLine();
                System.out.println(obj.numberOfUrinals(str));
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
