package com.entity;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class AssignmentReaderWriter{
	private File file=new File(
			"C:\\Users\\mahip\\OneDrive\\Desktop\\java shailesh sir\\IOAssignment.txt");
	
	public void writeDataHere() {
		try(FileWriter writer=new FileWriter(file)){
			String data="“When in the Course of human events, it becomes necessary for one people to\r\n"
					+ "dissolve the political bonds which have connected them with another, and to\r\n"
					+ "assume among the powers of the earth, the separate and equal station to which\r\n"
					+ "the Laws of Nature and of Nature&#39;s God entitle them, a decent respect for the\r\n"
					+ "opinions of mankind requires that they should declare the causes which impel\r\n"
					+ "them to the separation”";
			writer.write(data);
			System.out.println("Data Saved Successfully!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readData() {
		try(FileReader reader=new FileReader(file);
				BufferedReader br=new BufferedReader(reader)){
			char[] arr=new char[100];
			int count=0;
			System.out.println("Here is our file");
			while((count=br.read(arr))>0) {
				String myString=new String(arr,0,count);
				System.out.println(myString);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



