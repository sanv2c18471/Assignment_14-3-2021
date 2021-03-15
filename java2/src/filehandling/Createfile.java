package filehandling;
import java.io.*;
public class Createfile {
	public static void main(String[] args) {
		try {
			File f= new File("sankari.txt");
			if(f.createNewFile()) {
				System.out.println("New file is created Successfully");
			}else 
			{
				System.out.println("File is already exists");

			}
		}
		catch(IOException e) {
        e.printStackTrace();
		}
	}
}
