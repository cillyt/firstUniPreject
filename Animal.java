package org.example;

public class Animal {
    String name;
    String breed;
    public Animal(String name){
        this.name = name;

    }
    @Override
    public String toString() {
        return "name='" + name + "', breed='" + breed + "'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        boolean nameEquals = (name == animal.name) || (name != null && name.equals(animal.name));
        boolean breedEquals = (breed == animal.breed) || (breed != null && breed.equals(animal.breed));
        return nameEquals && breedEquals;
    }
    public String eat(){
        return "Animal " + name + " is eating";
    }

    public void feed(Animal animal){
        if(animal instanceof Dog == true) bark();
        //bark();
    }
     private void bark(){
        System.out.println("Dog " + name + " is barking");
     }

}
