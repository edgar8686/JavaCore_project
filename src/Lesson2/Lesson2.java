package Lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        String[][] str = new String[][]{
                {
                        "1", "2", "5", "g"
                },
                {
                        "3", "3", "7", "1"
                },
                {
                        "1", "3", "4", "5"
                },
                {
                        "9", "0", "7", "1"
                }
        };
        try {
            System.out.println(array(str));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
        }
    }

    public static int array(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length < 4) {
            throw new MyArraySizeException("Размер массива меньше 4");
        } else if (array.length > 4) {
            throw new MyArraySizeException("Размер массива больше 4");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length < 4) {
                    throw new MyArraySizeException("Двумерный массив меньше 4");
                } else if (array[i].length > 4) {
                    throw new MyArraySizeException("Двумерный массив больше 4");
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.valueOf(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Формат не соответствует целому числу в ячейке array" + "[" + i + "]" + "[" + j + "] " + "хранится " + "(" + array[i][j] + ")");
                }

            }
        }
        return sum;
    }
}

