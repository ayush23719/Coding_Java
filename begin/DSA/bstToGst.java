class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        preOrder(root);
        return root;
    }

    public void preOrder(TreeNode root){
        if(root == null){
        return;
        }
        preOrder(root.right);
        sum = sum + root.val;
        root.val = sum;
        preOrder(root.left);
    }
   
}