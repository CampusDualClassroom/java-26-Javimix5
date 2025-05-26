package com.campusdual.classroom;


public class Exercise26 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        Contact c1 = new Contact("Javier","González Prados", "669332626");
        phonebook.addContact(c1);

        phonebook.mainMenu();

    }
}