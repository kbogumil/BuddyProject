package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Buddy!");
        System.out.println("How you doing?");

        Person personOne = new Person("Jane", "LA", 18);
        Person personTwo = new Person("Jack", "NY", 22);

        System.out.printf("Our team: \n%s \n%s", personOne, personTwo);
        System.out.println();

        Car c1 = new Car("Citroen", "C4", "black", 2006, 210000);
        Car c2 = new Car("Ford", "Focus", "silver",2004, 180000);


        System.out.println(c1);
        System.out.println(c2);


    }
}
