package leetcode;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<String>();
        int commonSoFar[] = new int[26];

        // Initialising array with count of letters of first word
        for (char ch : words[0].toCharArray()) {
            int index = ch - 'a';
            commonSoFar[index]++;
        }

        for (int i = 1; i < words.length; i++) {
            int currentWord[] = new int[26];

            // Initialising array with count of letters of subsequent words and placing min
            // value in commonSoFar array
            for (char ch : words[i].toCharArray()) {
                int index = ch - 'a';
                currentWord[index]++;
            }
            for (int j = 0; j < 26; j++) {
                commonSoFar[j] = Math.min(commonSoFar[j], currentWord[j]);
            }
        }

        // Forming result array from commonSoFar
        for (int i = 0; i < 26; i++) {
            if (commonSoFar[i] != 0) {
                // Finding character from index
                char ch = (char) (i + 97);
                while (commonSoFar[i]-- > 0) {
                    result.add("" + ch);
                }
            }
        }
        return result;
    }
}