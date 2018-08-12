package ua.prog.readfiles;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		 File f1 = new File("haiku1.txt");
	     File f2 = new File("haiku2.txt");
	     File f3 = new File("result.txt");
		
	    
	     FileMerger.merge(f1,f2,f3);
}
}
