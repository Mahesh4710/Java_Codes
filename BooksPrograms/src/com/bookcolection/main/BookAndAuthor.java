package com.bookcolection.main;

//Write a Java class named Book that has four instance variables: title, author,
//publisher, and year. Create a constructor that takes in values for title, author, and
//publisher and initializes them. Then create another constructor that takes in values
//for all four variables and initializes them. Create objects of the class and print the
//values.

public class BookAndAuthor {
	String title;
	String author;
	String publisher;
	int year;
	
	BookAndAuthor(){
		title="Let us C";
		author="Yashwant Kanetkar";
		publisher="	BPB Publications";
		year=2022;
	}
	BookAndAuthor(String title1,String author1,String publisher1,int year1){
		title=title1;
		author=author1;
		publisher=publisher1;
		year=year1;
		
	}
	void displayBookDetails() {
		System.out.println("Title of book is : "+title);
		System.out.println("Author of book is : "+author);
		System.out.println("Publisher of book is : "+publisher);
		System.out.println("Year of book is : "+year);
		
	}

	public static void main(String[] args) {
		BookAndAuthor o=new BookAndAuthor();
		BookAndAuthor o1=new BookAndAuthor("Concepts of operating system","Silberchatzs","MgHills",2020);
		o.displayBookDetails();
		o1.displayBookDetails();
	}

}
