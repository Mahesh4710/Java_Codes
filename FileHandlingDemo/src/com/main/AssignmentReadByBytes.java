package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AssignmentReadByBytes {

	public static void main(String[] args) {
        File file=new File(
        		"C:\\Users\\mahip\\OneDrive\\Desktop\\bestfit.txt");
        try (InputStream input = new FileInputStream(file)) {
            byte[] size = new byte[512];
            int temp = 0;
            while ((temp = input.read(size)) != -1) {
                System.out.print(new String(size, 0, temp));
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


