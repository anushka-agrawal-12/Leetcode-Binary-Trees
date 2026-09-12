public class pathSum {
    public static boolean validPath(TreeNode root, int targetSum){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return targetSum==root.val;
        }
        return validPath(root.left, targetSum-root.val)||validPath(root.right, targetSum-root.val);
    }
}
