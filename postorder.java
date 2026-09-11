public class postorder {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
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
        preOrder(root);
    }
}
