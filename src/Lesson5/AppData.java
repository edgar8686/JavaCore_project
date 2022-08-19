package Lesson5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private Integer[][] data;

    public String[] getHeader() {
        return header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void readFile(String file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            ArrayList<Integer[]> arrayList = new ArrayList<>();
            header = (bufferedReader.readLine().split(";"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(";");
                Integer[] arr = new Integer[str.length];
                for (int i = 0; i < str.length; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                }
                arrayList.add(arr);
            }
            data = arrayList.toArray(new Integer[][]{});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeCsv(String resultFile) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFile), StandardCharsets.UTF_8));
            StringBuffer oneLine = new StringBuffer();
            for (int i = 0; i < header.length; i++) {
                oneLine.append(header[i]);
                oneLine.append(";");
            }
            bufferedWriter.write(oneLine.toString());
            bufferedWriter.newLine();

            for (int i = 0; i < data.length; i++) {
                Integer[] arr = data[i];
                oneLine.delete(0, oneLine.length());
                for (int j = 0; j < arr.length; j++) {
                    oneLine.append(arr[j]);
                    oneLine.append(";");
                }
                bufferedWriter.write(oneLine.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


