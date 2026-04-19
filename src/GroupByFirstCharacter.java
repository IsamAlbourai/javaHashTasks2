import java.util.HashMap;

public class GroupByFirstCharacter {

    public static void main(String[] args) {

        String[] words = {"salt", "tea", "soda", "toast"};

        HashMap<String, String> groupedMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];
            String firstCharacter = String.valueOf(currentWord.charAt(0));

            if (groupedMap.containsKey(firstCharacter)) {
                String existingValue = groupedMap.get(firstCharacter);
                groupedMap.put(firstCharacter, existingValue + currentWord);
            } else {
                groupedMap.put(firstCharacter, currentWord);
            }
        }

        System.out.println(groupedMap);
    }
}