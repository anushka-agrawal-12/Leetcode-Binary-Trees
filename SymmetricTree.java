

public class SymmetricTree {
      public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean isMirror(TreeNode left, TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return isMirror(left.left, right.right)&&isMirror(left.right, right.left);
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
        System.out.println(isMirror(root.left, root.right));
     }
}
