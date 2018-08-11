package ua.prog.readfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Streamwork {

	
	public static void streamCopy(InputStream isOne,InputStream isTwo, OutputStream os) throws IOException{
		byte[] buffer = new byte[1024*1024];
		int readByte = 0;
		
		for(;(readByte = isOne.read(buffer))>0;) 
			for(;(readByte = isTwo.read(buffer))>0;)
		
		{
			os.write(buffer,0, readByte);
		}
	}
	
	
	public static void copyFiles(File inOne, File inTwo, File out)throws IOException{
		if(inOne==null||inTwo==null||out == null){
			throw new IllegalArgumentException();
		}
		try(InputStream isOne = new FileInputStream(inOne);
				InputStream isTwo = new FileInputStream(inTwo);
				OutputStream os = new FileOutputStream(out)){
			
			streamCopy(isOne,isTwo,os);
			
		}catch(IOException e) {
			throw e;
		}
		
		
	}
}
