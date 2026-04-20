import java.util.HashMap;

public class FirstSwap {

    public static void main(String[] args) {

        String[] words = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        HashMap<String, Integer> positionMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];
            String firstChar = String.valueOf(currentWord.charAt(0));

            if (positionMap.containsKey(firstChar)) {

                int previousIndex = positionMap.get(firstChar);

                if (previousIndex != -1) {

                    String temp = words[i];
                    words[i] = words[previousIndex];
                    words[previousIndex] = temp;

                    positionMap.put(firstChar, -1);
                }

            } else {
                positionMap.put(firstChar, i);
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}