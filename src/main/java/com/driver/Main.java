package com.driver;

class A {
    public String meth() {

        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {

        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new B(); // Create object of class B and assign it to type A
        System.out.println(objA.meth()); // Call method meth of class A
        
        B objB = new B(); // Create object of class B
        System.out.println(objB.meth()); // Call overridden method meth of class B
    }
}
