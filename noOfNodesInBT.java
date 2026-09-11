public class noOfNodesInBT {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    public static int numberOfNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftCount = numberOfNodes(root.left);
        int rightCount = numberOfNodes(root.right);
        return 1+leftCount+rightCount;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2;
        root.right= node3;
        node2.left = node4;
        node2.right = node5;
        System.out.println(numberOfNodes(root));
    }
}
