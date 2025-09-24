// User function Template for Java
class Node{
    public Map<Character, Node> children;
    public boolean  isEnd;

    public Node(){
        children = new HashMap<>();
        isEnd = false;
    }
}

class Trie {

    private Node root;

    public Trie() {
        root = new Node();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        Node curr = root;
        Character ch;
        for(int i = 0; i < word.length(); i++){
            ch = word.charAt(i);
             curr.children.putIfAbsent(ch, new Node()); // create if missing
            curr = curr.children.get(ch);              // always move down
        } 
        
        curr.isEnd = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        Node curr = root;
        Character ch;
        for(int i = 0; i < word.length(); i++){
            ch = word.charAt(i);
            if(!curr.children.containsKey(ch)){
                return false;
            }

            curr = curr.children.get(ch);
        } 

        return curr.isEnd;
    }

    // Check if a prefix exists in the Trie
    public boolean isPrefix(String word) {
        Node curr = root;
        Character ch;
        for(int i = 0; i < word.length(); i++){
            ch = word.charAt(i);
            if(!curr.children.containsKey(ch)){
                return false;
            }

            curr = curr.children.get(ch);
        } 

        return true;
    }
}