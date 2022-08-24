package Lesson1;

import java.util.Random;

public class Course {
    private int[] obstacles;
    private int power;

    public Course() {
        this.obstacles = new int[4];
        this.power = 0;
    }


    public int getPower() {
        return power;
    }

    public void doIt(Team team) {
        Random random = new Random();
        for (int i = 0; i < team.getName().length; i++) {
            int arc = random.nextInt(11);
            power += arc;
        }
        for (int j = 0; j < obstacles.length; j++) {
            int arc = random.nextInt(11);
            obstacles[j] = arc;
        }
        for (int i = 0; i < obstacles.length; i++) {
            power -= obstacles[i];
        }
        if (power > 0) {
            System.out.println("Препятствия пройдены силы = " + power);
            System.out.println("Поздравляем!!!");
        } else if (power <= 0) {
            System.out.println("Задание провалено, все выдохлись, силы = " + power);
            System.out.println("Позор!!!");
        }
    }
}
