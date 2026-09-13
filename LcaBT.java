public class LcaBT {
    public static class TreeNode{
        int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
    }

    public static TreeNode LowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return null;
        }
        if(root==p||root==q){
            return root;
        }
        TreeNode left = LowestCommonAncestor(root.left,p,q);
        TreeNode right = LowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }
        if(left!=null){
            return left;
        }
        return right;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);      
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(0);
        TreeNode n6 = new TreeNode(8);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(4);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right=n4;
        n2.left=n5;
        n2.right = n6;
        n4.left = n7;
        n4.right=n8;
        System.out.println(LowestCommonAncestor(root, n3, n6).val);




    }
}
