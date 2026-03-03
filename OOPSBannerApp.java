import java.util.*;

public class OOPSBannerApp {

    // -------- Character Pattern Class --------
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Store character patterns
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                "O O O O",
                "O     O",
                "O     O",
                "O     O",
                "O     O",
                "O     O",
                "O O O O"
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "P P P",
                "P     P",
                "P P P",
                "P",
                "P",
                "P",
                "P"
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                "S S S",
                "S",
                "S S",
                "    S",
                "    S",
                "    S",
                "S S S"
        }));

        String word = "OOPS";

        // Build banner row by row
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch).getPattern()[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}
