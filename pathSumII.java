import java.util.ArrayList;
import java.util.List;

public class pathSumII {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    public static List<List<Integer>> paths(TreeNode root, int targetSum, path, result){
        List<Integer>path = new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();
        pathSum(root, targetSum, path, result);
        return result;
    }
    public static void pathSum(TreeNode root, int targetSum, List<Integer>path, List<List<Integer>>result){
        if(root==null){
            return;
        }
        path.add(root.val);
        if(root.left==null&&root.right==null&&targetSum==root.val){
            result.add(new ArrayList<>(path));
        }
        pathSum(root.left, targetSum-root.val, path, result);
        pathSum(root.right, targetSum-root.val, path, result);
        path.remove(path.size()-1);
    }
}
