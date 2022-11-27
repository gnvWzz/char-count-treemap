import java.util.*;

public class CountChar {
    public static void countChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập văn bản: ");
        String document = sc.nextLine();

        String[] words = document.split("\\s");
        TreeMap<String, Integer> wordsMap = new TreeMap<>();
        for (String word : words) {
            String key = word.toLowerCase();
            if (word.length() > 1) {
                if (wordsMap.get(key) == null) {
                    wordsMap.put(key, 1);
                } else {
                    int value = wordsMap.get(key);
                    value++;
                    wordsMap.put(key, value);
                }
            }
        }

        for(Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
    }

    public static void main(String[] args) {
        countChar();
    }
}
