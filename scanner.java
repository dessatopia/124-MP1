import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanner {
	public static void main (String args[]) throws FileNotFoundException {
		File text = new File("D:/file.txt"); //scans and reads the text file

		Scanner scan = new Scanner(text);

        while(scan.hasNextLine()){
        	String line = scan.nextLine();
        	String parts[] = line.split("(?<=;) "); //splits the string after a semicolon
        	for (String part: parts){
        		System.out.println(part); //prints the text file (nawala yung semicolon tho)
        	}
        }

        System.out.println("\nOutput:\n");


	}
}