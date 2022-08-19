package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {

    private Map<String, ArrayList<Integer>> familyNumber = new HashMap<>();
    private ArrayList<Integer> phoneNumber;


    public void add(String name, int number1) {
        if (familyNumber.containsKey(name)) {
            phoneNumber = familyNumber.get(name);
            phoneNumber.add(number1);
            familyNumber.put(name, phoneNumber);
        } else {
            phoneNumber = new ArrayList<>();
            phoneNumber.add(number1);
            familyNumber.put(name, phoneNumber);
        }

    }

    public ArrayList<Integer> get(String name) {
        return familyNumber.get(name);
    }

}
