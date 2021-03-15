package demo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Test2 {
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

	try {
			FileWriter wf=new FileWriter ("sankari.txt");
			BufferedWriter bf=new BufferedWriter (wf);
			bf.write("Welcome sankari");
			bf.write("hai how are you");
			bf.write("I want to learn java");
			bf.close();
		}catch(IOException e) 
		{
			System.out.println(e);
	    }
		System.out.println("Sucess");
	
		try {
			FileReader r = new FileReader("sankari.txt");
			Scanner s=new Scanner(r);
			while(s.hasNextLine()) 
			{
				String data = s.nextLine();
				System.out.println("data");
			}
			s.close();
		}catch(IOException e)
		   {
			System.out.println(e);
			}
		System.out.println("Sucessfully readed");
	
		try{
			File ef= new File("Emptyfile.txt");
		ef.createNewFile();
		if(ef.length()==0) {
			ef.delete();
			System.out.println("sucessfully deleted");
		}else
		{
			System.out.println("failed");
		}
		}
		catch(IOException e) 
		{
			System.out.println(e);
		}
		
	File d= new File("Document\\Emptyfile.txt");
		if(d.exists()) {
			System.out.println("file is exist in correct path");
		}else {
			System.out.println("Wrong path");
             }
	}
	}