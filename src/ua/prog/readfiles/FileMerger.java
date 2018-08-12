package ua.prog.readfiles;

import java.io.*;

public class FileMerger {

	
	public FileMerger() {
		super();
	}
	
	public static void merge (File in1, File in2, File out) {
		
		try  (BufferedReader br1 = new BufferedReader(new FileReader(in1));
				BufferedReader	br2 = new BufferedReader(new FileReader(in2));
					PrintWriter pw = new PrintWriter(out))
						
		{
			String line = "";
			String text1 = "";
			String text2 = "";
			while((line=br1.readLine())!=null) {
				text1 +=line;
			}
			String[] array1 = text1.split(" ");
				
			while((line=br2.readLine())!=null) {
				text2+=line;	
			}
			String[] array2 = text2.split(" ");
			
			for (String a : array1) {
				for (String b : array2) {
					if(a.equals(b)) {
						pw.print(a);
						pw.print(" ");
					}
				}
			}
					
		}		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
