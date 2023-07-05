package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AssignmentReadKeybord {
	Scanner sc =new Scanner(System.in);
	
	
	File file=new File(
			"C:\\Users\\mahip\\OneDrive\\Desktop\\java\\maheshassignment.txt");
	void writeDataFromKeyBord(){
		try(FileWriter writer=new FileWriter(file)){
			System.out.println("Enter data in file : ");
			String str=sc.nextLine();
			writer.write(str);
			System.out.println("Data saved in file Succesfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void readData() {
		try(FileReader imreader=new FileReader(file);
				BufferedReader br=new BufferedReader(imreader)){
			char[] arr=new char[150];
			int temp=0;
			System.out.println("Lets Read Data: ");
			while((temp=br.read(arr))>0) {
				String str=new String(arr,0,temp);
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

	public static void main(String[] args) {
		AssignmentReadKeybord obj=new AssignmentReadKeybord();
		obj.writeDataFromKeyBord();
		obj.readData();
	}

}
