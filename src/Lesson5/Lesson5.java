package Lesson5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson5 {
    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.readFile("file.csv");
        System.out.println(Arrays.deepToString(appData.getData()));
        System.out.println(Arrays.deepToString(appData.getHeader()));
        appData.writeCsv("new_file.csv");
    }
}
