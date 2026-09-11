import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class levelOrderTraversal{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }

    }
    public static ArrayList<Integer> levelOrder(TreeNode root){
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode>queue= new LinkedList<>();
        ArrayList<Integer>result=new ArrayList();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            result.add(current.val);
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }

        }
        return result;
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
        System.out.println(levelOrder(root));
    }
}
