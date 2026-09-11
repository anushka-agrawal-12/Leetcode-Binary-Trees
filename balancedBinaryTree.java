public class balancedBinaryTree {
     public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDepth=maxDepth(root.left);
        int rightdepth=maxDepth(root.right);
        return 1+ Math.max(leftDepth,rightdepth);

    }
    public static boolean balancedBT(TreeNode root){
        if(root==null){
            return true;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if(Math.abs(leftDepth-rightDepth)>1){
            return false;
        }
        return balancedBT(root.left)&&balancedBT(root.right);
    }
     public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2;
        root.right= node3;
        node2.left = node4;
        node2.right = node5;
        System.out.println(balancedBT(root));
        
    }
}
