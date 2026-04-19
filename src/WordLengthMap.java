import java.util.HashMap;

public class WordLengthMap {

    public static void main(String[] args) {

        String[] words = {"this", "and", "that", "and"};

        HashMap<String, Integer> wordLengthMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            wordLengthMap.put(currentWord, currentWord.length());
        }

        System.out.println(wordLengthMap);
    }
}