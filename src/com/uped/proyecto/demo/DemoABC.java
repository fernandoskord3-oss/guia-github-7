package com.uped.proyecto.demo;

// Ejercicio 8.1: predicción de salida
class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }
}

class C extends B {
    public C() {
        System.out.println("C");
    }
}

public class DemoABC {
    public static void main(String[] args) {
        new C();
    }
}

