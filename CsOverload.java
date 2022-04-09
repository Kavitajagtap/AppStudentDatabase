package com.Kavita;
public class CsOverload {
    private String name;

    // Method overloading
    public CsOverload(String n){
        name = n;
    }
    public CsOverload(){
        name = "\t\tEnrollment App";
    }

    public void printName(){
        System.out.println(name);
    }
}


