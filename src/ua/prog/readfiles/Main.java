package ua.prog.readfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		/*
		try (BufferedReader f = new BufferedReader(new FileReader("haiku.txt"));
				BufferedReader fff = new BufferedReader(new FileReader("haiku2.txt")))
			{
			String str = "";
			for(;(str = f.readLine())!=null;)
				System.out.println(str);
			String str1 = "";
			for(;(str1 = fff.readLine())!=null;)
				System.out.println(str1);
		}catch(IOException e) {
			System.out.println("error");
		}
		*/
		File in1 = new File("haiku.txt");
		File in2 = new File("haiku2.txt");
		File out = new File("haiku3.txt");
		try {
			Streamwork.copyFiles(in1,in2, out);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
