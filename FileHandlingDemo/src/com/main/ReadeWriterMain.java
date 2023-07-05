package com.main;

import com.entity.ReaderWriterDemo;

public class ReadeWriterMain {

	public static void main(String[] args) {
		ReaderWriterDemo ref=new ReaderWriterDemo();
		ref.writeData();
		ref.readCharByChar();
		ref.readLineByLine();
		ref.readInBulk();
	}

}
