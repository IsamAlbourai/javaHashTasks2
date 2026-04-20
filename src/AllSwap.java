import java.util.HashMap;

public class AllSwap {

    public static void main(String[] args) {

        String[] words = {"ab", "ac"};
        HashMap<String, Integer> positionMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];
            String firstChar = String.valueOf(currentWord.charAt(0));

            if (positionMap.containsKey(firstChar)) {

                int previousIndex = positionMap.get(firstChar);

                String temp = words[i];
                words[i] = words[previousIndex];
                words[previousIndex] = temp;

                positionMap.remove(firstChar);

            }
            else {
                positionMap.put(firstChar, i);
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}