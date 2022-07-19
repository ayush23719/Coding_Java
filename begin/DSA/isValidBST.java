class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root,null,null);
    }
    
    public boolean validate(TreeNode root, Integer max,Integer min){
        if(root==null){
            return true;
        }
        
        if(max!=null && root.val>=max || min!=null && root.val<=min){
            return false;
        }
        
        return validate(root.left,root.val,min) && validate(root.right,max,root.val);   
        
    }
}
