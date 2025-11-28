/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int max=0;
    public int maxDepth(Node root) {
        dfs(root,1);
        return max;
    }

    public void dfs(Node root,int depth){

        if(root==null){
            return;
        }
        max=Math.max(max,depth);
        for(Node n:root.children){
            dfs(n,depth+1);
        }

    }
}