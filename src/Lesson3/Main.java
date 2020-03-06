package Lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Caitlyn", "Rengar", "Garen", "Ziggs", "Vayne", "Kha", "Rogue", "Garen", "Vayne", "Olaf", "Rengar"));
        System.out.println(list);

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : list) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        System.out.println(hashMap);


        // Тел. книга
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Oleg", "111222");
        phoneBook.add("Sasha", "222333");
        phoneBook.add("Lena", "333444");
        phoneBook.add("Sasha", "444555");
        phoneBook.add("Petr", "555666");

        phoneBook.info();

        System.out.println("У Саши два номера: " + phoneBook.get("Sasha"));
    }
}
