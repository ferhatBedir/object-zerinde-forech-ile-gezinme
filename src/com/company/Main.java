package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Person> personArrayList = new ArrayList<>();

        Person person1 = new Person("ferhat", "bedir", "998", "5345941750");
        Person person2 = new Person("ali", "bedir", "998", "5345941750");
        Person person3 = new Person("veli", "bedir", "998", "5345941750");
        Person person4 = new Person("ahmet", "bedir", "998", "5345941750");
        Person person5 = new Person("murat", "bedir", "998", "5345941750");
        Person person6 = new Person("kazım", "bedir", "998", "5345941750");
        Person person7 = new Person("ayse", "bedir", "998", "5345941750");
        Person person8 = new Person("fatma", "bedir", "998", "5345941750");
        Person person9 = new Person("zeynep", "bedir", "998", "5345941750");
        Person person10 = new Person("kadır", "bedir", "998", "5345941750");
        Person person11 = new Person("abdullah", "bedir", "998", "5345941750");
        Person person12 = new Person("barıs", "bedir", "998", "5345941750");
        Person person13 = new Person("anıl", "bedir", "998", "5345941750");
        Person person14 = new Person("hakkı", "bedir", "998", "5345941750");
        Person person15 = new Person("mehmet", "bedir", "998", "5345941750");

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);
        personArrayList.add(person6);
        personArrayList.add(person7);
        personArrayList.add(person8);
        personArrayList.add(person9);
        personArrayList.add(person10);
        personArrayList.add(person11);
        personArrayList.add(person12);
        personArrayList.add(person13);
        personArrayList.add(person14);
        personArrayList.add(person15);


        personArrayList.forEach(newPerson -> {
            System.out.println(newPerson.getName() + " " + newPerson.getSurname());
        });


    }
}
