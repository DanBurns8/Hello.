package com.company;

public class YummyFood {
    public static void main(String[] args) {
        System.out.print("Yummy ");
        System.out.println("Food");
        chocolate();
        chocolate();
        Icecream();
        System.out.println("Done");
    }
    public static void chocolate(){
        System.out.println("chocolate");
    }
    public static void Icecream(){
        System.out.println("Sherbert is better");
        chocolate();
        System.out.println("It was not yummy");
    }
}
