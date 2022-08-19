package Lesson4;

import java.util.*;

public class Lesson4 {
    public static void main(String[] args) {
        Map<String, Integer> nameRepeat = new HashMap<>();
        String[] name = new String[]{"Дмитрий", "Иван", "Юля", "Иван", "Алекcандр", "Иван", "Дмитрий", "Алексей", "Марина", "Анна", "Петр"};
        for (int i = 0; i < name.length; i++) {
            if (nameRepeat.containsKey(name[i]))
                nameRepeat.put(name[i], nameRepeat.get(name[i]) + 1);
            else
                nameRepeat.put(name[i], 1);
        }
        System.out.println(nameRepeat);

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Михаил", 893230937);
        telephoneDirectory.add("Ирина", 893201654);
        telephoneDirectory.add("Ирина", 789342687);
        telephoneDirectory.add("Андрей", 675839844);
        telephoneDirectory.add("Алексей", 943987847);
        telephoneDirectory.add("Анна", 846428774);
        telephoneDirectory.add("Андрей", 776665558);
        System.out.println(telephoneDirectory.get("Ирина"));
    }

}

