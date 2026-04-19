import java.util.HashMap;

public class FirstLastCharacterMap {

    public static void main(String[] args) {

        String[] words = {"man", "moon", "main"};

        HashMap<String, String> characterMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            String firstCharacter = String.valueOf(currentWord.charAt(0));
            String lastCharacter = String.valueOf(currentWord.charAt(currentWord.length() - 1));

            characterMap.put(firstCharacter, lastCharacter);
        }

        System.out.println(characterMap);
    }
}