class Solution {
    public boolean isValid(String s) {
        Stack<Character> opSt = new Stack<>();

        Set<Character> opening = new HashSet<>();
        opening.add('{');
        opening.add('[');
        opening.add('(');

        Set<Character> closing = new HashSet<>();
        closing.add('}');
        closing.add(']');
        closing.add(')');

        Map<Character, Character> paranMap = new HashMap<>();

        paranMap.put('}', '{');
        paranMap.put(']', '[');
        paranMap.put(')', '(');

        for (var c : s.toCharArray()) {
            if (opening.contains(c)) {
                opSt.push(c);
            }
            else if (opSt.isEmpty()) {
                return false;
            }
            else {
                char op = opSt.pop();
                if (paranMap.get(c) != op) {
                    return false;
                }
            }
        }

        if(!opSt.isEmpty()) {
            return false;
        }
        return true;
    }
}
