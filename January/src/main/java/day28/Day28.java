package day28;

public class Day28 {
    class Node {
        Node[] children;
        boolean isEnd;

        private Node() {
            children = new Node[26];
        }
    }

    Node root;

    public Day28() {
        root = new Node();
    }

    public void addWord(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.children[ch - 'a'] == null) {
                curr.children[ch - 'a'] = new Node();
            }
            curr = curr.children[ch - 'a'];
        }
        curr.isEnd = true;

    }

    public boolean search(String word) {

        return searchInNode(word, root);
    }

    private boolean searchInNode(String word, Node node) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == '.') {

                Node[] children = node.children;

                for (Node child : children) {

                    if (child != null && searchInNode(word.substring(i + 1), child)) {
                        return true;
                    }

                }
                return false;
            } else if (node.children[ch - 'a'] == null) {
                return false;
            } else {
                node = node.children[ch - 'a'];
            }
        }
        return node.isEnd;

    }
}
