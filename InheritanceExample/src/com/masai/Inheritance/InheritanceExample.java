package com.masai.Inheritance;

//Superclass (Base class)
class Animal {
 String name;

// constructor
 Animal(String name) {
     this.name = name;
 }

 void eat() {
     System.out.println(name + " is eating.");
 }

 void sleep() {
     System.out.println(name + " is sleeping.");
 }
}

//Subclass (Derived class)
class Dog extends Animal {
 Dog(String name) {
     super(name); // Call the constructor of the superclass because Constructor doesn't inherited
 }

 void bark() {
     System.out.println(name + " is barking.");
 }
}

//Subclass (Derived class)
class Cat extends Animal {
 Cat(String name) {
     super(name); // Call the constructor of the superclass because Constructor doesn't inherited
 }

 void meow() {
     System.out.println(name + " is meowing.");
 }
}

public class InheritanceExample {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy");
     Cat cat = new Cat("Whiskers");

     dog.eat();
     dog.sleep();
     dog.bark();

     cat.eat();
     cat.sleep();
     cat.meow();
 }
}

