class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<List<Character>, List<String>> setToAnagrams = new HashMap<>();

        for (var s : strs) {
            List<Character> chars = stringToCharList(s);

            setToAnagrams
                    .computeIfAbsent(chars, k -> new ArrayList<>())
                    .add(s);
        }

        for (var key : setToAnagrams.keySet()) {
            ans.add(setToAnagrams.get(key));
        }

        return ans;
    }

    public List<Character> stringToCharList(String s) {
        List<Character> chars = new ArrayList<>();

        for (var c : s.toCharArray()) {
            chars.add(c);
        }

        Collections.sort(chars);

        return chars;
    }
}


