package day17;

import java.util.HashMap;
import java.util.Map;

public class Day17 {
    public boolean wordPattern(String pattern, String s) {
        String[] stringArray = s.split(" ");
        if (pattern.length() != stringArray.length) {
            return false;
        }
        Map<Character, String> characterMap = new HashMap();
        Map<String, Character> wordsMap = new HashMap();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = stringArray[i];

            if (wordsMap.get(word) != null) {
                if (wordsMap.get(word) != c) {
                    return false;
                }
            } else {
                wordsMap.put(word, c);
            }

            if (characterMap.get(c) != null) {
                if (!characterMap.get(c).equals(word)) {
                    return false;
                }
            } else {
                characterMap.put(c, word);
            }
        }

        return true;
    }
}
