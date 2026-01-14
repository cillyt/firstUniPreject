package org.example;

public class Main {
    public static void main(String[] args) {
    Dog d = new Dog("Rex", "Retriever");
    Dog d1 = new Dog("Rex", "Retriever");
    System.out.println(d);

    System.out.println(d.equals(d1));
    System.out.println(d1.eat());
    d1.feed(d1);
    d.feed(d);
    System.out.println(d.eat());

    }
}
//EBEBEBBEEBB
//lalalala
//lelele