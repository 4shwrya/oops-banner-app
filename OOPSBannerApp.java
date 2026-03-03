import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }

    // -------- Build Pattern Map --------
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "O O O O",
                "O     O",
                "O     O",
                "O     O",
                "O     O",
                "O     O",
                "O O O O"
        });

        map.put('P', new String[]{
                "P P P",
                "P     P",
                "P P P",
                "P",
                "P",
                "P",
                "P"
        });

        map.put('S', new String[]{
                "S S S",
                "S",
                "S S",
                "    S",
                "    S",
                "    S",
                "S S S"
        });

        return map;
    }

    // -------- Render Function --------
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                if (patternMap.containsKey(ch)) {
                    line.append(patternMap.get(ch)[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}
