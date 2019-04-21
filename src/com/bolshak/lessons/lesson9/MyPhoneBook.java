package com.bolshak.lessons.lesson9;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {

    private Contact [] contacts = new Contact [10];
    private int count=0;

    public void addPhomeNumber (String name, String number){
        if (count >= contacts.length) {
            return;
        }
        contacts[count] = new Contact(name,number);
        count++;
    }

//    public MyPhoneBook sortByName (){
//      Contact [] newContacts = Arrays.copyOf(contacts, count);
//        Arrays.sort(newContacts, new Comparator<Contact>() {
//            @Override
//            public int compare(Contact o1, Contact o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        return ;
//    }



    private  class Contact {
        private String name;
        private String numberPhone;

        public Contact(String name, String numberPhone) {
            this.name = name;
            this.numberPhone = numberPhone;}


            public String getName () {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public String getNumberPhone () {
                return numberPhone;
            }

            public void setNumberPhone (String numberPhone){
                this.numberPhone = numberPhone;
            }

        @Override
        public String toString() {
            return
                    "name:'" + name + '\'' +
                    ", numberPhone:'" + numberPhone + '\'' ;
        }
    }

    @Override
    public String toString () {

        if (count == 0) {
            return "Contact is empty!";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(contacts[i]+ "\n") ;
        }

        return result.toString();
    }
}


