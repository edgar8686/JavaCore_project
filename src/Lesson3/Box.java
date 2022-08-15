package Lesson3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> nums = new ArrayList<>();


    public void addFruit(T fruit, int amount) {
        for (int i = 0; i <= amount; i++)
            nums.add(fruit);
    }

    public float getWeight() {
        float sum = 0.0f;
        for (T st : nums) {
            sum += st.getWeight();
        }
        return sum;
    }

    public boolean compare(Box other) {
        if (getWeight() == other.getWeight()) {
            return true;
        } else {
            return false;
        }

    }

    public void pourOut(Box<T> out) {
        out.nums.addAll(nums);
        nums.clear();
    }
}
