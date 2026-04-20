import java.util.HashMap;

public class WordMultiple {

    public static void main(String[] args) {

        String[] words = {"a", "b", "a", "c", "b"};

        HashMap<String, Integer> countMap = new HashMap<>();
        HashMap<String, Boolean> resultMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            if (countMap.containsKey(currentWord)) {
                int count = countMap.get(currentWord) + 1;
                countMap.put(currentWord, count);
            } else {
                countMap.put(currentWord, 1);
            }
        }

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];
            int count = countMap.get(currentWord);

            if (count >= 2) {
                resultMap.put(currentWord, true);
            } else {
                resultMap.put(currentWord, false);
            }
        }

        System.out.println(resultMap);
    }
}