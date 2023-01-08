package lesson05;

import java.util.*;
import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123456"); // !
        phoneBook.add("Васильев", "321456");
        phoneBook.add("Петрова", "234561");
        phoneBook.add("Иванов", "234432"); // !
        phoneBook.add("Петрова", "654321");
        phoneBook.add("Иванов", "345678"); // !

        System.out.println(phoneBook.getBySurname("Иванов"));
    }
}

class PhoneBook {
    private Map<String, List<String>> storage = new HashMap<>();
    public void add(String surname, String phoneNumber) {
        List <String> phoneNumbers = new ArrayList<>();
        if (storage.containsKey(surname)) {
            phoneNumbers.addAll(storage.get(surname));
            phoneNumbers.add(phoneNumber);
            storage.put(surname, phoneNumbers);
        } else {
            phoneNumbers.clear();
            phoneNumbers.add(phoneNumber);
            storage.put(surname, phoneNumbers);
        }
    }
    public List<String> getBySurname(String surname) {
        List <String> phoneNumbers = new ArrayList<>();
        if (storage.containsKey(surname)) {
            phoneNumbers.addAll(storage.get(surname));
            return phoneNumbers;
        } else {
            System.out.println("Такой фамилии в справочнике нет");
            return null;
        }
    }
}


