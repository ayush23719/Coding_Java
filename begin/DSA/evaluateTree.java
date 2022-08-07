class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null){
            return root.val == 0? false : true;
        }
        
        boolean leftChild = evaluateTree(root.left);
        boolean rightChild = evaluateTree(root.right);
        if(root.val == 2){
            return leftChild || rightChild;
        }
            
        return leftChild && rightChild;

    }
}