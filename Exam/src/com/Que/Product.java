package com.Que;

import java.util.Scanner;

public class Product {
   int pid;
   String pname;
   double price;
   int quantity;

    public Product(int pid, String pname, double price, int quantity) throws UserDefinedExc {
        if (quantity <= 0) {
            throw new UserDefinedExc("Quantity cannot be negative OR ZERO");
        }
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
    }

    

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws UserDefinedExc {
        if (quantity < 0) {
            throw new UserDefinedExc("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + "]";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int pid = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter product name: ");
        String pname = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();

        try {
            Product product = new Product(pid, pname, price, quantity);
            System.out.println("Product ordered successfully!");
            System.out.println(product);
        } catch (UserDefinedExc e) {
            System.out.println(e.getMessage());
        }
         
               
    }
}
