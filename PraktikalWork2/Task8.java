package PraktikalWork2;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {

        String[] words = {
                "Java",
                "Python",
                "C++",
                "JavaScript",
                "C#"
        };

        System.out.println("До:");
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length / 2; i++) {

            String temp = words[i];

            words[i] = words[words.length - 1 - i];

            words[words.length - 1 - i] = temp;
        }

        System.out.println("После:");
        System.out.println(Arrays.toString(words));
    }
}