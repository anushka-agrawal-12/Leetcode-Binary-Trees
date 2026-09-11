

public class BinaryTrees {
    public static class TreeNode{
        int val;
        TreeNode left; 
        TreeNode right;


        TreeNode(int val){
            this.val = val;
        }
    }
    public static void createTree(){
        TreeNode root = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        root.left = node2;
        root.right = node3;
    }
    public static void main(String[] args) {
        
    }
}
