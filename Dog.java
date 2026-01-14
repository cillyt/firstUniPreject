package org.example;

public class Dog extends Animal{

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    @Override
    public String toString(){
        return "Dog " + super.toString();
    }
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
    public String eat(){
        return "Dog " + name + " is eating";
    }
}
