package com.Kavita;
public class Overrid {
    public void ovMethod()
    {
        System.out.println("***************************************************");
    }
}

//Inheritance
class Demo extends Overrid{
    public void ovMethod(){
        //Super keyword
        super.ovMethod();
    }
}


