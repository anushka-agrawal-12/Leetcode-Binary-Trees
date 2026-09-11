
public class inorder {
       public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }      
    public static void main(String[] args) {

        // Creating the tree
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        // Connecting the nodes
        root.left = node2;
        root.right = node3;

        node2.left = node4;
        node2.right = node5;

        // Preorder traversal
        inorder(root);
    }
}
