import java.util.HashMap;

public class WordFrequencyMap {

    public static void main(String[] args) {

        String[] words = {"a", "b", "a", "c", "b"};

        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            if (frequencyMap.containsKey(currentWord)) {
                frequencyMap.compute(currentWord, (k, currentCount) -> currentCount + 1);
            } else {
                frequencyMap.put(currentWord, 1);
            }
        }

        System.out.println(frequencyMap);
    }
}
