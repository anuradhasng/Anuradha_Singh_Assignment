package com.coforge.Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoOnTryCatch {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		int a=9,b[]= {1,2,3,4,5};
		
		try {
			for(int i=0;i<b.length;i++)
			System.out.println(a/b[i]);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Occurred");
			e.printStackTrace();
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Application Completed");
		}
		
		String s=null;
		try {
			System.out.println(s.charAt(0));
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Application Completed");
		}
		
		File f=new File("data.txt");
		f.delete();
		
		if(f!=null)
			System.out.println("file exists");

		else {
			//System.out.println("File not found");
			throw new FileNotFoundException();
			}
		
		FileReader reader=null;
		try {
			reader= new FileReader("data.txt");
			int ch;
			while((ch=reader.read())!=-1)
				System.out.println((char)ch);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(reader!=null)
					reader.close();
			}
			catch (IOException ex) {
				System.out.println("Exception Occurred");
			}
			
			
		}
		FileReader reader1=new FileReader("data.txt");
		
	}

}
