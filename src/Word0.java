import java.util.HashMap;

public class Word0 {

    public static void main(String[] args) {

        String[] arr = {"a", "b", "c"};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 0);
        }

        System.out.println(map);
    }
}