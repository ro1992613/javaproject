package input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input_stream {

	public static void main(String args[]) throws IOException{
		Input_stream in=new Input_stream();
		in.readstr();
	}
	
	public void readstr() throws IOException{
		File in = new File("d:/1.txt");
		//文件转换成输入流
		FileInputStream inFile = new FileInputStream(in);
		byte[] buffer = new byte[2];  
        int i = 0;  
        while ((i = inFile.read(buffer)) != -1) {  
        	//输入流没被读取（read）一次，减少
        	System.out.println("----------->>>>>>stream length="+inFile.available()+"----------->>>>>>");
        	//System.out.println(new String(buffer));
        } 
	}
}
