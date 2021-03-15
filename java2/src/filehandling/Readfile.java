package filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Readfile {
public static void main(String[] args) {
	try {
		FileReader r = new FileReader("sankari.txt");
		Scanner s=new Scanner(r);
		while(s.hasNextLine()) {
			String data = s.nextLine();
			System.out.println("data");
		}
		s.close();
	}catch(IOException e) {
		System.out.println(e);}
	System.out.println("Sucessfully readed");
		
	}
}

