package com.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AssignmentCountWords {
	File file=new File(
			"C:\\javaprg\\d1.txt");
	public void writeData(){
		try (FileWriter writerHere=new FileWriter(file)){
			String data="My name is Mahesh Patil. I love to code.";
			writerHere.write(data);
			System.out.println("Data saved in file");
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
	}
	int count=0;
	char c;
	public void readCharByChar() {
		try(FileReader readerHere=new FileReader(file)){
			String str="";
			int x=1;
			while((x=readerHere.read())!=-1) {
				c=(char) x;
				if(x==' ') {
					count++;
				}
				str=str + (char)x;
			}
			System.out.println("Data from file :"+str);
			System.out.println("There are total "+count+" words in this file.");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	public static void main(String[] args) {
		
		AssignmentCountWords ref=new AssignmentCountWords();
		ref.writeData();
		ref.readCharByChar();
	}

}
