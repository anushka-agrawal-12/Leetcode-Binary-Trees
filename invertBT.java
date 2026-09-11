public class invertBT {
     public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode invertBT(TreeNode root){
        if(root==null){
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertBT(root.left);
        invertBT(root.right);
        return root;
    }
    public static void print(TreeNode newRoot){      //using preOrder traversal to print inverted bt
        if(newRoot==null){
            return;
        }
        System.out.println(newRoot.val);
        print(newRoot.left);
        print(newRoot.right);
    }

    public static void main(String[] args) {
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
        TreeNode newRoot = invertBT(root);
        print(newRoot);
    }
}
