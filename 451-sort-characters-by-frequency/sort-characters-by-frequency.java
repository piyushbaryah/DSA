
class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String ans = "";

        while(!map.isEmpty()) {

            char maxChar = ' ';
            int maxFreq = 0;

            // Find character with highest frequency
            for(char ch : map.keySet()) {
                if(map.get(ch) > maxFreq) {
                    maxFreq = map.get(ch);
                    maxChar = ch;
                }
            }

            // Add character according to frequency
            for(int i = 0; i < maxFreq; i++) {
                ans += maxChar;
            }

            map.remove(maxChar);
        }

        return ans;
    }
}
