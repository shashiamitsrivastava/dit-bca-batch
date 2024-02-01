//to convert source code into byte code we hava a command 
// javac <JavaFileName.java>

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class First {

    // command line args
    int a = 55;
    public static void main(String[] args) throws FileNotFoundException {
        int zx = 55;
        // PrintStream p =new PrintStream();
        System.setOut(new PrintStream("C:\\Users\\ACER\\Documents\\DIT(BCA)\\res.txt"));
        System.out.print("HELLO");
        
        System.out.println("HELLO");
    }
}