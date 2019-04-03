package com.soft1841.jpt.io;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        String[] content = {"你不喜欢我，", "我非常介意。", "为了取悦你，", "我才活下来！"};
        File file = new File("F:/word.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < content.length; i++) {
                bufferedWriter.write(content[i]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s;
            int k = 0;
            while ((s = bufferedReader.readLine()) != null) {
                k++;
                System.out.println("第" + k + "行" + " " + s);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}