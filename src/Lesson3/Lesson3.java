package Lesson3;

import java.util.ArrayList;

public class Lesson3 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        Box<Apple> appleBox1 = new Box<Apple>();
        Box<Orange> orangeBox = new Box<Orange>();
        appleBox.addFruit(new Apple(), 16);
        appleBox1.addFruit(new Apple(), 13);
        orangeBox.addFruit(new Orange(), 10);
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox.compare(orangeBox));
        appleBox1.pourOut(appleBox);


    }

    public static Object[] changeArray(Object[] array) {
        Object tmp;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = tmp;
            i++;
        }
        return array;
    }


}
