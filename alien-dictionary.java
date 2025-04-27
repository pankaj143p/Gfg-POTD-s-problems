
// User function Template for Java

class Solution {
    public String findOrder(String[] words) {
        // Step 1: Create a graph
        Map<Character, List<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();
        
        // Initialize the graph
        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new ArrayList<>());
                inDegree.putIfAbsent(c, 0);
            }
        }
        
        // Step 2: Build the graph
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int len = Math.min(word1.length(), word2.length());
            boolean foundDifference = false;
            
            for (int j = 0; j < len; j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);
                if (c1 != c2) {
                    graph.get(c1).add(c2);
                    inDegree.put(c2, inDegree.get(c2) + 1);
                    foundDifference = true;
                    break;
                }
            }
            
            // Check for invalid case where word2 is a prefix of word1
            if (!foundDifference && word1.length() > word2.length()) {
                return "";
            }
        }
        
        // Step 3: Topological Sort using Kahn's Algorithm
        Queue<Character> queue = new LinkedList<>();
        for (char c : inDegree.keySet()) {
            if (inDegree.get(c) == 0) {
                queue.add(c);
            }
        }
        
        StringBuilder order = new StringBuilder();
        while (!queue.isEmpty()) {
            char c = queue.poll();
            order.append(c);
            for (char neighbor : graph.get(c)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.add(neighbor);
                }
            }
        }
        
        // If the order length is not equal to the number of unique characters, there is a cycle
        if (order.length() != inDegree.size()) {
            return "";
        }
        
        return order.toString();
    }
}
