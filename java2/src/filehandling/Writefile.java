package filehandling;
import java.io.FileWriter;
import java.io.*;
public class Writefile {
	public static void main(String[] args) {
		try {
			FileWriter wf=new FileWriter ("sankari.txt");
			wf.write("Welcome sankari");
			wf.close();
		}catch(IOException e) {
			System.out.println(e);}
		System.out.println("Sucess");
		}
	}		

