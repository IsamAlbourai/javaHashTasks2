import java.util.HashMap;

public class WordAppend {

    public static void main(String[] args) {

        String[] words = {"a", "b", "a", "c", "a", "d", "a"};

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            if (wordCountMap.containsKey(currentWord)) {
                int count = wordCountMap.get(currentWord) + 1;
                wordCountMap.put(currentWord, count);

                if (count % 2 == 0) {
                    result = result + currentWord;
                }

            }
            else {
                wordCountMap.put(currentWord, 1);
            }
        }

        System.out.println(result);
    }
}