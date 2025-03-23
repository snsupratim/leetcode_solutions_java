
public class alienlanguage {
    public boolean isAlienSorted(String[] words, String order) {
        // Step 1: Create a mapping of each character to its position in the alien
        // alphabet
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }

        // Step 2: Compare each pair of consecutive words
        for (int i = 0; i < words.length - 1; i++) {
            if (!isInCorrectOrder(words[i], words[i + 1], orderMap)) {
                return false; // If any pair is not in order, return false
            }
        }

        return true; // All pairs are in order
    }

    private boolean isInCorrectOrder(String word1, String word2, int[] orderMap) {
        int len = Math.min(word1.length(), word2.length());

        // Compare each character of both words
        for (int i = 0; i < len; i++) {
            int char1 = orderMap[word1.charAt(i) - 'a'];
            int char2 = orderMap[word2.charAt(i) - 'a'];

            if (char1 < char2) {
                return true; // word1 comes before word2
            } else if (char1 > char2) {
                return false; // word1 comes after word2
            }
        }

        // If all characters match, the shorter word should come first
        return word1.length() <= word2.length();
    }
}
