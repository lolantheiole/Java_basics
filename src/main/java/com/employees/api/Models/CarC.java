package com.employees.api.Models;

public class CarC {
    String brand;
    int year;
    double price;
    boolean isManual;

    public CarC(String brand, int year, double price, boolean isManual){
        this.brand=brand;
        this.year=year;
        this.price=price;
        this.isManual=isManual;

    }

    public void displayInfo(){
        System.out.println("Enter the brand:" + brand);
        System.out.println("Year manufactured:" + year);
        System.out.println("Enter the price:" + price);
        System.out.println("Is it Manual?:" + isManual);
    }
}
