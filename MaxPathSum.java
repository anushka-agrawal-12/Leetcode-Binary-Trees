public class MaxPathSum {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }

    }
     public static int maxPathSum(TreeNode root){
        maxSum = Integer.MIN_VALUE;
        maxPath(root);
        return maxSum;
    }
    static int maxSum = Integer.MIN_VALUE;
    public static int maxPath(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftGain = maxPath(root.left);
        int rightGain = maxPath(root.right);
        leftGain = Math.max(0, leftGain);      //for dealing with negative nodes. contribute as 0 rather then negative.
        rightGain = Math.max(0, rightGain);
        int currentSum = leftGain+root.val+rightGain;
        maxSum= Math.max(maxSum, currentSum);
        return root.val+ Math.max(rightGain, leftGain);
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
        System.out.println(maxPathSum(root));
    }
}
