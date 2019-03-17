package com.bolshak.lessons.lesson6;

public class Lesson6Runner {
    public static void main(String[] args) {

        Cat bob =  new Cat();
        bob.setBread(" Maine coon");
        bob.setName("Bob");
        bob.setAge(2);
        bob.setSpreed(1);
        bob.print();
        System.out.println("Cats over 3 years old:");

        Cat tom = new Cat();
        tom.setBread("Maine coon");

        Cat [] catList = new Cat[3];
        catList [0] = new Cat("Liza", 2, 1, " Maine coon");
        catList [1] = new Cat("Vika", 2, 4, " Maine coon");
        catList [2] = new Cat("Dil", 2, 7, " Maine coon");

        for (Cat element: catList) {
            if (element.getAge() >3 ) {
                element.print();
            }
        }


    }


}
