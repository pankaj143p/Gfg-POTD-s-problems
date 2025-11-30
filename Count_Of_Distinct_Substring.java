class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
}

class Solution {
    public static int countSubs(String s) {
        TrieNode root = new TrieNode();
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            TrieNode current = root;
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (!current.children.containsKey(c)) {
                    current.children.put(c, new TrieNode());
                    count++;
                }
                current = current.children.get(c);
            }
        }

        return count;
    }
}
