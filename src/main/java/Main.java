import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Karan Navin Javali
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        urinals obj = new urinals();
        String path = new File("src/main/java/urinal.dat").getAbsolutePath();
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(obj.numberOfUrinals(sc.nextLine()));
        }

    }
}
