package practice13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        String fileContent = "Apple Elephant Ball Cat Dog Nest Tiger Lion Orange";

        Scanner scanner = new Scanner(fileContent);

        String resultLine = getLine(scanner);
        System.out.println("Исходные слова: " + fileContent);
        System.out.println("Результат: " + resultLine);

        scanner.close();
    }

    public static String getLine(Scanner scanner) {
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        if (words.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        String currentWord = words.remove(0);
        result.append(currentWord);

        boolean found = true;
        while (found && !words.isEmpty()) {
            found = false;
            char lastChar = Character.toLowerCase(currentWord.charAt(currentWord.length() - 1));

            for (int i = 0; i < words.size(); i++) {
                String nextWord = words.get(i);
                char firstChar = Character.toLowerCase(nextWord.charAt(0));

                if (lastChar == firstChar) {
                    result.append(" ").append(nextWord);
                    currentWord = nextWord;
                    words.remove(i);
                    found = true;
                    break;
                }
            }
        }

        return result.toString();
    }
}