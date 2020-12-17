package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Buddy!");
        System.out.println("How you doing?");

        Person personOne = new Person("Jane", "LA", 18);
        Person personTwo = new Person("Jack", "NY", 22);

        System.out.printf("Our team: \n%s \n%s", personOne, personTwo);

    }
}
