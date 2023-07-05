package com.entity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriterDemo {
	File file=new File(
			"C:\\javaprg\\d1.txt");
	public void writeData(){
		try (FileWriter writerHere=new FileWriter(file)){
			String data="I love my country India";
			writerHere.write(data);
			System.out.println("Data saved in file");
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
	}
	int count=1;
	public void readCharByChar() {
		try(FileReader readerHere=new FileReader(file)){
			String str="";
			int x=0;
			while((x=readerHere.read())!=-1) {
				if(x==32) {
					count++;
				}
				str=str + (char)x;
			}
			System.out.println("Data from file : "+str);
			System.out.println("There are total "+count+" words in given data");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	public void readLineByLine() {
		try(FileReader readerobj=new FileReader(file);
				BufferedReader br=new BufferedReader(readerobj)){
				String str="";
				
				System.out.println("Data from file : ");
				while((str=br.readLine())!=null) {
					System.out.println(str);
				}
				
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readInBulk() {
		try(FileReader readerobj=new FileReader(file);
				BufferedReader br= new BufferedReader(readerobj)){
				
			char[] arr=new char [50];
			
			int count=0;
			System.out.println("Data from file : ");
			while((count=br.read(arr)) > 0){
				String str=new String(arr,0,count);
				System.out.println(str);
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
